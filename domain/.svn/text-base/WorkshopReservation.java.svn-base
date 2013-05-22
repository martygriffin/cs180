package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * WorkshopReservation entity. @author MyEclipse Persistence Tools
 */

public class WorkshopReservation implements java.io.Serializable {

	// Fields

	private Integer id;
	private Session session;
	private ReservationStatus reservationStatus;
	private Student student;
	private String confirmationNumber;
	private Boolean attended;
	private String reservationIp;
	private Timestamp timeStamp;
	private Set workshopReservationRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public WorkshopReservation() {
	}

	/** minimal constructor */
	public WorkshopReservation(Session session,
			ReservationStatus reservationStatus, Student student,
			String confirmationNumber, Boolean attended,
			String reservationIp, Timestamp timeStamp) {
		this.session = session;
		this.reservationStatus = reservationStatus;
		this.student = student;
		this.confirmationNumber = confirmationNumber;
		this.attended = attended;
		this.reservationIp = reservationIp;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public WorkshopReservation(Session session,
			ReservationStatus reservationStatus, Student student,
			String confirmationNumber, Boolean attended, String reservationIp,
			Timestamp timeStamp, Set workshopReservationRecords) {
		this.session = session;
		this.reservationStatus = reservationStatus;
		this.student = student;
		this.confirmationNumber = confirmationNumber;
		this.attended = attended;
		this.reservationIp = reservationIp;
		this.timeStamp = timeStamp;
		this.workshopReservationRecords = workshopReservationRecords;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public ReservationStatus getReservationStatus() {
		return this.reservationStatus;
	}

	public void setReservationStatus(ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
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

	public Set getWorkshopReservationRecords() {
		return this.workshopReservationRecords;
	}

	public void setWorkshopReservationRecords(Set workshopReservationRecords) {
		this.workshopReservationRecords = workshopReservationRecords;
	}

	public void setAttended(Boolean attended) {
		this.attended = attended;
	}

	public Boolean getAttended() {
		return attended;
	}

}