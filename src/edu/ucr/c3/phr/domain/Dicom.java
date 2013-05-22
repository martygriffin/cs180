package edu.ucr.c3.phr.domain;

/**
 * Dicom entity. @author MyEclipse Persistence Tools
 */

public class Dicom implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private String fileLocation;
	private Integer hospitalId;
	private Integer notesId;
	private String name;
	private Integer size;
	private String manufacturer;
	private Integer modalityId;
	private String bodyPartExamined;
	private String plateType;
	private String phosphorType;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Dicom() {
	}
public Dicom(int pid,String name, String filepath, boolean isCurrent, short active)
{
	this.pid=pid;
	this.name=name;
	this.fileLocation=filepath;
	this.isCurrent=isCurrent;
	this.active=active;
}
	/** full constructor */
	public Dicom(Integer pid, String fileLocation, Integer hospitalId,
			Integer notesId, String name, Integer size, String manufacturer,
			Integer modalityId, String bodyPartExamined, String plateType,
			String phosphorType, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.fileLocation = fileLocation;
		this.hospitalId = hospitalId;
		this.notesId = notesId;
		this.name = name;
		this.size = size;
		this.manufacturer = manufacturer;
		this.modalityId = modalityId;
		this.bodyPartExamined = bodyPartExamined;
		this.plateType = plateType;
		this.phosphorType = phosphorType;
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

	public String getFileLocation() {
		return this.fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Integer getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Integer getNotesId() {
		return this.notesId;
	}

	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getModalityId() {
		return this.modalityId;
	}

	public void setModalityId(Integer modalityId) {
		this.modalityId = modalityId;
	}

	public String getBodyPartExamined() {
		return this.bodyPartExamined;
	}

	public void setBodyPartExamined(String bodyPartExamined) {
		this.bodyPartExamined = bodyPartExamined;
	}

	public String getPlateType() {
		return this.plateType;
	}

	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	public String getPhosphorType() {
		return this.phosphorType;
	}

	public void setPhosphorType(String phosphorType) {
		this.phosphorType = phosphorType;
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