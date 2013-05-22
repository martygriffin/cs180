package edu.ucr.c3.wms.controller.admin;

import java.util.List;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.Manager;

public class ViewManager extends BaseAction {
	
	private List<Manager> managers;
	
	public String execute() throws SBRException {
		UserService svc = (UserService)getService("userService");
		managers = svc.retrieveAllManagers();
		return SUCCESS;
	}
	
	public List<Manager> getManagers() {
		return managers;
	}
	
}
