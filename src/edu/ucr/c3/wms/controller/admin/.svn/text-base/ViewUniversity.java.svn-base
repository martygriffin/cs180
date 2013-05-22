package edu.ucr.c3.wms.controller.admin;

import java.util.List;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.University;

public class ViewUniversity extends BaseAction {
	
	private List<University> universities;
	
	public String execute() throws SBRException {
		AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		universities = svc.retrieveAllUniversities();
		return SUCCESS;
	}
	
	public List<University> getUniversities() {
		return universities;
	}
	
}
