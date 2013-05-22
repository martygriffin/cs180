package com.menu;

import java.util.List;
import java.util.Set;

import com.hibernate.Item;
import com.hibernate.Menu;
import com.hibernate.Social;

public class MenuForm
{
	private String menuName;
	private String description;
	private List<Menu> menus;
	private List<Item> items;
	private String[] selectedItems;
	private String selectedItem;
	private Set<Item> itemList;
	private List<Social> Sidebar;
//	private Item item;
	private int id;

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}



	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}



	public void setSelectedItems(String[] selectedItems) {
		this.selectedItems = selectedItems;
	}

	public String[] getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItem(String selectedItem) {
		this.selectedItem = selectedItem;
	}

	public String getSelectedItem() {
		return selectedItem;
	}

	public void setItemList(Set <Item> itemList) {
		this.itemList = itemList;
	}

	public Set<Item> getItemList() {
		return itemList;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuName() {
		return menuName;
	}



	public void setSidebar(List<Social> sidebar) {
		Sidebar = sidebar;
	}

	public List<Social> getSidebar() {
		return Sidebar;
	}

	
}