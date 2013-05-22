


package edu.ucr.c3.phr.controller.user.forms;

import java.util.Date;



public class AddEditMeasurementsForm {
	
	private int id;
	private String value;
	private String Unit;
	private String type;
	private Date date;
	private String[]current_probelm={"Yes","No"};
	private String is_current_problem;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCurrent_probelm(String[] current_probelm) {
		this.current_probelm = current_probelm;
	}
	public String[] getCurrent_probelm() {
		return current_probelm;
	}
	public void setIs_current_problem(String is_current_problem) {
		this.is_current_problem = is_current_problem;
	}
	public String getIs_current_problem() {
		return is_current_problem;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	


}
