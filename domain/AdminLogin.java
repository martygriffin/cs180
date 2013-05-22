package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * AdminLogin entity. @author MyEclipse Persistence Tools
 */

public class AdminLogin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Admin admin;
	private String logonIp;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public AdminLogin() {
	}

	/** full constructor */
	public AdminLogin(Integer id, Admin admin, String logonIp,
			Timestamp timeStamp) {
		this.id = id;
		this.admin = admin;
		this.logonIp = logonIp;
		this.timeStamp = timeStamp;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getLogonIp() {
		return this.logonIp;
	}

	public void setLogonIp(String logonIp) {
		this.logonIp = logonIp;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

}