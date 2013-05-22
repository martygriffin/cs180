package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * LabclassLog entity. @author MyEclipse Persistence Tools
 */

public class LabclassLog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Labclass labclass;
	private String subject;
	private String description;
	private Short multipleAllowedFlag;
	private String comments;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public LabclassLog() {
	}

	/** minimal constructor */
	public LabclassLog(Labclass labclass, String subject, String description,
			Short emailFlag, Short multipleAllowedFlag, Timestamp timeStamp) {
		this.labclass = labclass;
		this.subject = subject;
		this.description = description;
		this.multipleAllowedFlag = multipleAllowedFlag;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public LabclassLog(Labclass labclass, String subject, String description,
			Short emailFlag, Short multipleAllowedFlag, String comments,
			Timestamp timeStamp) {
		this.labclass = labclass;
		this.subject = subject;
		this.description = description;
		this.multipleAllowedFlag = multipleAllowedFlag;
		this.comments = comments;
		this.timeStamp = timeStamp;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Labclass getLabclass() {
		return this.labclass;
	}

	public void setLabclass(Labclass labclass) {
		this.labclass = labclass;
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

}