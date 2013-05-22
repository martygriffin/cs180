package com.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item implements java.io.Serializable {

	// Fields

	private Integer itemId;
	private String name;
	private String description;
	private Double price;
	private String ingredients;
	private Boolean isActive;
	private Integer favoriteId;
	private Integer userId;
	private Integer customId;
	private Boolean isSide;
	private Boolean isDrink;
	private String isExtra;
	private Boolean isFastready;
	private String status;
	private String imageLocation;
	private Set favoriteses = new HashSet(0);
	private Set menuItems = new HashSet(0);
	private Set itemsOrdereds = new HashSet(0);
	private Set customs = new HashSet(0);
	private Set coupons = new HashSet(0);

	// Constructors

	/** default constructor */
	public Item() {
	}

	/** minimal constructor */
	public Item(String name, Double price, Boolean isActive, Boolean isSide,
			Boolean isDrink, String isExtra, Boolean isFastready) {
		this.name = name;
		this.price = price;
		this.isActive = isActive;
		this.isSide = isSide;
		this.isDrink = isDrink;
		this.isExtra = isExtra;
		this.isFastready = isFastready;
	}

	/** full constructor */
	public Item(String name, String description, Double price,
			String ingredients, Boolean isActive, Integer favoriteId,
			Integer userId, Integer customId, Boolean isSide, Boolean isDrink,
			String isExtra, Boolean isFastready, String status,
			String imageLocation, Set favoriteses, Set menuItems,
			Set itemsOrdereds, Set customs, Set coupons) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.ingredients = ingredients;
		this.isActive = isActive;
		this.favoriteId = favoriteId;
		this.userId = userId;
		this.customId = customId;
		this.isSide = isSide;
		this.isDrink = isDrink;
		this.isExtra = isExtra;
		this.isFastready = isFastready;
		this.status = status;
		this.imageLocation = imageLocation;
		this.favoriteses = favoriteses;
		this.menuItems = menuItems;
		this.itemsOrdereds = itemsOrdereds;
		this.customs = customs;
		this.coupons = coupons;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCustomId() {
		return this.customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public Boolean getIsSide() {
		return this.isSide;
	}

	public void setIsSide(Boolean isSide) {
		this.isSide = isSide;
	}

	public Boolean getIsDrink() {
		return this.isDrink;
	}

	public void setIsDrink(Boolean isDrink) {
		this.isDrink = isDrink;
	}

	public String getIsExtra() {
		return this.isExtra;
	}

	public void setIsExtra(String isExtra) {
		this.isExtra = isExtra;
	}

	public Boolean getIsFastready() {
		return this.isFastready;
	}

	public void setIsFastready(Boolean isFastready) {
		this.isFastready = isFastready;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageLocation() {
		return this.imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public Set getFavoriteses() {
		return this.favoriteses;
	}

	public void setFavoriteses(Set favoriteses) {
		this.favoriteses = favoriteses;
	}

	public Set getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set menuItems) {
		this.menuItems = menuItems;
	}

	public Set getItemsOrdereds() {
		return this.itemsOrdereds;
	}

	public void setItemsOrdereds(Set itemsOrdereds) {
		this.itemsOrdereds = itemsOrdereds;
	}

	public Set getCustoms() {
		return this.customs;
	}

	public void setCustoms(Set customs) {
		this.customs = customs;
	}

	public Set getCoupons() {
		return this.coupons;
	}

	public void setCoupons(Set coupons) {
		this.coupons = coupons;
	}
	public String toString()
	{
		return this.name + " Description: "+this.getDescription()+ " Price: "+ this.getPrice() + " FastReady: "+ this.getIsFastready();
	}

}