package edu.ucr.c3.wms.domain;

/**
 * SystemVersion entity. @author MyEclipse Persistence Tools
 */

public class SystemVersion implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer major;
	private Integer minor;
	private Integer bugfix;
	private String description;
	private String appRelease;

	// Constructors

	/** default constructor */
	public SystemVersion() {
	}

	/** full constructor */
	public SystemVersion(Integer id, Integer major, Integer minor,
			Integer bugfix, String description, String appRelease) {
		this.id = id;
		this.major = major;
		this.minor = minor;
		this.bugfix = bugfix;
		this.description = description;
		this.appRelease = appRelease;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMajor() {
		return this.major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getMinor() {
		return this.minor;
	}

	public void setMinor(Integer minor) {
		this.minor = minor;
	}

	public Integer getBugfix() {
		return this.bugfix;
	}

	public void setBugfix(Integer bugfix) {
		this.bugfix = bugfix;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAppRelease() {
		return this.appRelease;
	}

	public void setAppRelease(String appRelease) {
		this.appRelease = appRelease;
	}

}