package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Session entity. @author MyEclipse Persistence Tools
 */

public class Session implements java.io.Serializable {

	// Fields

	private Integer id;
	private Workshop workshop;
	private AcademicTerm academicTerm;
	private Short academicYear;
	private String name;
	private Date startDate;
	private Date endDate;
	private String timeDuration;
	private String location;
	private Integer maxCapacity;
	private Short openAdvanceDay;
	private String comments;
	private Timestamp timeStamp;
	private Short active;
	private Set workshopReservations = new HashSet(0);
	private Set workshopReservations_1 = new HashSet(0);
	private Set workshopReservationRecords = new HashSet(0);
	private Set workshopReservations_2 = new HashSet(0);
	private Set workshopReservations_3 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Session() {
	}

	/** minimal constructor */
	public Session(Workshop workshop, AcademicTerm academicTerm,
			Short academicYear, String name, Date startDate, Date endDate,
			String timeDuration, String location, Integer maxCapacity,
			Short openAdvanceDay, Timestamp timeStamp, Short active) {
		this.workshop = workshop;
		this.academicTerm = academicTerm;
		this.academicYear = academicYear;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timeDuration = timeDuration;
		this.location = location;
		this.maxCapacity = maxCapacity;
		this.openAdvanceDay = openAdvanceDay;
		this.timeStamp = timeStamp;
		this.active = active;
	}

	/** full constructor */
	public Session(Workshop workshop, AcademicTerm academicTerm,
			Short academicYear, String name, Date startDate, Date endDate,
			String timeDuration, String location, Integer maxCapacity,
			Short openAdvanceDay, String comments, Timestamp timeStamp,
			Short active, Set workshopReservations, Set workshopReservations_1,
			Set workshopReservationRecords, Set workshopReservations_2,
			Set workshopReservations_3) {
		this.workshop = workshop;
		this.academicTerm = academicTerm;
		this.academicYear = academicYear;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timeDuration = timeDuration;
		this.location = location;
		this.maxCapacity = maxCapacity;
		this.openAdvanceDay = openAdvanceDay;
		this.comments = comments;
		this.timeStamp = timeStamp;
		this.active = active;
		this.workshopReservations = workshopReservations;
		this.workshopReservations_1 = workshopReservations_1;
		this.workshopReservationRecords = workshopReservationRecords;
		this.workshopReservations_2 = workshopReservations_2;
		this.workshopReservations_3 = workshopReservations_3;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public AcademicTerm getAcademicTerm() {
		return this.academicTerm;
	}

	public void setAcademicTerm(AcademicTerm academicTerm) {
		this.academicTerm = academicTerm;
	}

	public Short getAcademicYear() {
		return this.academicYear;
	}

	public void setAcademicYear(Short academicYear) {
		this.academicYear = academicYear;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTimeDuration() {
		return this.timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	public String getTime() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String date = this.startDate.compareTo(this.endDate) == 0 ? df
				.format(this.startDate) : df.format(this.startDate) + " to "
				+ df.format(this.endDate);
		return date + " at " + this.getTimeDuration();
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMaxCapacity() {
		return this.maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Short getOpenAdvanceDay() {
		return this.openAdvanceDay;
	}

	public void setOpenAdvanceDay(Short openAdvanceDay) {
		this.openAdvanceDay = openAdvanceDay;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	@SuppressWarnings("unchecked")
	public Set getWorkshopReservations() {
		Set res = new HashSet();
		for (Object s : workshopReservations) {
			if (((WorkshopReservation) s).getReservationStatus().getId() == 0)
				res.add(s);
		}
		return res;
	}

	public void setWorkshopReservations(Set workshopReservations) {
		this.workshopReservations = workshopReservations;
	}

	public Set getWorkshopReservations_1() {
		return this.workshopReservations_1;
	}

	public void setWorkshopReservations_1(Set workshopReservations_1) {
		this.workshopReservations_1 = workshopReservations_1;
	}

	public Set getWorkshopReservationRecords() {
		return this.workshopReservationRecords;
	}

	public void setWorkshopReservationRecords(Set workshopReservationRecords) {
		this.workshopReservationRecords = workshopReservationRecords;
	}

	public Set getWorkshopReservations_2() {
		return this.workshopReservations_2;
	}

	public void setWorkshopReservations_2(Set workshopReservations_2) {
		this.workshopReservations_2 = workshopReservations_2;
	}

	public Set getWorkshopReservations_3() {
		return this.workshopReservations_3;
	}

	public void setWorkshopReservations_3(Set workshopReservations_3) {
		this.workshopReservations_3 = workshopReservations_3;
	}

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String start = df.format(this.getStartDate());
		String end = df.format(this.getEndDate());
		String temp = "";
		if (start.compareTo(end) == 0) {
			temp = this.getName() + " [on " + start + " at "
					+ this.getTimeDuration() + "] in " + this.getLocation();
		} else {
			temp = this.getName() + " [from " + start + " to " + end + " at "
					+ this.getTimeDuration() + "] in " + this.getLocation()
					+ " [" + workshopReservations.size() + "/"
					+ this.getMaxCapacity() + "] seats filled";
			;
		}

		return temp;
	}

}