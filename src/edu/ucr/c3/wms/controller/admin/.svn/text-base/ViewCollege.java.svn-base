package edu.ucr.c3.wms.controller.admin;

import java.util.List;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.College;

public class ViewCollege extends BaseAction {
	
	private List<College> colleges;
	
	public String execute() throws SBRException {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		colleges = svc.retrieveAllColleges();
		return SUCCESS;
	}
	
	public List<College> getColleges() {
		return colleges;
	}
	
}
