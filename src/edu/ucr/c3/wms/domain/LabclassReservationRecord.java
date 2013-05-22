package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * LabclassReservationRecord entity. @author MyEclipse Persistence Tools
 */

public class LabclassReservationRecord implements java.io.Serializable {

	// Fields

	private Integer id;
	private ReservationStatus reservationStatus;
	private Section section;
	private LabclassReservation labclassReservation;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public LabclassReservationRecord() {
	}

	/** minimal constructor */
	public LabclassReservationRecord(ReservationStatus reservationStatus,
			Section section, Timestamp timeStamp) {
		this.reservationStatus = reservationStatus;
		this.section = section;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public LabclassReservationRecord(ReservationStatus reservationStatus,
			Section section, LabclassReservation labclassReservation,
			Timestamp timeStamp) {
		this.reservationStatus = reservationStatus;
		this.section = section;
		this.labclassReservation = labclassReservation;
		this.timeStamp = timeStamp;
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

	public LabclassReservation getLabclassReservation() {
		return this.labclassReservation;
	}

	public void setLabclassReservation(LabclassReservation labclassReservation) {
		this.labclassReservation = labclassReservation;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

}