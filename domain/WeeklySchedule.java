package edu.ucr.c3.wms.domain;

import java.sql.Timestamp;

/**
 * WeeklySchedule entity. @author MyEclipse Persistence Tools
 */

public class WeeklySchedule implements java.io.Serializable {

	// Fields

	private Integer id;
	private Section section;
	private String weeklyday;
	private String timeDuration;
	private String comments;
	private Timestamp timeStamp;

	// Constructors

	/** default constructor */
	public WeeklySchedule() {
	}

	/** minimal constructor */
	public WeeklySchedule(String weeklyday, String timeDuration,
			Timestamp timeStamp) {
		this.weeklyday = weeklyday;
		this.timeDuration = timeDuration;
		this.timeStamp = timeStamp;
	}

	/** full constructor */
	public WeeklySchedule(Section section, String weeklyday,
			String timeDuration, String comments, Timestamp timeStamp) {
		this.section = section;
		this.weeklyday = weeklyday;
		this.timeDuration = timeDuration;
		this.comments = comments;
		this.timeStamp = timeStamp;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
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
	public String toString(){
		return this.getWeeklyday() +" - " + this.getTimeDuration();
	}
	

}