package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * LabclassReservation entity. @author MyEclipse Persistence Tools
 */

public class LabclassReservation implements java.io.Serializable {

	// Fields

	private Integer id;
	private ReservationStatus reservationStatus;
	private Section section;
	private Student student;
	private String confirmationNumber;
	private String reservationIp;
	private Timestamp timeStamp;
	private Set labclassReservationRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public LabclassReservation() {
	}

	/** minimal constructor */
	public LabclassReservation(ReservationStatus reservationStatus,
			Section section, Student student, String confirmationNumber,
			String reservationIp, Timestamp timeStamp) {
		this.reservationStatus = reservationStatus;
		this.section = section;
		this.student = student;
		this.confirmationNumber = confirmationNumber;
		this.reservationIp = reservationIp;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public LabclassReservation(ReservationStatus reservationStatus,
			Section section, Student student, String confirmationNumber,
			String reservationIp, Timestamp timeStamp,
			Set labclassReservationRecords) {
		this.reservationStatus = reservationStatus;
		this.section = section;
		this.student = student;
		this.confirmationNumber = confirmationNumber;
		this.reservationIp = reservationIp;
		this.timeStamp = timeStamp;
		this.labclassReservationRecords = labclassReservationRecords;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ReservationStatus getReservationStatus() {
		return this.reservationStatus;
	}

	public void setReservationStatus(ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getConfirmationNumber() {
		return this.confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String getReservationIp() {
		return this.reservationIp;
	}

	public void setReservationIp(String reservationIp) {
		this.reservationIp = reservationIp;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Set getLabclassReservationRecords() {
		return this.labclassReservationRecords;
	}

	public void setLabclassReservationRecords(Set labclassReservationRecords) {
		this.labclassReservationRecords = labclassReservationRecords;
	}

}