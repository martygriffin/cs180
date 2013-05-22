package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Section entity. @author MyEclipse Persistence Tools
 */

public class Section implements java.io.Serializable {

	// Fields

	private Integer id;
	private AcademicTerm academicTerm;
	private Labclass labclass;
	private Short academicYear;
	private String name;
	private Date startDate;
	private Date endDate;
	private String weeklyday;
	private String timeDuration;
	private String location;
	private Integer maxCapacity;
	private Short openAdvanceDay;
	private String comments;
	private Timestamp timeStamp;
	private Short active;
	private Set labclassReservations = new HashSet(0);
	private Set weeklySchedules = new HashSet(0);
	private Set labclassReservations_1 = new HashSet(0);
	private Set labclassReservations_2 = new HashSet(0);
	private Set labclassReservationRecords = new HashSet(0);

	// Constructors

	/** default constructor */
	public Section() {
	}

	/** minimal constructor */
	public Section(AcademicTerm academicTerm, Labclass labclass,
			Short academicYear, String name, Date startDate, Date endDate,
			String weeklyday, String timeDuration, String location,
			Integer maxCapacity, Short openAdvanceDay, Timestamp timeStamp,
			Short active) {
		this.academicTerm = academicTerm;
		this.labclass = labclass;
		this.academicYear = academicYear;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.weeklyday = weeklyday;
		this.timeDuration = timeDuration;
		this.location = location;
		this.maxCapacity = maxCapacity;
		this.openAdvanceDay = openAdvanceDay;
		this.timeStamp = timeStamp;
		this.active = active;
	}

	/** full constructor */
	public Section(AcademicTerm academicTerm, Labclass labclass,
			Short academicYear, String name, Date startDate, Date endDate,
			String weeklyday, String timeDuration, String location,
			Integer maxCapacity, Short openAdvanceDay, String comments,
			Timestamp timeStamp, Short active, Set labclassReservations,
			Set weeklySchedules, Set labclassReservations_1,
			Set labclassReservations_2, Set labclassReservationRecords) {
		this.academicTerm = academicTerm;
		this.labclass = labclass;
		this.academicYear = academicYear;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.weeklyday = weeklyday;
		this.timeDuration = timeDuration;
		this.location = location;
		this.maxCapacity = maxCapacity;
		this.openAdvanceDay = openAdvanceDay;
		this.comments = comments;
		this.timeStamp = timeStamp;
		this.active = active;
		this.labclassReservations = labclassReservations;
		this.weeklySchedules = weeklySchedules;
		this.labclassReservations_1 = labclassReservations_1;
		this.labclassReservations_2 = labclassReservations_2;
		this.labclassReservationRecords = labclassReservationRecords;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AcademicTerm getAcademicTerm() {
		return this.academicTerm;
	}

	public void setAcademicTerm(AcademicTerm academicTerm) {
		this.academicTerm = academicTerm;
	}

	public Labclass getLabclass() {
		return this.labclass;
	}

	public void setLabclass(Labclass labclass) {
		this.labclass = labclass;
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

	public String getWeeklyday() {
		return this.weeklyday;
	}

	public void setWeeklyday(String weeklyday) {
		this.weeklyday = weeklyday;
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
				.format(this.startDate)
				+ " on " + this.getWeeklyday() : df.format(this.startDate)
				+ " to " + df.format(this.endDate) + " on "
				+ this.getWeeklyday();
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
	public Set getLabclassReservations() {
		Set res = new HashSet();
		for (Object s : labclassReservations) {
			if (((LabclassReservation) s).getReservationStatus().getId() == 0)
				res.add(s);
		}
		return res;
	}

	public void setLabclassReservations(Set labclassReservations) {
		this.labclassReservations = labclassReservations;
	}

	public Set getWeeklySchedules() {
		return this.weeklySchedules;
	}

	public void setWeeklySchedules(Set weeklySchedules) {
		this.weeklySchedules = weeklySchedules;
	}

	public Set getLabclassReservations_1() {
		return this.labclassReservations_1;
	}

	public void setLabclassReservations_1(Set labclassReservations_1) {
		this.labclassReservations_1 = labclassReservations_1;
	}

	public Set getLabclassReservations_2() {
		return this.labclassReservations_2;
	}

	public void setLabclassReservations_2(Set labclassReservations_2) {
		this.labclassReservations_2 = labclassReservations_2;
	}

	public Set getLabclassReservationRecords() {
		return this.labclassReservationRecords;
	}

	public void setLabclassReservationRecords(Set labclassReservationRecords) {
		this.labclassReservationRecords = labclassReservationRecords;
	}

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String start = df.format(this.getStartDate());
		String end = df.format(this.getEndDate());
		String temp = "";
		String more = " and more";
		if (start.compareTo(end) == 0 && this.getWeeklySchedules().size() > 0) {
			temp = this.getName() + " on " + start + " on ["
					+ this.getWeeklyday() +" "+ this.getTimeDuration() + more
					+ "] in " + this.getLocation();
		}
		if (start.compareTo(end) == 0 && this.getWeeklySchedules().size() <= 0) {
			temp = this.getName() + " on " + start + " on ["
					+ this.getWeeklyday() +" "+ this.getTimeDuration() + "] in "
					+ this.getLocation();
		} else if (!(start.compareTo(end) == 0)
				&& this.getWeeklySchedules().size() > 0) {
			temp = this.getName() + " starting " + start + " until " + end
					+ " on [" + this.getWeeklyday()+" " + this.getTimeDuration()
					+ more + "] in " + this.getLocation();
		} else {
			temp = this.getName() + " starting " + start + " until " + end
					+ " on [" + this.getWeeklyday() +" "+ this.getTimeDuration()
					+ "] in " + this.getLocation();
		}
		return temp;
	}

}