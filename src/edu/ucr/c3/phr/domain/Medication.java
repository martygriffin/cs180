package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Medication entity. @author MyEclipse Persistence Tools
 */

public class Medication implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private Date dateStarted;
	private Date dateStopped;
	private String name;
	private String nameType;
	private String nameValue;
	private String nameAbbrev;
	private String brandName;
	private String brandNameType;
	private String brandNameValue;
	private String brandNameAbbrev;
	private String doseTextvalue;
	private String doseValue;
	private String doseUnit;
	private String doseUnitType;
	private String doseUnitValue;
	private String doseUnitTypeAbbrev;
	private String route;
	private String routeType;
	private String routeValue;
	private String routeAbbrev;
	private String strengthTextvalue;
	private String strengthValue;
	private String strengthUnit;
	private String strengthUnitType;
	private String strengthUnitValue;
	private String strengthUnitAbbrev;
	private String frequency;
	private String frequencyType;
	private String frequencyValue;
	private String frequencyAbbrev;
	private Integer prescribedByName;
	private Integer prescribedByInstitution;
	private Date prescribedOn;
	private Date prescribedStopOn;
	private Short dispenseAsWritten;
	private String prescriptionDuration;
	private String prescriptionRefillInfo;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Medication() {
	}
public Medication(Integer pid,Date dateStarted, Date dateStopped,String name,
		String doseTextvalue,String route,String frequency,String strengthTextvalue
		,Boolean isCurrent,Short active)
{
	this.pid=pid;
	this.dateStarted=dateStarted;
	this.dateStopped=dateStopped;
	this.name=name;
	this.doseTextvalue=doseTextvalue;
	this.route=route;
	this.frequency=frequency;
	this.strengthTextvalue=strengthTextvalue;
	this.isCurrent=isCurrent;
	this.active=active;
}
		
	/** full constructor */
	public Medication(Integer pid, Date dateStarted, Date dateStopped,
			String name, String nameType, String nameValue, String nameAbbrev,
			String brandName, String brandNameType, String brandNameValue,
			String brandNameAbbrev, String doseTextvalue, String doseValue,
			String doseUnit, String doseUnitType, String doseUnitValue,
			String doseUnitTypeAbbrev, String route, String routeType,
			String routeValue, String routeAbbrev, String strengthTextvalue,
			String strengthValue, String strengthUnit, String strengthUnitType,
			String strengthUnitValue, String strengthUnitAbbrev,
			String frequency, String frequencyType, String frequencyValue,
			String frequencyAbbrev, Integer prescribedByName,
			Integer prescribedByInstitution, Date prescribedOn,
			Date prescribedStopOn, Short dispenseAsWritten,
			String prescriptionDuration, String prescriptionRefillInfo,
			Integer notesId, Boolean isCurrent, Short active) {
		this.pid = pid;
		this.dateStarted = dateStarted;
		this.dateStopped = dateStopped;
		this.name = name;
		this.nameType = nameType;
		this.nameValue = nameValue;
		this.nameAbbrev = nameAbbrev;
		this.brandName = brandName;
		this.brandNameType = brandNameType;
		this.brandNameValue = brandNameValue;
		this.brandNameAbbrev = brandNameAbbrev;
		this.doseTextvalue = doseTextvalue;
		this.doseValue = doseValue;
		this.doseUnit = doseUnit;
		this.doseUnitType = doseUnitType;
		this.doseUnitValue = doseUnitValue;
		this.doseUnitTypeAbbrev = doseUnitTypeAbbrev;
		this.route = route;
		this.routeType = routeType;
		this.routeValue = routeValue;
		this.routeAbbrev = routeAbbrev;
		this.strengthTextvalue = strengthTextvalue;
		this.strengthValue = strengthValue;
		this.strengthUnit = strengthUnit;
		this.strengthUnitType = strengthUnitType;
		this.strengthUnitValue = strengthUnitValue;
		this.strengthUnitAbbrev = strengthUnitAbbrev;
		this.frequency = frequency;
		this.frequencyType = frequencyType;
		this.frequencyValue = frequencyValue;
		this.frequencyAbbrev = frequencyAbbrev;
		this.prescribedByName = prescribedByName;
		this.prescribedByInstitution = prescribedByInstitution;
		this.prescribedOn = prescribedOn;
		this.prescribedStopOn = prescribedStopOn;
		this.dispenseAsWritten = dispenseAsWritten;
		this.prescriptionDuration = prescriptionDuration;
		this.prescriptionRefillInfo = prescriptionRefillInfo;
		this.notesId = notesId;
		this.isCurrent = isCurrent;
		this.active = active;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Date getDateStarted() {
		return this.dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public Date getDateStopped() {
		return this.dateStopped;
	}

	public void setDateStopped(Date dateStopped) {
		this.dateStopped = dateStopped;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getNameValue() {
		return this.nameValue;
	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public String getNameAbbrev() {
		return this.nameAbbrev;
	}

	public void setNameAbbrev(String nameAbbrev) {
		this.nameAbbrev = nameAbbrev;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandNameType() {
		return this.brandNameType;
	}

	public void setBrandNameType(String brandNameType) {
		this.brandNameType = brandNameType;
	}

	public String getBrandNameValue() {
		return this.brandNameValue;
	}

	public void setBrandNameValue(String brandNameValue) {
		this.brandNameValue = brandNameValue;
	}

	public String getBrandNameAbbrev() {
		return this.brandNameAbbrev;
	}

	public void setBrandNameAbbrev(String brandNameAbbrev) {
		this.brandNameAbbrev = brandNameAbbrev;
	}

	public String getDoseTextvalue() {
		return this.doseTextvalue;
	}

	public void setDoseTextvalue(String doseTextvalue) {
		this.doseTextvalue = doseTextvalue;
	}

	public String getDoseValue() {
		return this.doseValue;
	}

	public void setDoseValue(String doseValue) {
		this.doseValue = doseValue;
	}

	public String getDoseUnit() {
		return this.doseUnit;
	}

	public void setDoseUnit(String doseUnit) {
		this.doseUnit = doseUnit;
	}

	public String getDoseUnitType() {
		return this.doseUnitType;
	}

	public void setDoseUnitType(String doseUnitType) {
		this.doseUnitType = doseUnitType;
	}

	public String getDoseUnitValue() {
		return this.doseUnitValue;
	}

	public void setDoseUnitValue(String doseUnitValue) {
		this.doseUnitValue = doseUnitValue;
	}

	public String getDoseUnitTypeAbbrev() {
		return this.doseUnitTypeAbbrev;
	}

	public void setDoseUnitTypeAbbrev(String doseUnitTypeAbbrev) {
		this.doseUnitTypeAbbrev = doseUnitTypeAbbrev;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getRouteType() {
		return this.routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getRouteValue() {
		return this.routeValue;
	}

	public void setRouteValue(String routeValue) {
		this.routeValue = routeValue;
	}

	public String getRouteAbbrev() {
		return this.routeAbbrev;
	}

	public void setRouteAbbrev(String routeAbbrev) {
		this.routeAbbrev = routeAbbrev;
	}

	public String getStrengthTextvalue() {
		return this.strengthTextvalue;
	}

	public void setStrengthTextvalue(String strengthTextvalue) {
		this.strengthTextvalue = strengthTextvalue;
	}

	public String getStrengthValue() {
		return this.strengthValue;
	}

	public void setStrengthValue(String strengthValue) {
		this.strengthValue = strengthValue;
	}

	public String getStrengthUnit() {
		return this.strengthUnit;
	}

	public void setStrengthUnit(String strengthUnit) {
		this.strengthUnit = strengthUnit;
	}

	public String getStrengthUnitType() {
		return this.strengthUnitType;
	}

	public void setStrengthUnitType(String strengthUnitType) {
		this.strengthUnitType = strengthUnitType;
	}

	public String getStrengthUnitValue() {
		return this.strengthUnitValue;
	}

	public void setStrengthUnitValue(String strengthUnitValue) {
		this.strengthUnitValue = strengthUnitValue;
	}

	public String getStrengthUnitAbbrev() {
		return this.strengthUnitAbbrev;
	}

	public void setStrengthUnitAbbrev(String strengthUnitAbbrev) {
		this.strengthUnitAbbrev = strengthUnitAbbrev;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}

	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public String getFrequencyValue() {
		return this.frequencyValue;
	}

	public void setFrequencyValue(String frequencyValue) {
		this.frequencyValue = frequencyValue;
	}

	public String getFrequencyAbbrev() {
		return this.frequencyAbbrev;
	}

	public void setFrequencyAbbrev(String frequencyAbbrev) {
		this.frequencyAbbrev = frequencyAbbrev;
	}

	public Integer getPrescribedByName() {
		return this.prescribedByName;
	}

	public void setPrescribedByName(Integer prescribedByName) {
		this.prescribedByName = prescribedByName;
	}

	public Integer getPrescribedByInstitution() {
		return this.prescribedByInstitution;
	}

	public void setPrescribedByInstitution(Integer prescribedByInstitution) {
		this.prescribedByInstitution = prescribedByInstitution;
	}

	public Date getPrescribedOn() {
		return this.prescribedOn;
	}

	public void setPrescribedOn(Date prescribedOn) {
		this.prescribedOn = prescribedOn;
	}

	public Date getPrescribedStopOn() {
		return this.prescribedStopOn;
	}

	public void setPrescribedStopOn(Date prescribedStopOn) {
		this.prescribedStopOn = prescribedStopOn;
	}

	public Short getDispenseAsWritten() {
		return this.dispenseAsWritten;
	}

	public void setDispenseAsWritten(Short dispenseAsWritten) {
		this.dispenseAsWritten = dispenseAsWritten;
	}

	public String getPrescriptionDuration() {
		return this.prescriptionDuration;
	}

	public void setPrescriptionDuration(String prescriptionDuration) {
		this.prescriptionDuration = prescriptionDuration;
	}

	public String getPrescriptionRefillInfo() {
		return this.prescriptionRefillInfo;
	}

	public void setPrescriptionRefillInfo(String prescriptionRefillInfo) {
		this.prescriptionRefillInfo = prescriptionRefillInfo;
	}

	public Integer getNotesId() {
		return this.notesId;
	}

	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	public Boolean getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

}