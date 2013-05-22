package edu.ucr.c3.wms.controller.admin.forms;

import java.util.List;

import edu.ucr.c3.wms.helper.validators.BaseValidator;
import edu.ucr.c3.wms.domain.University;

public class CollegeForm {
	
	private int colId = BaseValidator.NOT_SELECTED;
	private int univId = BaseValidator.NOT_SELECTED;
	private String name;
	private String url;
	private List<University> univs;
	
	public void setColId(int colId) {
		this.colId = colId;
	}
	public int getColId() {
		return colId;
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
	public void setUnivId(int univId) {
		this.univId = univId;
	}
	public int getUnivId() {
		return univId;
	}
	public void setUnivs(List<University> univs) {
		this.univs = univs;
	}
	public List<University> getUnivs() {
		return univs;
	}

}
