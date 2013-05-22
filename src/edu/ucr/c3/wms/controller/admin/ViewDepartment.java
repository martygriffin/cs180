package edu.ucr.c3.wms.controller.admin;

import java.util.List;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.Department;

public class ViewDepartment extends BaseAction {
	
	private List<Department> departments;
	
	public String execute() throws SBRException {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		departments = svc.retrieveAllDepartments();
		return SUCCESS;
	}
	
	public List<Department> getDepartments() {
		return departments;
	}
	
}
