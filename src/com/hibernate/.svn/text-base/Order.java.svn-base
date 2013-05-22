package com.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private User user;
	private Coupon coupon;
	private String orderPassword;
	private Boolean isTogo;
	private Boolean isDelivery;
	private Boolean isActive;
	private String status;
	private Timestamp ordertime;
	private Set customs = new HashSet(0);
	private Set itemsOrdereds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(User user, String orderPassword, Boolean isTogo,
			Boolean isDelivery, Boolean isActive, String status,
			Timestamp ordertime) {
		this.user = user;
		this.orderPassword = orderPassword;
		this.isTogo = isTogo;
		this.isDelivery = isDelivery;
		this.isActive = isActive;
		this.status = status;
		this.ordertime = ordertime;
	}

	/** full constructor */
	public Order(User user, Coupon coupon, String orderPassword,
			Boolean isTogo, Boolean isDelivery, Boolean isActive,
			String status, Timestamp ordertime, Set customs, Set itemsOrdereds) {
		this.user = user;
		this.coupon = coupon;
		this.orderPassword = orderPassword;
		this.isTogo = isTogo;
		this.isDelivery = isDelivery;
		this.isActive = isActive;
		this.status = status;
		this.ordertime = ordertime;
		this.customs = customs;
		this.itemsOrdereds = itemsOrdereds;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Coupon getCoupon() {
		return this.coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public String getOrderPassword() {
		return this.orderPassword;
	}

	public void setOrderPassword(String orderPassword) {
		this.orderPassword = orderPassword;
	}

	public Boolean getIsTogo() {
		return this.isTogo;
	}

	public void setIsTogo(Boolean isTogo) {
		this.isTogo = isTogo;
	}

	public Boolean getIsDelivery() {
		return this.isDelivery;
	}

	public void setIsDelivery(Boolean isDelivery) {
		this.isDelivery = isDelivery;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	public Set getCustoms() {
		return this.customs;
	}

	public void setCustoms(Set customs) {
		this.customs = customs;
	}

	public Set getItemsOrdereds() {
		return this.itemsOrdereds;
	}

	public void setItemsOrdereds(Set itemsOrdereds) {
		this.itemsOrdereds = itemsOrdereds;
	}

}