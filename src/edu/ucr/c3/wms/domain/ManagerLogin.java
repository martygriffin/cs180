package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * ManagerLogin entity. @author MyEclipse Persistence Tools
 */

public class ManagerLogin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Manager manager;
	private String logonIp;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public ManagerLogin() {
	}

	/** full constructor */
	public ManagerLogin(Manager manager, String logonIp, Timestamp timeStamp) {
		this.manager = manager;
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

	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
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