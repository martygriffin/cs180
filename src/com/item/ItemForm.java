package com.item;

import java.util.List;
import com.hibernate.Item;


class ItemForm {
	private List<Item> items;
	private String name;
	private String description;
	private String price;
	private String integrdients;
	private Boolean isSide;
	private Boolean isDrink;
	private String isExtra;
	private Boolean isFastready;

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setIntegrdients(String integrdients) {
		this.integrdients = integrdients;
	}

	public String getIntegrdients() {
		return integrdients;
	}

	public void setIsSide(Boolean isSide) {
		this.isSide = isSide;
	}

	public Boolean getIsSide() {
		return isSide;
	}

	public void setIsDrink(Boolean isDrink) {
		this.isDrink = isDrink;
	}

	public Boolean getIsDrink() {
		return isDrink;
	}

	public void setIsExtra(String isExtra) {
		this.isExtra = isExtra;
	}

	public String getIsExtra() {
		return isExtra;
	}

	public void setIsFastready(Boolean isFastready) {
		this.isFastready = isFastready;
	}

	public Boolean getIsFastready() {
		return isFastready;
	}
}