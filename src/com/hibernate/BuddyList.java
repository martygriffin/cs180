package com.hibernate;

/**
 * BuddyList entity. @author MyEclipse Persistence Tools
 */

public class BuddyList implements java.io.Serializable {

	// Fields

	private Integer buddyId;
	private User user;
	private Integer userId2;
	private Boolean isActive;

	// Constructors

	/** default constructor */
	public BuddyList() {
	}

	/** full constructor */
	public BuddyList(User user, Integer userId2, Boolean isActive) {
		this.user = user;
		this.userId2 = userId2;
		this.isActive = isActive;
	}

	// Property accessors

	public Integer getBuddyId() {
		return this.buddyId;
	}

	public void setBuddyId(Integer buddyId) {
		this.buddyId = buddyId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUserId2() {
		return this.userId2;
	}

	public void setUserId2(Integer userId2) {
		this.userId2 = userId2;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}