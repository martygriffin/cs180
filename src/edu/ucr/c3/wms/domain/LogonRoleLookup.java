package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * LogonRoleLookup entity. @author MyEclipse Persistence Tools
 */

public class LogonRoleLookup extends DomainObject implements java.io.Serializable {
	public static final short ALL_ROLES = -1;
	public static final short ADMIN = 0;
	public static final short USER = 1;
	
	// Fields

	private Short id;
	private String roleType;
	private Short active;

	// Constructors

	/** default constructor */
	public LogonRoleLookup() {
	}

	/** full constructor */
	public LogonRoleLookup(Short id, String roleType, Short active) {
		this.id = id;
		this.roleType = roleType;
		this.active = active;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}
}