


package edu.ucr.c3.phr.controller.user.forms;

import java.util.Date;
import java.util.List;

import edu.ucr.c3.phr.domain.Allergys;
import edu.ucr.c3.phr.domain.Dicom;
import edu.ucr.c3.phr.domain.Files;
import edu.ucr.c3.phr.domain.Immunization;
import edu.ucr.c3.phr.domain.Insurance;
import edu.ucr.c3.phr.domain.Measurement;
import edu.ucr.c3.phr.domain.Medication;
import edu.ucr.c3.phr.domain.Notes;
import edu.ucr.c3.phr.domain.Problem;
import edu.ucr.c3.phr.domain.Procedures;
import edu.ucr.c3.phr.domain.Results;
import edu.ucr.c3.phr.domain.SimpleClinicalNote;
import edu.ucr.c3.phr.domain.Vitals;



public class AddEditInsuranceForm {
	
private int id;
private String company;
private String plan_name;
private String plan_id;
private String group_num;
private String member_num;
private String policy_num;
private String phone;
private Date start_date;
private Date end_date;
private String[]current_probelm={"Yes","No"};
private String is_current_problem;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIs_current_problem() {
	return is_current_problem;
}
public void setIs_current_problem(String is_current_problem) {
	this.is_current_problem = is_current_problem;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getPlan_name() {
	return plan_name;
}
public void setPlan_name(String plan_name) {
	this.plan_name = plan_name;
}
public String getPlan_id() {
	return plan_id;
}
public void setPlan_id(String plan_id) {
	this.plan_id = plan_id;
}
public String getGroup_num() {
	return group_num;
}
public void setGroup_num(String group_num) {
	this.group_num = group_num;
}
public String getMember_num() {
	return member_num;
}
public void setMember_num(String member_num) {
	this.member_num = member_num;
}
public String getPolicy_num() {
	return policy_num;
}
public void setPolicy_num(String policy_num) {
	this.policy_num = policy_num;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
public String[] getCurrent_probelm() {
	return current_probelm;
}
public void setCurrent_probelm(String[] current_probelm) {
	this.current_probelm = current_probelm;
}


}
