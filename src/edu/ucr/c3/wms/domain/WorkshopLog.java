package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * WorkshopLog entity. @author MyEclipse Persistence Tools
 */

public class WorkshopLog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Workshop workshop;
	private String subject;
	private String description;
	private Short multipleAllowedFlag;
	private String comments;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public WorkshopLog() {
	}

	/** minimal constructor */
	public WorkshopLog(Workshop workshop, String subject, String description,
			Short emailFlag, Short multipleAllowedFlag, Timestamp timeStamp) {
		this.workshop = workshop;
		this.subject = subject;
		this.description = description;
		this.multipleAllowedFlag = multipleAllowedFlag;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public WorkshopLog(Workshop workshop, String subject, String description,
			Short emailFlag, Short multipleAllowedFlag, String comments,
			Timestamp timeStamp) {
		this.workshop = workshop;
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

	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
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