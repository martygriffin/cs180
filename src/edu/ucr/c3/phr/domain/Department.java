package edu.ucr.c3.phr.domain;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer hospitalId;
	private String name;
	private String address;
	private String phone;
	private String fax;
	private Integer notesId;
	private Short active;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(Integer id, Integer hospitalId) {
		this.id = id;
		this.hospitalId = hospitalId;
	}

	/** full constructor */
	public Department(Integer id, Integer hospitalId, String name,
			String address, String phone, String fax, Integer notesId,
			Short active) {
		this.id = id;
		this.hospitalId = hospitalId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.notesId = notesId;
		this.active = active;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

}