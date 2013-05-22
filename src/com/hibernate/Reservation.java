package com.hibernate;

import java.sql.Timestamp;

/**
 * Reservation entity. @author MyEclipse Persistence Tools
 */

public class Reservation implements java.io.Serializable {

	// Fields

	private Integer reservationId;
	private String name;
	private Timestamp dateTime;
	private String tableNumber;
	private String duration;
	private Integer groupSize;
	private String specialRequests;
	private Boolean isActive;

	// Constructors

	/** default constructor */
	public Reservation() {
	}

	/** minimal constructor */
	public Reservation(String name, Integer groupSize, Boolean isActive) {
		this.name = name;
		this.groupSize = groupSize;
		this.isActive = isActive;
	}

	/** full constructor */
	public Reservation(String name, Timestamp dateTime, String tableNumber,
			String duration, Integer groupSize, String specialRequests,
			Boolean isActive) {
		this.name = name;
		this.dateTime = dateTime;
		this.tableNumber = tableNumber;
		this.duration = duration;
		this.groupSize = groupSize;
		this.specialRequests = specialRequests;
		this.isActive = isActive;
	}

	// Property accessors

	public Integer getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getTableNumber() {
		return this.tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Integer getGroupSize() {
		return this.groupSize;
	}

	public void setGroupSize(Integer groupSize) {
		this.groupSize = groupSize;
	}

	public String getSpecialRequests() {
		return this.specialRequests;
	}

	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}