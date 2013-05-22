package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AppType entity. @author MyEclipse Persistence Tools
 */

public class AppType implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Short active;
	private Set managerAppRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AppType() {
	}

	/** minimal constructor */
	public AppType(Short id, String name, Short active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	/** full constructor */
	public AppType(Short id, String name, Short active, Set managerAppRoles) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.managerAppRoles = managerAppRoles;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Set getManagerAppRoles() {
		return this.managerAppRoles;
	}

	public void setManagerAppRoles(Set managerAppRoles) {
		this.managerAppRoles = managerAppRoles;
	}

}