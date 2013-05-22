package edu.ucr.c3.wms.controller.admin;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.business.admin.InactivationService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.DepartmentForm;
import edu.ucr.c3.wms.domain.Department;

public class AddEditDepartment extends BaseAction implements ModelDriven, Preparable {
	
	private DepartmentForm form = new DepartmentForm();
	
	public String execute()throws Exception{
		return SUCCESS;
	}

	public String input() throws SBRException{
		if(getParameter("id") != null){//this is an edit, so populate fields
			AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
			Department dept = svc.retrieveDepartment(Integer.valueOf(getParameter("id")));
			if(dept != null){
				form.setDeptId(dept.getId());
				form.setColId(dept.getCollege().getId());
				form.setName(dept.getName());
				form.setServName(dept.getServiceName());
				form.setUrl(dept.getHomeUrl());
				form.setAuthKey(dept.getAuthKey());
			}
		}
		return INPUT;
	}
	
	public String delete() throws SBRException{
		InactivationService iSvc = (InactivationService)getService("inactivationService");
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		Department dept = svc.retrieveDepartment(Integer.valueOf(getParameter("id")));
		if(dept!=null){
			iSvc.deleteDepartment(dept);
		}
		return SUCCESS;
	}
	
	public String save() throws SBRException{
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		Department dept = null;
		if(form.getDeptId() > 0){//this is an edit
			dept = svc.retrieveDepartment(form.getDeptId());
		}
		else{//this is a new addition
			dept = new Department();
			dept.setActive((short) 1);
		}
		if(dept != null){//set fields to match edit form, then save
			dept.setCollege(svc.retrieveCollege(form.getColId()));
			dept.setName(form.getName());
			dept.setHomeUrl(form.getUrl());
			dept.setAuthKey(form.getAuthKey());
			dept.setServiceName(form.getServName());
			svc.saveDepartment(dept);
		}
		return SUCCESS;
	}
	
	public Object getModel() {
		return form;
	}

	public DepartmentForm getForm() {
		return form;
	}

	public void setForm(DepartmentForm form) {
		this.form = form;
	}

	public void prepare() throws Exception {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		form.setCols(svc.retrieveAllColleges());
	}

}
