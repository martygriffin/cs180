package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AcademicTerm entity. @author MyEclipse Persistence Tools
 */

public class AcademicTerm implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private Short active;
	private Set sections = new HashSet(0);
	private Set sessions = new HashSet(0);
	private Set sessions_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcademicTerm() {
	}

	/** minimal constructor */
	public AcademicTerm(Short id, String name, Short active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	/** full constructor */
	public AcademicTerm(Short id, String name, Short active, Set sections,
			Set sessions, Set sessions_1) {
		this.id = id;
		this.name = name;
		this.active = active;
		this.sections = sections;
		this.sessions = sessions;
		this.sessions_1 = sessions_1;
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

	public Set getSections() {
		return this.sections;
	}

	public void setSections(Set sections) {
		this.sections = sections;
	}

	public Set getSessions() {
		return this.sessions;
	}

	public void setSessions(Set sessions) {
		this.sessions = sessions;
	}

	public Set getSessions_1() {
		return this.sessions_1;
	}

	public void setSessions_1(Set sessions_1) {
		this.sessions_1 = sessions_1;
	}

}