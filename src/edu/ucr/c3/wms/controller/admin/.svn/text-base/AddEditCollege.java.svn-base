package edu.ucr.c3.wms.controller.admin;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.business.admin.InactivationService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.CollegeForm;
import edu.ucr.c3.wms.domain.College;

public class AddEditCollege extends BaseAction implements ModelDriven, Preparable {
	
	private CollegeForm form = new CollegeForm();
	
	public String execute()throws Exception{
		return SUCCESS;
	}

	public String input() throws SBRException{
		if(getParameter("id") != null){//this is an edit, so populate fields
			AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
			College col = svc.retrieveCollege(Integer.valueOf(getParameter("id")));
			if(col!=null){
				form.setColId(col.getId());
				form.setUnivId(col.getUniversity().getId());
				form.setName(col.getName());
				form.setUrl(col.getHomeUrl());
			}
		}
		return INPUT;
	}
	
	public String delete() throws SBRException{
		InactivationService iSvc = (InactivationService)getService("inactivationService");
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		College col = svc.retrieveCollege(Integer.valueOf(getParameter("id")));
		if(col!=null){
			iSvc.deleteCollege(col);
		}
		return SUCCESS;
	}
	
	public String save() throws SBRException{
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		College col = null;
		if(form.getColId() > 0){//this is an edit
			col = svc.retrieveCollege(form.getColId());
		}
		else{//this is a new addition
			col = new College();
			col.setActive((short) 1);
		}
		if(col != null){//set fields to match edit form, then save
			col.setHomeUrl(form.getUrl());
			col.setName(form.getName());
			col.setUniversity(svc.retrieveUniversity(form.getUnivId()));
			svc.saveCollege(col);
		}
		return SUCCESS;
	}
	
	public Object getModel() {
		return form;
	}

	public CollegeForm getForm() {
		return form;
	}

	public void setForm(CollegeForm form) {
		this.form = form;
	}

	public void prepare() throws Exception {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		form.setUnivs(svc.retrieveAllUniversities());
	}

}
