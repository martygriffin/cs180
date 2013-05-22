


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



public class AddEditImmunizationForm {
	
private int id;
private Date date_administered;
private String vaccine_type;
private Boolean isCurrent;
private Date vaccine_expiration;
private String vaccineManufacturer;
private String[]current_probelm={"Yes","No"};
private String is_current_problem;
private short active;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate_administered() {
	return date_administered;
}
public void setDate_administered(Date date_administered) {
	this.date_administered = date_administered;
}
public String getVaccine_type() {
	return vaccine_type;
}
public void setVaccine_type(String vaccine_type) {
	this.vaccine_type = vaccine_type;
}
public Boolean getIsCurrent() {
	return isCurrent;
}
public void setIsCurrent(Boolean isCurrent) {
	this.isCurrent = isCurrent;
}
public Date getVaccine_expiration() {
	return vaccine_expiration;
}
public void setVaccine_expiration(Date vaccine_expiration) {
	this.vaccine_expiration = vaccine_expiration;
}
public String getVaccineManufacturer() {
	return vaccineManufacturer;
}
public void setVaccineManufacturer(String vaccineManufacturer) {
	this.vaccineManufacturer = vaccineManufacturer;
}
public short getActive() {
	return active;
}
public void setActive(short active) {
	this.active = active;
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


}
