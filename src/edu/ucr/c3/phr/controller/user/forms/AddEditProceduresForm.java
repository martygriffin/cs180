


package edu.ucr.c3.phr.controller.user.forms;

import java.util.Date;



public class AddEditProceduresForm {
	
	private int id;
	private String name;
	private String location;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	


}
