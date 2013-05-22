package com.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Coupon entity. @author MyEclipse Persistence Tools
 */

public class Coupon implements java.io.Serializable {

	// Fields

	private Integer couponId;
	private Item item;
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private String couponCode;
	private Integer numUsesAllowed;
	private String discountType;
	private Double discountValue;
	private Boolean isActive;
	private String requirmentText;
	private String requirmentValue;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Coupon() {
	}

	/** minimal constructor */
	public Coupon(String name, String description, Date startDate,
			Date endDate, String couponCode, Integer numUsesAllowed,
			String discountType, Double discountValue) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.couponCode = couponCode;
		this.numUsesAllowed = numUsesAllowed;
		this.discountType = discountType;
		this.discountValue = discountValue;
	}

	/** full constructor */
	public Coupon(Item item, String name, String description, Date startDate,
			Date endDate, String couponCode, Integer numUsesAllowed,
			String discountType, Double discountValue, Boolean isActive,
			String requirmentText, String requirmentValue, Set orders) {
		this.item = item;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.couponCode = couponCode;
		this.numUsesAllowed = numUsesAllowed;
		this.discountType = discountType;
		this.discountValue = discountValue;
		this.isActive = isActive;
		this.requirmentText = requirmentText;
		this.requirmentValue = requirmentValue;
		this.orders = orders;
	}

	// Property accessors

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getNumUsesAllowed() {
		return this.numUsesAllowed;
	}

	public void setNumUsesAllowed(Integer numUsesAllowed) {
		this.numUsesAllowed = numUsesAllowed;
	}

	public String getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getRequirmentText() {
		return this.requirmentText;
	}

	public void setRequirmentText(String requirmentText) {
		this.requirmentText = requirmentText;
	}

	public String getRequirmentValue() {
		return this.requirmentValue;
	}

	public void setRequirmentValue(String requirmentValue) {
		this.requirmentValue = requirmentValue;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}