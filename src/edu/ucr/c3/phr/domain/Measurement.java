package edu.ucr.c3.phr.domain;

import java.util.Date;



/**
 * Measurement entity. @author MyEclipse Persistence Tools
 */

public class Measurement implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private String type;
	private String value;
	private String unit;
	private java.util.Date datetime;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Measurement() {
	}
	public Measurement(int pid,String type ,String value, String unit, Date date, 
			Boolean current, Short active)
	{
		this.pid= pid;
		this.type=type;
		this.value = value;
		this.unit=unit;
		this.datetime=date;
		this.isCurrent=current;
		this.active=active;
	}

	/** full constructor */
	public Measurement(Integer pid, String type, String value, String unit,
			Date datetime, Integer notesId, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.type = type;
		this.value = value;
		this.unit = unit;
		this.datetime = datetime;
		this.notesId = notesId;
		this.isCurrent = isCurrent;
		this.active = active;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public java.util.Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(java.util.Date date) {
		this.datetime = date;
	}

	public Integer getNotesId() {
		return this.notesId;
	}

	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	public Boolean getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

}