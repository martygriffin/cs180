package com.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private String menuName;
	private String description;
	private Boolean isActive;
	private Set menuItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(String menuName, String description, Boolean isActive) {
		this.menuName = menuName;
		this.description = description;
		this.isActive = isActive;
	}

	/** full constructor */
	public Menu(String menuName, String description, Boolean isActive,
			Set menuItems) {
		this.menuName = menuName;
		this.description = description;
		this.isActive = isActive;
		this.menuItems = menuItems;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Set getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set menuItems) {
		this.menuItems = menuItems;
	}

}