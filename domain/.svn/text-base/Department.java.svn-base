package edu.ucr.c3.wms.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private College college;
	private String name;
	private String homeUrl;
	private String serviceName;
	private String authKey;
	private Short active;
	private Set workshops = new HashSet(0);
	private Set deptAgreeRels = new HashSet(0);
	private Set workshops_1 = new HashSet(0);
	private Set managers = new HashSet(0);
	private Set managers_1 = new HashSet(0);
	private Set deptAdmins = new HashSet(0);
	private Set labclasses = new HashSet(0);
	private Set labclasses_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(Integer id, College college, String name, String homeUrl,
			String serviceName, String authKey, Short active) {
		this.id = id;
		this.college = college;
		this.name = name;
		this.homeUrl = homeUrl;
		this.setServiceName(serviceName);
		this.authKey = authKey;
		this.active = active;
	}

	/** full constructor */
	public Department(Integer id, College college, String name, String homeUrl,
			String serviceName, String authKey, Short active, Set workshops, Set deptAgreeRels,
			Set workshops_1, Set managers, Set managers_1, Set deptAdmins,
			Set labclasses, Set labclasses_1) {
		this.id = id;
		this.college = college;
		this.name = name;
		this.homeUrl = homeUrl;
		this.authKey = authKey;
		this.setServiceName(serviceName);
		this.active = active;
		this.workshops = workshops;
		this.deptAgreeRels = deptAgreeRels;
		this.workshops_1 = workshops_1;
		this.managers = managers;
		this.managers_1 = managers_1;
		this.deptAdmins = deptAdmins;
		this.labclasses = labclasses;
		this.labclasses_1 = labclasses_1;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
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

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Set getWorkshops() {
		return this.workshops;
	}

	public void setWorkshops(Set workshops) {
		this.workshops = workshops;
	}

	public Set getDeptAgreeRels() {
		return this.deptAgreeRels;
	}

	public void setDeptAgreeRels(Set deptAgreeRels) {
		this.deptAgreeRels = deptAgreeRels;
	}

	public Set getWorkshops_1() {
		return this.workshops_1;
	}

	public void setWorkshops_1(Set workshops_1) {
		this.workshops_1 = workshops_1;
	}

	public Set getManagers() {
		return this.managers;
	}

	public void setManagers(Set managers) {
		this.managers = managers;
	}

	public Set getManagers_1() {
		return this.managers_1;
	}

	public void setManagers_1(Set managers_1) {
		this.managers_1 = managers_1;
	}

	public Set getDeptAdmins() {
		return this.deptAdmins;
	}

	public void setDeptAdmins(Set deptAdmins) {
		this.deptAdmins = deptAdmins;
	}

	public Set getLabclasses() {
		return this.labclasses;
	}

	public void setLabclasses(Set labclasses) {
		this.labclasses = labclasses;
	}

	public Set getLabclasses_1() {
		return this.labclasses_1;
	}

	public void setLabclasses_1(Set labclasses_1) {
		this.labclasses_1 = labclasses_1;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return serviceName;
	}

}