package edu.ucr.c3.wms.controller.student.forms;

import java.sql.Timestamp;
import java.util.List;



public class newStudentForm
{
	private String SID;
	private String netID;
	private String first_name;
	private String last_name;
	private String middle_name;
	private String email;
	private String major;
	private String university;
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getNetID() {
		return netID;
	}
	public void setNetID(String netID) {
		this.netID = netID;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String firstName) {
		first_name = firstName;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String lastName) {
		last_name = lastName;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middleName) {
		middle_name = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
}