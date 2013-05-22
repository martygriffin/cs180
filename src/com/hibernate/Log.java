package com.hibernate;

import java.sql.Timestamp;

/**
 * Log entity. @author MyEclipse Persistence Tools
 */

public class Log implements java.io.Serializable {

	// Fields

	private Long logId;
	private String text;
	private Timestamp datetime;

	// Constructors

	/** default constructor */
	public Log() {
	}

	/** full constructor */
	public Log(String text, Timestamp datetime) {
		this.text = text;
		this.datetime = datetime;
	}

	// Property accessors

	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

}