package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Integer id;
	private Department department;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String comments;
	private Timestamp timeStamp;
	private Short active;
	private Set managerLogins = new HashSet(0);
	private Set managerLogins_1 = new HashSet(0);
	private Set managerAppRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** minimal constructor */
	public Manager(Department department, String userName, String password,
			String firstName, String lastName, String email, String telephone,
			Timestamp timeStamp, Short active) {
		this.department = department;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.timeStamp = timeStamp;
		this.active = active;
	}

	/** full constructor */
	public Manager(Department department, String userName, String password,
			String firstName, String lastName, String email, String telephone,
			String comments, Timestamp timeStamp, Short active,
			Set managerLogins, Set managerLogins_1, Set managerAppRoles) {
		this.department = department;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.comments = comments;
		this.timeStamp = timeStamp;
		this.active = active;
		this.managerLogins = managerLogins;
		this.managerLogins_1 = managerLogins_1;
		this.managerAppRoles = managerAppRoles;
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
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set getManagerLogins() {
		return this.managerLogins;
	}

	public void setManagerLogins(Set managerLogins) {
		this.managerLogins = managerLogins;
	}

	public Set getManagerLogins_1() {
		return this.managerLogins_1;
	}

	public void setManagerLogins_1(Set managerLogins_1) {
		this.managerLogins_1 = managerLogins_1;
	}

	public Set getManagerAppRoles() {
		return this.managerAppRoles;
	}

	public void setManagerAppRoles(Set managerAppRoles) {
		this.managerAppRoles = managerAppRoles;
	}

	public String getName(){
		return firstName + " " + lastName;
	}

}