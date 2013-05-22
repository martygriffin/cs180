package edu.ucr.c3.wms.controller.admin;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import java.sql.Timestamp;
import java.util.Date;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.business.admin.InactivationService;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.ManagerForm;
import edu.ucr.c3.wms.domain.Manager;

public class AddEditManager extends BaseAction implements ModelDriven, Preparable {
	
	private ManagerForm form = new ManagerForm();
	
	public String execute()throws Exception{
		return SUCCESS;
	}

	public String input() throws SBRException{
		if(getParameter("id") != null){//this is an edit, so populate fields
			UserService svc = (UserService)getService("userService");
			Manager man = svc.retrieveManager(Integer.valueOf(getParameter("id")));
			if(man != null){
				form.setManId(man.getId());
				form.setDeptId(man.getDepartment().getId());
				form.setUserName(man.getUserName());
				form.setPassword("Enter new password.");
				form.setFirstName(man.getFirstName());
				form.setLastName(man.getLastName());
				form.setEmail(man.getEmail());
				form.setTelephone(man.getTelephone());
				form.setComments(man.getComments());
			}
		}
		return INPUT;
	}
	
	public String delete() throws SBRException{
		InactivationService iSvc = (InactivationService)getService("inactivationService");
		UserService svc = (UserService)getService("userService");
		Manager man = svc.retrieveManager(Integer.valueOf(getParameter("id")));
		if(man!=null){
			iSvc.deleteManager(man);
		}
		return SUCCESS;
	}
	
	public String save() throws SBRException{
		UserService svc = (UserService)getService("userService");
		AdminLevelService aSvc = (AdminLevelService)getService("adminLevelService");
		Manager man = null;
		if(form.getManId() > 0){//this is an edit
			man = svc.retrieveManager(form.getManId());
		}
		else{//this is a new addition
			man = new Manager();
			man.setActive((short) 1);
		}
		if(man != null){//set fields to match edit form, then save		
			man.setDepartment(aSvc.retrieveDepartment(form.getDeptId()));
			man.setUserName(form.getUserName());
			man.setPassword(edu.ucr.c3.chasstel.tools.Tools.MD5(form.getPassword()));
			man.setFirstName(form.getFirstName());
			man.setLastName(form.getLastName());
			man.setEmail(form.getEmail());
			man.setTelephone(form.getTelephone());
			man.setComments(form.getComments());
			man.setTimeStamp(new Timestamp(new Date().getTime()));
			svc.saveManager(man);
		}
		return SUCCESS;
	}
	
	public Object getModel() {
		return form;
	}

	public ManagerForm getForm() {
		return form;
	}

	public void setForm(ManagerForm form) {
		this.form = form;
	}

	public void prepare() throws Exception {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		form.setDepts(svc.retrieveAllDepartments());
	}

}
