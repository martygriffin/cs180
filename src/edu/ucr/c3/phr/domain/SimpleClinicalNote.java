package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * SimpleClinicalNote entity. @author MyEclipse Persistence Tools
 */

public class SimpleClinicalNote implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date dateOfVisit;
	private String visitType;
	private String visitLocation;
	private String specialty;
	private String specialtyValue;
	private Integer providerInstitution;
	private String chiefComplaint;
	private String content;
	private Integer notesId;
	private Integer providerId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public SimpleClinicalNote() {
	}

	/** minimal constructor */
	public SimpleClinicalNote(Integer providerId) {
		this.providerId = providerId;
	}
	public SimpleClinicalNote(int pid, Date date, String type, String location
			,String special, String chiefComplaint,String content, Boolean current, Short active)
	{
		this.pid = pid;
		this.dateOfVisit=date;
		this.visitType=type;
		this.visitLocation=location;
		this.specialty=special;
		this.chiefComplaint=chiefComplaint;
		this.content=content;
		this.isCurrent=current;
		this.active=active;
	}

	/** full constructor */
	public SimpleClinicalNote(Integer pid, Date dateOfVisit, String visitType,
			String visitLocation, String specialty, String specialtyValue,
			Integer providerInstitution, String chiefComplaint, String content,
			Integer notesId, Integer providerId, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.dateOfVisit = dateOfVisit;
		this.visitType = visitType;
		this.visitLocation = visitLocation;
		this.specialty = specialty;
		this.specialtyValue = specialtyValue;
		this.providerInstitution = providerInstitution;
		this.chiefComplaint = chiefComplaint;
		this.content = content;
		this.notesId = notesId;
		this.providerId = providerId;
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

	public Date getDateOfVisit() {
		return this.dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getVisitType() {
		return this.visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public String getVisitLocation() {
		return this.visitLocation;
	}

	public void setVisitLocation(String visitLocation) {
		this.visitLocation = visitLocation;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getSpecialtyValue() {
		return this.specialtyValue;
	}

	public void setSpecialtyValue(String specialtyValue) {
		this.specialtyValue = specialtyValue;
	}

	public Integer getProviderInstitution() {
		return this.providerInstitution;
	}

	public void setProviderInstitution(Integer providerInstitution) {
		this.providerInstitution = providerInstitution;
	}

	public String getChiefComplaint() {
		return this.chiefComplaint;
	}

	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getNotesId() {
		return this.notesId;
	}

	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	public Integer getProviderId() {
		return this.providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
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