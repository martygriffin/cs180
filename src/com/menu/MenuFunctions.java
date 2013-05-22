package com.menu;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.LoginForm;
import edu.ucr.c3.wms.domain.Manager;
import edu.ucr.c3.wms.helper.dataholder.LoginManager;
import com.hibernate.*;

public class MenuFunctions extends BaseAction  implements ModelDriven, Preparable {
	private MenuForm form = new MenuForm();
	
	public String execute() throws SBRException {
		return "success";
	}
	public String add()throws SBRException
	{
		String name = form.getMenuName();
		String description = form.getDescription();
	//	System.out.println(name + description);
		CCRService svc = (CCRService)getService("CCRService");	
		com.hibernate.Menu to_insert = new com.hibernate.Menu(name, description, true);
		if(checkEditFormForError())
		{
			return "erroradd";
		}

		svc.saveMenu(to_insert);
		String temp = "Menu " + name +" added";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		
		
		return "edited";
	}
	public boolean checkAddFormForError()
	{   
		boolean error = false;
		String name = form.getMenuName();
		String description = form.getDescription();
		System.out.println(error);
		CCRService svc = (CCRService) getService("CCRService");
		if(name.isEmpty())
		{
			addActionError("Menu Name is Emtpy");
			if(!error)
				error=true;
		}
		else if (!svc.findMenuByName(name).isEmpty()) {
			addActionError("A menu with this name already exists");
			if(!error)
				error=true;
		}

		if(description .isEmpty())
		{
			addActionError("Menu description is Emtpy");
			if(!error)
				error=true;
		}
		
		
		
		
		return error;
		
	}
	
	public boolean checkEditFormForError()
	{   
		boolean error = false;
		String name = form.getMenuName();
		String description = form.getDescription();
		System.out.println(error);
		CCRService svc = (CCRService) getService("CCRService");
		if(name.isEmpty())
		{
			addActionError("Menu Name is Emtpy");
			if(!error)
				error=true;
		}
		else
		{
			for(Menu test :svc.getAllMenus()){
			if(!test.getMenuName().toLowerCase().equals(name.toLowerCase()))
			{
				
				if(!svc.findMenuByName(name).isEmpty())
				{
					addActionError("Menu with same name already exists");
					if(!error)
					error = true;
					break;
				}
				
				
				
			}
		}
		}
		if(description .isEmpty())
		{
			addActionError("Menu description is Emtpy");
			if(!error)
				error=true;
		}
		
	if(	session.get("id")!=null)
	{
		int id = (Integer)session.get("id");
		Menu test  = svc.getMenuByID(id);
		if(!test.getMenuName().toLowerCase().equals(name.toLowerCase()))
		{
			
			if(!svc.findMenuByName(name).isEmpty())
			{
				addActionError("Menu with same name already exists");
				if(!error)
				error = true;
			}
			
			
			
		}
		if(description .isEmpty())
		{
			addActionError("Menu description is Emtpy");
			if(!error)
				error=true;
		}
		
	}
	
	
	
	
		
		return error;
		
	}
	
	public String userViewMenu(){
		CCRService svc = (CCRService)getService("CCRService");	
		form.setMenus(svc.getAllMenus());
		form.setSidebar(svc.getAllSocial());
		return "userViewMenu";
	}
	public String viewMenus() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setMenus(svc.getAllMenus());
		return "view";
	}
	
	public String viewInactiveMenus() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setMenus(svc.getAllDeletedMenus());
		return "viewdeleted";
	}
	
	public String edit()
	{
		int id = (Integer)session.get("id");
	
		System.out.println(id);
		if(checkEditFormForError())
		{
		//	popMenuField();
			return "erroredit";
		}
		CCRService svc = (CCRService)getService("CCRService");
		Menu tempmen = svc.getMenuByID(id);
	
		String name = form.getMenuName();
		System.out.println(form.getMenuName());
		tempmen.setMenuName(name );
		tempmen.setDescription(form.getDescription() ) ;
		String temp = "item " + name +" edited";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		session.remove("id");
		session.remove("itemList");
		
		return "edited";

	}
	public String viewItems()
	{

		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Menu m = svc.getMenuByID(id);
		form.setItemList(m.getMenuItems());
		form.setSidebar(svc.getAllSocial());
		form.setMenuName(m.getMenuName());
		
		return "userViewItems";
	}
	public String getItems()
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		form.setItems(svc.getAllItems());
		session.put("id", id);
		return "items";
	}
	//adds item to menu
	public String Items()
	{
		int menu_id = (Integer)session.get("id");
		CCRService svc = (CCRService)getService("CCRService");
		
		if (check_add_item_to_menu_error( menu_id) ) {
			form.setItems(svc.getAllItems());
			return "error_add_item";
		}
		
	
		//System.out.println(form.getSelectedItem().substring(0,form.getSelectedItem().indexOf(" Description")));
		Item current = svc.getItemByName(form.getSelectedItem().substring(0,form.getSelectedItem().indexOf(" Description"))).get(0);
		MenuItem m = new MenuItem(svc.getMenuByID(menu_id), current, true);
		svc.saveMenuItem(m);
	
		String temp = "item " + m.getItem().getName() +" added to "+ m.getMenu().getMenuName();
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		session.remove("id");
		
		return "edited";
	}
	
	private boolean check_add_item_to_menu_error(int menu_id) {
		boolean error = false;
		CCRService svc = (CCRService)getService("CCRService");
		Item current = svc.getItemByName(form.getSelectedItem().substring(0,form.getSelectedItem().indexOf(" Description"))).get(0);
		
		for (MenuItem m: svc.getAllMenuItems(menu_id)) {
			
			System.out.println(m.getItem().getItemId() + " = " + current.getItemId() );
			if (m.getItem().getItemId() == current.getItemId() ) {
				if (!error) {
					addActionError("That item is already on the menu");
					error = true;
				}
			}
		}
		
		return error;
	}
	public String editItems()
	{
		int id = form.getId();
		//int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Menu tempmen = svc.getMenuByID(id);
		
		form.setItemList(tempmen.getMenuItems());
		session.put("menu_id", id);		
		return"editItems";
	}
	public String deleteItem()
	{
		int id = Integer.valueOf(getParameter("id"));
		
		CCRService svc = (CCRService)getService("CCRService");
		MenuItem m = svc.findMenuItemByID(id);
		
		svc.deleteMenuItem(m);
		String temp = "item " + m.getItem().getName() +" delete from "+ m.getMenu().getMenuName();
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}
	public String menuInactive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Menu tempmen = svc.getMenuByID(id);
		tempmen.setIsActive(false);
		svc.saveMenu(tempmen);
		String temp = "item " + tempmen.getMenuName() +" deleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}
	
	public String menuActive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Menu tempmen = svc.getMenuByID(id);
		tempmen.setIsActive(true);
		svc.saveMenu(tempmen);
		String temp = "item " + tempmen.getMenuName() +" undeleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}

	public String popMenuField() {
		int id = Integer.valueOf(getParameter("id"));
		
//		if(id == 0)
//		{
//			id = (Integer) session.get("id");
//		}
		System.out.println("id"+(Integer) session.get("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Menu tempmen = svc.getMenuByID(id);
		form.setMenuName(tempmen.getMenuName());
		form.setDescription(tempmen.getDescription() );
		session.put("id", id);
		session.put("itemList",tempmen.getMenuItems());
		
		System.out.println(tempmen.getMenuItems());
		return "load/edit";

	}
	
	@Override
	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(MenuForm form) {
		this.form = form;
	}
	public MenuForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
