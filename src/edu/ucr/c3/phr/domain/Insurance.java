package edu.ucr.c3.phr.domain;

import java.util.Date;

/**
 * Insurance entity. @author MyEclipse Persistence Tools
 */

public class Insurance implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private String companyName;
	private Integer typeId;
	private String planName;
	private String planId;
	private String groupNumber;
	private String memberId;
	private String policyId;
	private String phone;
	private Date startDate;
	private Date endDate;
	private String fax;
	private Integer notesId;
	private Boolean isCurrent;
	private Short active;

	// Constructors

	/** default constructor */
	public Insurance() {
	}
	public Insurance(Integer pid, String company, String planName, 
			String planId,String group_num,String memberID, String policy, 
			String phone, Date start, Date end, Boolean current, short active)
	{
		this.pid = pid;
		this.companyName=company;
		this.planName=planName;
		this.planId= planId;
		this.groupNumber=group_num;
		this.memberId= memberID;
		this.policyId=policy;
		this.phone=phone;
		this.startDate=start;
		this.endDate=end;
		this.isCurrent=current;
		this.active=active;
		
		
	}
	/** minimal constructor */
	public Insurance(Integer id, Integer pid) {
		this.id = id;
		this.pid = pid;
	}

	/** full constructor */
	public Insurance(Integer id, Integer pid, String companyName,
			Integer typeId, String planName, String planId, String groupNumber,
			String memberId, String policyId, String phone, Date startDate,
			Date endDate, String fax, Integer notesId, Boolean isCurrent,
			Short active) {
		this.id = id;
		this.pid = pid;
		this.companyName = companyName;
		this.typeId = typeId;
		this.planName = planName;
		this.planId = planId;
		this.groupNumber = groupNumber;
		this.memberId = memberId;
		this.policyId = policyId;
		this.phone = phone;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fax = fax;
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

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getGroupNumber() {
		return this.groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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