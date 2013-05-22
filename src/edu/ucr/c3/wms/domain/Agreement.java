package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Agreement entity. @author MyEclipse Persistence Tools
 */

public class Agreement implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;
	private Short active;
	private Set deptAgreeRels = new HashSet(0);

	// Constructors

	/** default constructor */
	public Agreement() {
	}

	/** minimal constructor */
	public Agreement(String content, Short active) {
		this.content = content;
		this.active = active;
	}

	/** full constructor */
	public Agreement(String content, Short active, Set deptAgreeRels) {
		this.content = content;
		this.active = active;
		this.deptAgreeRels = deptAgreeRels;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Set getDeptAgreeRels() {
		return this.deptAgreeRels;
	}

	public void setDeptAgreeRels(Set deptAgreeRels) {
		this.deptAgreeRels = deptAgreeRels;
	}

}