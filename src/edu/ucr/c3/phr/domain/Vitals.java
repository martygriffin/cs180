package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Vitals entity. @author MyEclipse Persistence Tools
 */

public class Vitals implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date dateMeasured;
	private String name;
	private String nameType;
	private Double value;
	private String unit;
	private String unitType;
	private String site;
	private String position;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Vitals() {
	}
	public Vitals(int pid, Date date, String name, Double value, 
			String unit, String site, String position, Boolean current, Short active)
	{
		this.pid= pid;
		this.dateMeasured = date;
		this.name = name;
		this.value= value;
		this.unit = unit;
		this.site = site;
		this.position = position;
		this.isCurrent = current;
		this.active = active;
	}

	/** full constructor */
	public Vitals(Integer pid, Date dateMeasured, String name, String nameType,
			Double value, String unit, String unitType, String site,
			String position, Integer notesId, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.dateMeasured = dateMeasured;
		this.name = name;
		this.nameType = nameType;
		this.value = value;
		this.unit = unit;
		this.unitType = unitType;
		this.site = site;
		this.position = position;
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

	public Date getDateMeasured() {
		return this.dateMeasured;
	}

	public void setDateMeasured(Date dateMeasured) {
		this.dateMeasured = dateMeasured;
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

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
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