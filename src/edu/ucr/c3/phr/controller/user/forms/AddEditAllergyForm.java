


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



public class AddEditAllergyForm {
	
//	private int colId = BaseValidator.NOT_SELECTED;
//	private int univId = BaseValidator.NOT_SELECTED;
//	private String name;
//	private String url;
//	private List<University> univs;
//	
	private String[] types= {"plant","animal","food","other"};
	private String[]current_probelm={"Yes","No"};
	private String name;
	private String type;
	private Date start_date;
	
	private String is_current_problem;
	private int id;
	
	public void setCurrent_probelm(String[] current_probelm) {
		this.current_probelm = current_probelm;
	}
	public String[] getCurrent_probelm() {
		return current_probelm;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public String[] getTypes() {
		return types;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getStart_date() {
		return start_date;
	}
	
	public void setIs_current_problem(String is_current_problem) {
		this.is_current_problem = is_current_problem;
	}
	public String getIs_current_problem() {
		return is_current_problem;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	

}
