package com.hibernate;

/**
 * Custom entity. @author MyEclipse Persistence Tools
 */

public class Custom implements java.io.Serializable {

	// Fields

	private Integer customId;
	private Item item;
	private Order order;
	private String description;
	private Double price;
	private Boolean isActive;

	// Constructors

	/** default constructor */
	public Custom() {
	}

	/** minimal constructor */
	public Custom(Item item, String description, Boolean isActive) {
		this.item = item;
		this.description = description;
		this.isActive = isActive;
	}

	/** full constructor */
	public Custom(Item item, Order order, String description, Double price,
			Boolean isActive) {
		this.item = item;
		this.order = order;
		this.description = description;
		this.price = price;
		this.isActive = isActive;
	}

	// Property accessors

	public Integer getCustomId() {
		return this.customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}