package edu.ucr.c3.wms.controller.admin.forms;

import edu.ucr.c3.wms.helper.validators.BaseValidator;

public class UniversityForm {
	
	private int univId = BaseValidator.NOT_SELECTED;
	private String name;
	private String url;
	private String sidRule;
	
	public void setUnivId(int univId) {
		this.univId = univId;
	}
	public int getUnivId() {
		return univId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSidRule() {
		return sidRule;
	}
	public void setSidRule(String sidRule) {
		this.sidRule = sidRule;
	}

}
