package edu.ucr.c3.wms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private String adminId;
	private String firstName;
	private String lastName;
	private String password;
	private String telephone;
	private String email;
	private Date createDate;
	private Set adminLogins = new HashSet(0);
	private Set adminLogins_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String adminId, String firstName, String lastName,
			String telephone, String email, Date createDate) {
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.email = email;
		this.createDate = createDate;
	}

	/** full constructor */
	public Admin(String adminId, String firstName, String lastName,
			String password, String telephone, String email, Date createDate,
			Set adminLogins, Set adminLogins_1) {
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.createDate = createDate;
		this.adminLogins = adminLogins;
		this.adminLogins_1 = adminLogins_1;
	}

	// Property accessors

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set getAdminLogins() {
		return this.adminLogins;
	}

	public void setAdminLogins(Set adminLogins) {
		this.adminLogins = adminLogins;
	}

	public Set getAdminLogins_1() {
		return this.adminLogins_1;
	}

	public void setAdminLogins_1(Set adminLogins_1) {
		this.adminLogins_1 = adminLogins_1;
	}

}