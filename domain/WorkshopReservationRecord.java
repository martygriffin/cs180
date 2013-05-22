package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * WorkshopReservationRecord entity. @author MyEclipse Persistence Tools
 */

public class WorkshopReservationRecord implements java.io.Serializable {

	// Fields

	private Integer id;
	private Session session;
	private ReservationStatus reservationStatus;
	private WorkshopReservation workshopReservation;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public WorkshopReservationRecord() {
	}

	/** full constructor */
	public WorkshopReservationRecord(Session session,
			ReservationStatus reservationStatus,
			WorkshopReservation workshopReservation, Timestamp timeStamp) {
		this.session = session;
		this.reservationStatus = reservationStatus;
		this.workshopReservation = workshopReservation;
		this.timeStamp = timeStamp;
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

	public WorkshopReservation getWorkshopReservation() {
		return this.workshopReservation;
	}

	public void setWorkshopReservation(WorkshopReservation workshopReservation) {
		this.workshopReservation = workshopReservation;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

}