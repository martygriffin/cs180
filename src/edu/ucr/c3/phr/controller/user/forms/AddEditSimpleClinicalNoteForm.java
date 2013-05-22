


package edu.ucr.c3.phr.controller.user.forms;

import java.util.Date;



public class AddEditSimpleClinicalNoteForm {
	
	private int id;
	private String[]current_probelm={"Yes","No"};
	private String is_current_problem;
	private Date date;
	private String type;
	private String location;
	private String special;
	private String chiefComplaint;
	private String content;
	
	
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getChiefComplaint() {
		return chiefComplaint;
	}
	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	


}
