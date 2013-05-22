package edu.ucr.c3.wms.controller.manager.forms;

import edu.ucr.c3.wms.helper.validators.BaseValidator;


public class WorkshopForm {
	
	private int workshopId = BaseValidator.NOT_SELECTED;
	private String name;
	private String description;
	private String comments;
	private boolean allowMult = false;
	
	public int getWorkshopId() {
		return workshopId;
	}
	public void setWorkshopId(int workshopId) {
		this.workshopId = workshopId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isAllowMult() {
		return allowMult;
	}
	public void setAllowMult(boolean allowMult) {
		this.allowMult = allowMult;
	}
}
	
	
	