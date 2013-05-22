package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College implements java.io.Serializable {

	// Fields

	private Integer id;
	private University university;
	private String name;
	private String homeUrl;
	private Short active;
	private Set departments = new HashSet(0);

	// Constructors

	/** default constructor */
	public College() {
	}

	/** minimal constructor */
	public College(Integer id, University university, String name, Short active) {
		this.id = id;
		this.university = university;
		this.name = name;
		this.active = active;
	}

	/** full constructor */
	public College(Integer id, University university, String name,
			String homeUrl, Short active, Set departments) {
		this.id = id;
		this.university = university;
		this.name = name;
		this.homeUrl = homeUrl;
		this.active = active;
		this.departments = departments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeUrl() {
		return this.homeUrl;
	}

	public void setHomeUrl(String homeUrl) {
		this.homeUrl = homeUrl;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Set getDepartments() {
		return this.departments;
	}

	public void setDepartments(Set departments) {
		this.departments = departments;
	}

}