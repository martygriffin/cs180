package com.hibernate;

/**
 * Social entity. @author MyEclipse Persistence Tools
 */

public class Social implements java.io.Serializable {

	// Fields

	private Integer socailId;
	private String title;
	private String link;
	private Boolean isActive;

	// Constructors

	/** default constructor */
	public Social() {
	}

	/** full constructor */
	public Social(String title, String link, Boolean isActive) {
		this.title = title;
		this.link = link;
		this.isActive = isActive;
	}

	// Property accessors

	public Integer getSocailId() {
		return this.socailId;
	}

	public void setSocailId(Integer socailId) {
		this.socailId = socailId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}