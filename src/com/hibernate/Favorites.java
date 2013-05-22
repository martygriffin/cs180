package com.hibernate;

/**
 * Favorites entity. @author MyEclipse Persistence Tools
 */

public class Favorites implements java.io.Serializable {

	// Fields

	private Integer favoriteId;
	private User user;
	private Item item;
	private Boolean isActive;

	// Constructors

	/** default constructor */
	public Favorites() {
	}

	/** full constructor */
	public Favorites(User user, Item item, Boolean isActive) {
		this.user = user;
		this.item = item;
		this.isActive = isActive;
	}

	// Property accessors

	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}