package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * DeptAgreeRel entity. @author MyEclipse Persistence Tools
 */

public class DeptAgreeRel implements java.io.Serializable {

	// Fields

	private Integer id;
	private Department department;
	private Agreement agreement;
	private String comments;
	private Timestamp timeStamp;
	private Short active;

	// Constructors

	/** default constructor */
	public DeptAgreeRel() {
	}

	/** minimal constructor */
	public DeptAgreeRel(Department department, Agreement agreement,
			Timestamp timeStamp, Short active) {
		this.department = department;
		this.agreement = agreement;
		this.timeStamp = timeStamp;
		this.active = active;
	}

	/** full constructor */
	public DeptAgreeRel(Department department, Agreement agreement,
			String comments, Timestamp timeStamp, Short active) {
		this.department = department;
		this.agreement = agreement;
		this.comments = comments;
		this.timeStamp = timeStamp;
		this.active = active;
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

	public Agreement getAgreement() {
		return this.agreement;
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
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

}