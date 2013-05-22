package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Labclass entity. @author MyEclipse Persistence Tools
 */

public class Labclass implements java.io.Serializable {

	// Fields

	private Integer id;
	private Department department;
	private String subject;
	private String description;
	private Short multipleAllowedFlag;
	private String comments;
	private Timestamp timeStamp;
	private Short active;
	private Set sections = new HashSet(0);
	private Set labclassLogs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Labclass() {
	}

	/** minimal constructor */
	public Labclass(Department department, String subject,
			String description, Short emailFlag, Short multipleAllowedFlag,
			Timestamp timeStamp, Short active) {
		this.department = department;
		this.subject = subject;
		this.description = description;
		this.multipleAllowedFlag = multipleAllowedFlag;
		this.timeStamp = timeStamp;
		this.active = active;
	}

	/** full constructor */
	public Labclass(Department department, String subject,
			String description, Short emailFlag, Short multipleAllowedFlag,
			String comments, Timestamp timeStamp, Short active, Set sections,
			Set labclassLogs) {
		this.department = department;
		this.subject = subject;
		this.description = description;
		this.multipleAllowedFlag = multipleAllowedFlag;
		this.comments = comments;
		this.timeStamp = timeStamp;
		this.active = active;
		this.sections = sections;
		this.labclassLogs = labclassLogs;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getMultipleAllowedFlag() {
		return this.multipleAllowedFlag;
	}

	public void setMultipleAllowedFlag(Short multipleAllowedFlag) {
		this.multipleAllowedFlag = multipleAllowedFlag;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	@SuppressWarnings("unchecked")
	public Set getSections() {
		if(sections == null)
			return null;
		Set sect = new HashSet();
		for(Object s:sections){
			if(((Section)s).getActive()==1)
				sect.add(s);
		}
		return sect;
	}

	public void setSections(Set sections) {
		this.sections = sections;
	}

	public Set getLabclassLogs() {
		return this.labclassLogs;
	}

	public void setLabclassLogs(Set labclassLogs) {
		this.labclassLogs = labclassLogs;
	}

}