package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Results entity. @author MyEclipse Persistence Tools
 */

public class Results implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date datePerformed;
	private String testName;
	private String result;
	private String units;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Results() {
	}
	public Results(int pid, Date date, String name, String result, String units,
			Boolean current, Short active)
	{
		this.pid= pid;
		this.datePerformed=date;
		this.testName=name;
		this.result=result;
		this.units=units;
		this.isCurrent=current;
		this.active=active;
	}
	/** full constructor */
	public Results(Integer pid, Date datePerformed, String testName,
			String result, String units, Integer notesId, Boolean isCurrent,
			Short active) {
		this.pid = pid;
		this.datePerformed = datePerformed;
		this.testName = testName;
		this.result = result;
		this.units = units;
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

	public Date getDatePerformed() {
		return this.datePerformed;
	}

	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}

	public String getTestName() {
		return this.testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
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