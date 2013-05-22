package edu.ucr.c3.wms.controller.manager.forms;

import java.util.Date;
import java.util.List;

import edu.ucr.c3.wms.helper.validators.BaseValidator;
import edu.ucr.c3.wms.domain.AcademicTerm;

public class SectionForm {
	private int sectId = BaseValidator.NOT_SELECTED;
	private Short year = null;
	private int termId = BaseValidator.NOT_SELECTED;
	private String termName;
	private int labclassId = BaseValidator.NOT_SELECTED;
	private String name;
	private Date startDate;
	private Date endDate;
	private String weeklyDay1;
	private String time1;
	private String weeklyDay2 = "";
	private String time2 = "";
	private String weeklyDay3 = "";
	private String time3 = "";
	private String weeklyDay4 = "";
	private String time4 = "";
	private String weeklyDay5 = "";
	private String time5 = "";
	private String location;
	private Integer maxCap = null;
	private Short daysEarly = null;
	private String comments;
	private List<AcademicTerm> terms;
	
	public int getSectId() {
		return sectId;
	}
	public void setSectId(int sectId) {
		this.sectId = sectId;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public int getTermId() {
		return termId;
	}
	public void setTermId(int termId) {
		this.termId = termId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public String getTime3() {
		return time3;
	}
	public void setTime3(String time3) {
		this.time3 = time3;
	}
	public String getTime4() {
		return time4;
	}
	public void setTime4(String time4) {
		this.time4 = time4;
	}
	public String getTime5() {
		return time5;
	}
	public void setTime5(String time5) {
		this.time5 = time5;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMaxCap() {
		return maxCap;
	}
	public void setMaxCap(int maxCap) {
		this.maxCap = maxCap;
	}
	public short getDaysEarly() {
		return daysEarly;
	}
	public void setDaysEarly(short daysEarly) {
		this.daysEarly = daysEarly;
	}
	public List<AcademicTerm> getTerms() {
		return terms;
	}
	public void setTerms(List<AcademicTerm> terms) {
		this.terms = terms;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getComments() {
		return comments;
	}
	public int getLabclassId() {
		return labclassId;
	}
	public void setLabclassId(int labclassId) {
		this.labclassId = labclassId;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public String getTermName() {
		return termName;
	}
	public void setWeeklyDay1(String weeklyDay1) {
		this.weeklyDay1 = weeklyDay1;
	}
	public String getWeeklyDay1() {
		return weeklyDay1;
	}
	public void setWeeklyDay2(String weeklyDay2) {
		this.weeklyDay2 = weeklyDay2;
	}
	public String getWeeklyDay2() {
		return weeklyDay2;
	}
	public void setWeeklyDay3(String weeklyDay3) {
		this.weeklyDay3 = weeklyDay3;
	}
	public String getWeeklyDay3() {
		return weeklyDay3;
	}
	public void setWeeklyDay4(String weeklyDay4) {
		this.weeklyDay4 = weeklyDay4;
	}
	public String getWeeklyDay4() {
		return weeklyDay4;
	}
	public void setWeeklyDay5(String weeklyDay5) {
		this.weeklyDay5 = weeklyDay5;
	}
	public String getWeeklyDay5() {
		return weeklyDay5;
	}
}
