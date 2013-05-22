package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Physician entity. @author MyEclipse Persistence Tools
 */

public class Physician implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private String firstName;
	private String lastName;
	private String phone;
	private String officeAddress;
	private String email;
	private Date startDate;
	private Date endDate;
	private String primarySpecialty;
	private String secondarySpecialty;
	private String clinicName;
	private Boolean isPrimary;
	private String fax;
	private Integer notesId;
	private Integer hospitalId;
	private Short active;

	// Constructors

	/** default constructor */
	public Physician() {
	}

	/** minimal constructor */
	public Physician(Integer id, Integer pid) {
		this.id = id;
		this.pid = pid;
	}

	/** full constructor */
	public Physician(Integer id, Integer pid, String firstName,
			String lastName, String phone, String officeAddress, String email,
			Date startDate, Date endDate, String primarySpecialty,
			String secondarySpecialty, String clinicName, Boolean isPrimary,
			String fax, Integer notesId, Integer hospitalId, Short active) {
		this.id = id;
		this.pid = pid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.officeAddress = officeAddress;
		this.email = email;
		this.startDate = startDate;
		this.endDate = endDate;
		this.primarySpecialty = primarySpecialty;
		this.secondarySpecialty = secondarySpecialty;
		this.clinicName = clinicName;
		this.isPrimary = isPrimary;
		this.fax = fax;
		this.notesId = notesId;
		this.hospitalId = hospitalId;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOfficeAddress() {
		return this.officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPrimarySpecialty() {
		return this.primarySpecialty;
	}

	public void setPrimarySpecialty(String primarySpecialty) {
		this.primarySpecialty = primarySpecialty;
	}

	public String getSecondarySpecialty() {
		return this.secondarySpecialty;
	}

	public void setSecondarySpecialty(String secondarySpecialty) {
		this.secondarySpecialty = secondarySpecialty;
	}

	public String getClinicName() {
		return this.clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public Boolean getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getNotesId() {
		return this.notesId;
	}

	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	public Integer getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

}