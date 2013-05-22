package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Procedures entity. @author MyEclipse Persistence Tools
 */

public class Procedures implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date datePerformed;
	private String name;
	private String nameType;
	private String nameValue;
	private String nameAbbrev;
	private String location;
	private Integer providerName;
	private Integer providerInstitution;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Procedures() {
	}
	public Procedures(int pid, Date datePerformed, String name, String location,
			Boolean current, Short active)
	{
		this.pid=pid;
		this.datePerformed=datePerformed;
		this.name = name;
		this.location=location;
		this.isCurrent=current;
		this.active= active;
	}
	
	/** full constructor */
	public Procedures(Integer pid, Date datePerformed, String name,
			String nameType, String nameValue, String nameAbbrev,
			String location, Integer providerName, Integer providerInstitution,
			Integer notesId, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.datePerformed = datePerformed;
		this.name = name;
		this.nameType = nameType;
		this.nameValue = nameValue;
		this.nameAbbrev = nameAbbrev;
		this.location = location;
		this.providerName = providerName;
		this.providerInstitution = providerInstitution;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getProviderName() {
		return this.providerName;
	}

	public void setProviderName(Integer providerName) {
		this.providerName = providerName;
	}

	public Integer getProviderInstitution() {
		return this.providerInstitution;
	}

	public void setProviderInstitution(Integer providerInstitution) {
		this.providerInstitution = providerInstitution;
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