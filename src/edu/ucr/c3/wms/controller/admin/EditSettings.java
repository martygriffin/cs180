package edu.ucr.c3.wms.controller.admin;

import com.opensymphony.xwork2.ModelDriven;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.SettingsForm;
import edu.ucr.c3.wms.domain.SystemSetting;

public class EditSettings extends BaseAction implements ModelDriven {
	
	private SettingsForm form = new SettingsForm();
	
	public String execute()throws Exception{
		return SUCCESS;
	}

	public String input() throws SBRException{
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		SystemSetting set = svc.retrieveSystemSettingByName("footer");
		form.setFooterName(set.getSettingName());
		form.setFooterValue(set.getSettingValue());
		form.setFooterComments(set.getComments());
		return INPUT;
	}
	
	public String save() throws SBRException{
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		SystemSetting set = svc.retrieveSystemSettingByName("footer");
		set.setSettingValue(form.getFooterValue());
		set.setComments(form.getFooterComments());
		svc.saveSystemSetting(set);
		session.put("footer", form.getFooterValue());
		return SUCCESS;
	}
	
	public Object getModel() {
		return form;
	}

	public SettingsForm getForm() {
		return form;
	}

	public void setForm(SettingsForm form) {
		this.form = form;
	}

}
