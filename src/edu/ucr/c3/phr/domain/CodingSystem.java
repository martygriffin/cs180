package edu.ucr.c3.phr.domain;

/**
 * CodingSystem entity. @author MyEclipse Persistence Tools
 */

public class CodingSystem implements java.io.Serializable {

	// Fields

	private Integer id;
	private String shortName;
	private String description;

	// Constructors

	/** default constructor */
	public CodingSystem() {
	}

	/** minimal constructor */
	public CodingSystem(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public CodingSystem(Integer id, String shortName, String description) {
		this.id = id;
		this.shortName = shortName;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}