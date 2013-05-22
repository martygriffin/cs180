package edu.ucr.c3.wms.controller.manager.forms;

import java.util.Set;
import java.util.Set;

import edu.ucr.c3.wms.helper.validators.BaseValidator;

public class ViewSessionForm{
	private int sessionId = BaseValidator.NOT_SELECTED;
	private Set students;
	private Set attended;
	
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public Set getStudents() {
		return students;
	}
	public Set getAttended() {
		return attended;
	}
	public void setAttended(Set attended) {
		this.attended = attended;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
}
