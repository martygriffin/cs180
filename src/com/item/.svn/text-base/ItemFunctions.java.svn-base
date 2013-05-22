package com.item;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.hibernate.Item;
import com.hibernate.ItemDAO;
import com.hibernate.Log;
import com.hibernate.User;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;


public class ItemFunctions extends BaseAction  implements ModelDriven, Preparable {
	private ItemForm form = new ItemForm();
	private ItemDAO itemdao = new ItemDAO();
	private Item item = new Item();
	
	public String execute() throws SBRException {
		return "success";
	}

	public String viewItems() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setItems(svc.getAllItems());
		return "view";
	}
	
	public String viewDeletedItems() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setItems(svc.getAllDeletedItems());
		return "viewdeleted";
	}
	
	public String itemActive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Item tempitem = svc.getItemByID(id);
		tempitem.setIsActive(true);
		svc.saveItem(tempitem);
		String temp = "item " + id +" undeleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}
	
	public String itemInactive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Item tempitem = svc.getItemByID(id);
		tempitem.setIsActive(false);
		svc.saveItem(tempitem);
		String temp = "item " + id +" delted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}
	
	public String popItemField() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Item tempitem = svc.getItemByID(id);
		form.setName(tempitem.getName() );
		form.setDescription(tempitem.getDescription() );
		form.setPrice(tempitem.getPrice().toString());
		form.setIntegrdients(tempitem.getIngredients());
		form.setIsExtra(tempitem.getIsExtra());
		form.setIsDrink(tempitem.getIsDrink());
		form.setIsSide(tempitem.getIsSide());
		form.setIsFastready(tempitem.getIsFastready());
		session.put("id", id);
		return "load/edit";

	}
	
	public String edit()
	{
		int id = (Integer)session.get("id");
		
		if(checkEditFormForErrors())
		{
			session.put("id", id);
			return "erroredit";
		}
		
		CCRService svc = (CCRService)getService("CCRService");
		Item tempitem = svc.getItemByID(id);
		tempitem.setName(form.getName() );
		tempitem.setDescription(form.getDescription() );
		tempitem.setPrice(Double.parseDouble(form.getPrice()));
		tempitem.setIngredients(form.getIntegrdients() );
		tempitem.setIsSide(form.getIsSide() );
		tempitem.setIsDrink(form.getIsDrink() );
		tempitem.setIsExtra(form.getIsExtra() );
		tempitem.setIsFastready(form.getIsFastready() );
		svc.saveItem(tempitem);
		String temp = "item " + id +" edited";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		session.remove("id");
		return "edited";

	}
	
	public String addItem()throws SBRException
	{
		if(checkAddFormForErrors())
       	{	
			return "erroradd";
       	}
		String name = form.getName();
		String description = form.getDescription();
		String integrdients = form.getIntegrdients();
		Boolean isside = form.getIsSide();
		Boolean isdrink = form.getIsDrink();
		String isextra = form.getIsExtra();
		Boolean isfastready = form.getIsFastready();
		Double price = Double.parseDouble(form.getPrice());
	
		
		CCRService svc = (CCRService)getService("CCRService");	
		com.hibernate.Item to_insert = new com.hibernate.Item(name,price,  true, isside, isdrink, isextra, isfastready);
		to_insert.setIngredients(integrdients);
		to_insert.setDescription(description);

		svc.saveItem(to_insert);
		String temp = "item " + name +" added";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		
		
		return "edited";
	}

	public boolean checkAddFormForErrors()
	{
		boolean error = false;
		String name = form.getName();
		String description = form.getDescription();
		String price = form.getPrice();
		
		if(name.isEmpty())
		{
			 addActionError("Item Name is Emtpy");
			 if(!error)
			 {
				 error=true;
			 }
		}
	
		else {
			CCRService svc = (CCRService)getService("CCRService");	
			form.setItems(svc.getAllItems());
			for (Item i: form.getItems() ) {
				if ( i.getName().toLowerCase().compareTo(name.toLowerCase()) == 0  ) {
					addActionError("An item with that name already Exists, go to the Items page and edit it instead");
					if(!error) {
						error = true;
					}
				}
			}
			
			form.setItems( svc.getAllDeletedItems() );
			for (Item i: form.getItems() ) {
				if (i.getName().toLowerCase().compareTo(name.toLowerCase()) == 0) {
					addActionError("An inactive item with that name already Exists, go to the Deleted Items page and edit it instead");
					if(!error) {
						error = true;

					}
				}
			}
		}
		
		if(description.isEmpty())
		{
			 addActionError("Item description is Emtpy");
			 if(!error)
			 {
				 error=true;
			 }
		}
	
		if(price.isEmpty() )
		{
			 addActionError("Price cannot be empty and must be in the form Dollars.Cents");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		else if( !Pattern.matches("\\d*[.]?\\d*", price) )
		{
			 addActionError("Price cannot be empty and must be in the form Dollars.Cents");
			 if(!error)
			 {
				 error=true;
			 }
		}

		return error;
	}
	
	public boolean checkEditFormForErrors()
	{
		boolean error = false;
		String name = form.getName();
		String description = form.getDescription();
		String price = form.getPrice();
		CCRService svc = (CCRService) getService("CCRService");
		int id = (Integer)session.get("id");
		Item test  = svc.getItemByID(id);
		if(!test.getName().toLowerCase().equals(name.toLowerCase()))
		{
			
			if(!(svc.getItemByName(name).isEmpty()))
			{
				addActionError("Item with same already exisits");
				if(!error)
				error = true;
			}
			
		}
		
		if(name.isEmpty())
		{
			 addActionError("Item Name is Emtpy");
			 if(!error)
			 {
				 error=true;
			 }
		}
	
		
		if(description.isEmpty())
		{
			 addActionError("Item description is Emtpy");
			 if(!error)
			 {
				 error=true;
			 }
		}
	
		if(price.isEmpty() )
		{
			 addActionError("Price cannot be empty and must be in the form Dollars.Cents");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		else if( !Pattern.matches("\\d*[.]?\\d*", price) )
		{
			 addActionError("Price cannot be empty and must be in the form Dollars.Cents");
			 if(!error)
			 {
				 error=true;
			 }
		}

		return error;
	}
	
	@Override
	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(ItemForm form) {
		this.form = form;
	}
	public ItemForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
