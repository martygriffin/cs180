package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * DeptAdmin entity. @author MyEclipse Persistence Tools
 */

public class DeptAdmin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Department department;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private Timestamp timeStamp;
	private Short active;

	// Constructors

	/** default constructor */
	public DeptAdmin() {
	}

	/** full constructor */
	public DeptAdmin(Department department, String userName, String password,
			String firstName, String lastName, String email,
			Timestamp timeStamp, Short active) {
		this.department = department;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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