package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * University entity. @author MyEclipse Persistence Tools
 */

public class University implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String homeUrl;
	private String sidRule;
	private Short active;
	private Set students = new HashSet(0);
	private Set colleges = new HashSet(0);

	// Constructors

	/** default constructor */
	public University() {
	}

	/** minimal constructor */
	public University(String name, String sidRule, Short active) {
		this.name = name;
		this.sidRule = sidRule;
		this.active = active;
	}

	/** full constructor */
	public University(String name, String homeUrl, String sidRule,
			Short active, Set students, Set colleges) {
		this.name = name;
		this.homeUrl = homeUrl;
		this.sidRule = sidRule;
		this.active = active;
		this.students = students;
		this.colleges = colleges;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSidRule() {
		return this.sidRule;
	}

	public void setSidRule(String sidRule) {
		this.sidRule = sidRule;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getColleges() {
		return this.colleges;
	}

	public void setColleges(Set colleges) {
		this.colleges = colleges;
	}

}