package com.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String phone;
	private String zip;
	private Boolean isActive;
	private Boolean isAdmn;
	private Set favoriteses = new HashSet(0);
	private Set buddyLists = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String email,
			String firstName, String lastName, Boolean isActive, Boolean isAdmn) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
		this.isAdmn = isAdmn;
	}

	/** full constructor */
	public User(String username, String password, String email,
			String firstName, String lastName, String address, String city,
			String state, String phone, String zip, Boolean isActive,
			Boolean isAdmn, Set favoriteses, Set buddyLists, Set orders) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.zip = zip;
		this.isActive = isActive;
		this.isAdmn = isAdmn;
		this.favoriteses = favoriteses;
		this.buddyLists = buddyLists;
		this.orders = orders;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsAdmn() {
		return this.isAdmn;
	}

	public void setIsAdmn(Boolean isAdmn) {
		this.isAdmn = isAdmn;
	}

	public Set getFavoriteses() {
		return this.favoriteses;
	}

	public void setFavoriteses(Set favoriteses) {
		this.favoriteses = favoriteses;
	}

	public Set getBuddyLists() {
		return this.buddyLists;
	}

	public void setBuddyLists(Set buddyLists) {
		this.buddyLists = buddyLists;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}