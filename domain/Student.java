package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private University university;
	private String sid;
	private String netid;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String major;
	private Timestamp timeStamp;
	private Set labclassReservations = new HashSet(0);
	private Set workshopReservations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer id, University university, String sid, String netid,
			String firstName, String lastName, String email, Timestamp timeStamp) {
		this.id = id;
		this.university = university;
		this.sid = sid;
		this.netid = netid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public Student(Integer id, University university, String sid, String netid,
			String firstName, String middleName, String lastName, String email,
			String major, Timestamp timeStamp, Set labclassReservations,
			Set workshopReservations) {
		this.id = id;
		this.university = university;
		this.sid = sid;
		this.netid = netid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.major = major;
		this.timeStamp = timeStamp;
		this.labclassReservations = labclassReservations;
		this.workshopReservations = workshopReservations;
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

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getNetid() {
		return this.netid;
	}

	public void setNetid(String netid) {
		this.netid = netid;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Set getLabclassReservations() {
		return this.labclassReservations;
	}

	public void setLabclassReservations(Set labclassReservations) {
		this.labclassReservations = labclassReservations;
	}

	public Set getWorkshopReservations() {
		return this.workshopReservations;
	}

	public void setWorkshopReservations(Set workshopReservations) {
		this.workshopReservations = workshopReservations;
	}

}