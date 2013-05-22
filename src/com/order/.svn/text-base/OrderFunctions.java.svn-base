package com.order;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.hibernate.Coupon;
import com.hibernate.Custom;
import com.hibernate.Item;
import com.hibernate.ItemsOrdered;
import com.hibernate.Log;
import com.hibernate.Order;
import com.menu.MenuForm;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;


public class OrderFunctions extends BaseAction  implements ModelDriven, Preparable {
	private OrderForm form = new OrderForm();
	
	public String execute() throws SBRException {
		return "success";
	}
	public String unfilled()throws SBRException
	{
		
		CCRService svc = (CCRService)getService("CCRService");	
		form.setOrder_list(svc.getAllUnfilledOrders());
		System.out.println("orders " +svc.getAllUnfilledOrders());
		return "unfilled";
	}
	public String details()throws SBRException
	{
		
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");	
		Order current_order= svc.findOrderbyID(id);
		Set<ItemsOrdered> menuItems = current_order.getItemsOrdereds();
		List<Item> current_order_items = new ArrayList();
		Set<Custom> customizations = current_order.getCustoms();
		double total = 0;
		for(ItemsOrdered e: menuItems)
		{
			current_order_items.add(e.getItem());
			total+=e.getItem().getPrice();
		}
		for(Custom e: customizations)
		{
			total+= e.getPrice();
		}
		if(current_order.getCoupon()!=null)
		{
			Coupon c =current_order.getCoupon();
			if(c.getDiscountType().contains("$"))
			{
				total -=  c.getDiscountValue();
			}
			else
			{
				total = total *(1-c.getDiscountValue());
			}
		}
		//System.out.println(current_order.getCoupon());
		//System.out.println(current_order.getCoupon().getName());
		DecimalFormat formattedtotal= new DecimalFormat("#.##");
		total = Double.valueOf(formattedtotal.format(total));
		form.setItem_list(current_order_items);
		form.setCurrent_order(current_order);
		form.setTotal(total);
		form.setCustomList(customizations);
		
		return "details";
	}
	public String markComplete()throws SBRException
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");	
		Order current_order= svc.findOrderbyID(id);
		if(current_order.getStatus().equals("Unfilled"))
		{	current_order.setStatus("Completed");
		String temp = "Order " + id +" marked completed";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		svc.saveOrder(current_order);
		return  "markedComplete";
		}
		else
		{
			current_order.setStatus("Unfilled");
			String temp = "Order " + id +" marked Unfilled";
			 java.util.Date date= new java.util.Date();
			Timestamp t = new Timestamp(date.getTime());
			Log l = new Log (temp, t);
			svc.saveLogEntry(l);
			svc.saveOrder(current_order);
			return  "markedUnfilled";
		}
		
		
		
		
	}
	public String completed()throws SBRException
	{
		
		CCRService svc = (CCRService)getService("CCRService");
		form.setOrder_list(svc.getAllCompletedOrders());
		return  "completed";
	}
	public String delete()throws SBRException
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Order o = svc.findOrderbyID(id);
		svc.deleteOrder(o);
		String temp = "Order " + id +" deleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "deleted";
	}
	public String deleted()throws SBRException
	{
	
		CCRService svc = (CCRService)getService("CCRService");
		form.setOrder_list(svc.getAllDeletedOrders());
		return "view_deleted";
	}
	public String undelete()throws SBRException
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Order o = svc.findOrderbyID(id);
		System.out.println(o.getIsActive());
		o.setIsActive(true);
		System.out.println(o.getIsActive());
		svc.saveOrder(o);
		String temp = "Order " + id +" undeleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
	return "undeleted";	
	}
	@Override
	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(OrderForm form) {
		this.form = form;
	}
	public OrderForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
