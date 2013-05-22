package edu.ucr.c3.wms.controller.admin;

import com.opensymphony.xwork2.ModelDriven;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.business.admin.InactivationService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.UniversityForm;
import edu.ucr.c3.wms.domain.University;

public class AddEditUniversity extends BaseAction implements ModelDriven {
	
	private UniversityForm form = new UniversityForm();
	
	public String execute()throws Exception{
		return SUCCESS;
	}

	public String input() throws SBRException{
		if(getParameter("id") != null){//this is an edit, so populate fields
			AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
			University univ = (svc.retrieveUniversity(Integer.valueOf(getParameter("id"))));
			if(univ != null){
				form.setUnivId(univ.getId());
				form.setName(univ.getName());
				form.setUrl(univ.getHomeUrl());
				form.setSidRule(univ.getSidRule());
			}
		}
		return INPUT;
	}
	
	public String delete() throws SBRException{
		InactivationService iSvc = (InactivationService)getService("inactivationService");
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		University univ = svc.retrieveUniversity(Integer.valueOf(getParameter("id")));
		if(univ!=null){
			iSvc.deleteUniversity(univ);
		}
		return SUCCESS;
	}
	
	public String save() throws SBRException{
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		University univ = null;
		if(form.getUnivId() > 0){//this is an edit
			univ = svc.retrieveUniversity(form.getUnivId());
		}
		else{//this is a new addition
			univ = new University();
			univ.setActive((short) 1);
		}
		if(univ != null){//set fields to match edit form, then save
			univ.setHomeUrl(form.getUrl());
			univ.setName(form.getName());
			univ.setSidRule(form.getSidRule());
			svc.saveUniversity(univ);
		}
		return SUCCESS;
	}
	
	public Object getModel() {
		return form;
	}

	public UniversityForm getForm() {
		return form;
	}

	public void setForm(UniversityForm form) {
		this.form = form;
	}

}
