package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Problem entity. @author MyEclipse Persistence Tools
 */

public class Problem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date dateOnset;
	private Date dateResolution;
	private String name;
	private String nameType;
	private String nameValue;
	private String nameAbbrev;
	private Integer diagnosedBy;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Problem() {
	}
	public Problem(Integer pid, Date onset, Date resolved, String name, 
			Boolean current,short active)
	{
		this.pid= pid;
		this.dateOnset=onset;
		this.dateResolution=resolved;
		this.name=name;
		this.isCurrent = current;
		this.active = active;
	}
	/** full constructor */
	public Problem(Integer pid, Date dateOnset, Date dateResolution,
			String name, String nameType, String nameValue, String nameAbbrev,
			Integer diagnosedBy, Integer notesId, Boolean isCurrent,
			Short active) {
		this.pid = pid;
		this.dateOnset = dateOnset;
		this.dateResolution = dateResolution;
		this.name = name;
		this.nameType = nameType;
		this.nameValue = nameValue;
		this.nameAbbrev = nameAbbrev;
		this.diagnosedBy = diagnosedBy;
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

	public Date getDateOnset() {
		return this.dateOnset;
	}

	public void setDateOnset(Date dateOnset) {
		this.dateOnset = dateOnset;
	}

	public Date getDateResolution() {
		return this.dateResolution;
	}

	public void setDateResolution(Date dateResolution) {
		this.dateResolution = dateResolution;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getNameValue() {
		return this.nameValue;
	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public String getNameAbbrev() {
		return this.nameAbbrev;
	}

	public void setNameAbbrev(String nameAbbrev) {
		this.nameAbbrev = nameAbbrev;
	}

	public Integer getDiagnosedBy() {
		return this.diagnosedBy;
	}

	public void setDiagnosedBy(Integer diagnosedBy) {
		this.diagnosedBy = diagnosedBy;
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