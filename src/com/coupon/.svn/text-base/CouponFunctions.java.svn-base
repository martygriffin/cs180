package com.coupon;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.hibernate.Coupon;
import com.hibernate.Item;
import com.hibernate.ItemDAO;
import com.hibernate.Log;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;



public class CouponFunctions extends BaseAction implements ModelDriven,
Preparable {
private CouponForm form = new  CouponForm();

public String execute() throws SBRException {
	List<String> types = new ArrayList();
	types.add("% off");
	types.add("$ Amount Off");
	form.setType_List(types);
	CCRService svc = (CCRService)getService("CCRService");	
	form.setItems(svc.getAllItems());
return "success";
}
public String  view()
{
	CCRService svc = (CCRService)getService("CCRService");	
	form.setCouponList(svc.getAllActiveCoupon());
	
	return "view";
	
}
public String  viewInactive()
{
	CCRService svc = (CCRService)getService("CCRService");	
	form.setCouponList(svc.getAllInactiveCoupon());
	
	return "viewInactive";
	
}
public boolean isInteger( String input )  
{  
   try  
   {  
      Integer.parseInt( input );  
      return true;  
   }  
   catch( Exception e )  
   {  
      return false;  
   }  
}  
public boolean isDouble( String input )  
{  
   try  
   {  
      Double.parseDouble( input );  
      return true;  
   }  
   catch( Exception e )  
   {  
      return false;  
   }  
}  
public String addCoupon()
{
	CCRService svc = (CCRService)getService("CCRService");
	String add = "add";
	if(CouponErrorChecking(add))
	{
		return "addError";
	}
	String reqval = form.getRequirement_value();
	if(!isInteger(form.getRequirement_value()))
	{
		reqval = reqval.substring(0,reqval.indexOf(" "));
		System.out.println(reqval);
	}
	
	int numUses = Integer.parseInt(form.getNumUses());
	double discountValue = Double.parseDouble(form.getDiscount_value());
	Coupon new_coupn= new Coupon(null,form.getName(),form.getDescription(),form.getStartDate(), form.getEndDate()
			,form.getCoupon_code(),numUses,form.getDiscount_type(),discountValue,true,form.getRequirement_type(), reqval
			,null);
	
	svc.saveCoupon(new_coupn);
	
	return "added";
}
public boolean CouponErrorChecking(String type)
{
	boolean error= false;
	Date date = new Date();
	
			
	if(form.getName().isEmpty())
	{
		addActionError("Name is Empty");
		if(!error)
			error = true;
	}
	else
	{
		if(type.equals("edit")){
			System.out.println("here");
			CCRService svc = (CCRService)getService("CCRService");	
			
			Coupon c =svc.findCouponbyId((Integer)session.get("id"));
			System.out.println(svc.findCouponByName(form.getName()));
			if(!c.getName().toLowerCase().equals(form.getName().toLowerCase()))
			{
			if(svc.findCouponByName(form.getName()).size()>=1 )  
			{
				addActionError("Name already exists");
				if(!error)
					error = true;
			}
			}
		}
		else
		{
			CCRService svc = (CCRService)getService("CCRService");	
			
			
			if(svc.findCouponByName(form.getName()).size()>=1)
			{
				addActionError("Name already exists");
				if(!error)
					error = true;
			}
		}
	}
	if(form.getDescription().isEmpty())
	{
		addActionError("Description is Empty");
		if(!error)
			error = true;
	}
	
	
	if(form.getStartDate()==null)
	{
		addActionError("Start Date");
		if(!error)
			error = true;
	}
/*	else
	{
		if(form.getStartDate().after(form.getEndDate()))
		{
			addActionError("Date is in the past");
			if(!error)
				error = true;
		}
	}*/
	if(form.getEndDate()==null)
	{
		addActionError("End Date is Empty");
		if(!error)
			error = true;
	}
	else
	{
		if(form.getEndDate().before(date))
		{
			addActionError("Date is in the past");
			if(!error)
				error = true;
		}
		if(form.getStartDate().after(form.getEndDate()))
		{
			addActionError("Start Date is After End Date");
			if(!error)
				error = true;
		}
	}
	if(form.getNumUses().isEmpty())
	{
		addActionError("Num Uses is Empty");
		if(!error)
			error = true;
	}
	else
	{
		if(!isInteger(form.getNumUses()))
		{
			addActionError("Num Uses needs to be a valid integer");
			if(!error)
				error = true;
		}
		else if(Integer.parseInt(form.getNumUses())<1)
		{
			addActionError("Num Uses needs to be at least 1");
			if(!error)
				error = true;
		}
	}
	if(form.getCoupon_code().isEmpty())
	{
		addActionError("Coupon Code is Empty");
		if(!error)
			error = true;
	}
	else
	{
		if(type.equals("edit")){
			
			CCRService svc = (CCRService)getService("CCRService");	
			Coupon c =svc.findCouponbyId((Integer)session.get("id"));
			if(!c.getCouponCode().equals(form.getCoupon_code())){
			if(svc.findByCouponCode(form.getCoupon_code()).size()>=1)
			{
				addActionError("Coupon Code exists already");
				if(!error)
					error = true;
			}
			}
		}
		else
		{
			CCRService svc = (CCRService)getService("CCRService");	
			if(svc.findByCouponCode(form.getCoupon_code()).size()>=1)
			{
				addActionError("Coupon Code exists already");
				if(!error)
					error = true;
			}
		}
	}
	if(form.getDiscount_value().isEmpty())
	{
		addActionError("Discount Value is Empty");
		if(!error)
			error = true;
	}
	else
	{
		if(!isDouble(form.getDiscount_value()))	
		{
			addActionError("Discount Value is not a valid Double");
			if(!error)
				error = true;
		}
		else if(!form.getDiscount_type().contains("$"))
		{
			if(Double.parseDouble(form.getDiscount_value())>1)
			{
				addActionError("Discount Percent must be written as a percent less than or equal to 1");
				if(!error)
					error = true;
			}
		}
	}
	
	
	if(form.getRequirement_value().isEmpty())
	{
		addActionError("Requirement is Empty");
		if(!error)
			error = true;
	}
	else
	{
		CCRService svc = (CCRService)getService("CCRService");	
		if(form.getRequirement_type().contains("Spent"))
		{
		
			if(!isInteger(form.getRequirement_value()))
					{
				addActionError("Requirement Value needs to be a numeric Value");
				form.setItems(svc.getAllItems());
				if(!error)
					error = true;
					}
		}
		else
		{
			if(isInteger(form.getRequirement_value()))
			{
		addActionError("Requirement Value needs to be a valid Item");
		form.setItems(svc.getAllItems());
		if(!error)
			error = true;
			}
		}
	}
	
	
	
	
	
	return error;
}

public String prepareEdit()
{
	CCRService svc = (CCRService)getService("CCRService");	
	int id = Integer.valueOf(getParameter("id"));
	
	Coupon c = svc.findCouponbyId(id);
	
	form.setItems(svc.getAllItems());
	form.setName(c.getName());
	form.setDescription(c.getDescription());
	form.setStartDate(c.getStartDate());
	form.setEndDate(c.getEndDate());
	form.setNumUses(c.getNumUsesAllowed().toString());
	form.setCoupon_code(c.getCouponCode());
	form.setDiscount_type(c.getDiscountType());
	form.setDiscount_value(c.getDiscountValue().toString());
	form.setRequirement_type(c.getRequirmentText());
	form.setRequirement_value(c.getRequirmentValue());
	form.setCurrent_coupon(c);
	session.put("id", id);
	
	
	return "editPrep";
}
public String edit()
{
	CCRService svc = (CCRService)getService("CCRService");
	
	int id = (Integer)session.get("id");
	String edit = "edit";
	if(CouponErrorChecking(edit))
	{
		session.put("id",id);
		return "editError";
	}
	
	session.remove("id");
	Coupon c = svc.findCouponbyId(id);
	String reqval = form.getRequirement_value();
	if(!isInteger(form.getRequirement_value()))
	{
		if(reqval.contains(" ")){
		reqval = reqval.substring(0,reqval.indexOf(" "));
		//System.out.println(reqval);
		}
	}
	c.setName(form.getName());
	c.setDescription(form.getDescription());
	c.setStartDate(form.getStartDate());
	c.setEndDate(form.getEndDate());
	c.setNumUsesAllowed(Integer.parseInt(form.getNumUses()));
	c.setDiscountType(form.getDiscount_type());
	c.setDiscountValue(Double.parseDouble(form.getDiscount_value()));
	c.setCouponCode(form.getCoupon_code());
	c.setRequirmentText(form.getRequirement_type());
	c.setRequirmentValue( reqval);
	form.setCurrent_coupon(c);
	svc.saveCoupon(c);
	form.setCouponList(svc.getAllActiveCoupon());
	
	
	return "view";
}

public String delete()
{
	CCRService svc = (CCRService)getService("CCRService");	
	int id = Integer.valueOf(getParameter("id"));
	Coupon c = svc.findCouponbyId(id);
	c.setIsActive(false);
	
	form.setCouponList(svc.getAllActiveCoupon());
	return "view";
}
public String undelete()
{
	CCRService svc = (CCRService)getService("CCRService");	
	int id = Integer.valueOf(getParameter("id"));
	Coupon c = svc.findCouponbyId(id);
	c.setIsActive(true);
	
	form.setCouponList(svc.getAllActiveCoupon());
	return "view";
}


@Override
public Boolean isLoginRequired() {
return false;
}

public Object getModel() {
return form;
}

public CouponForm getForm() {
return form;
}

public void setForm(CouponForm form) {
this.form = form;
}

public void prepare() throws SBRException {

}
}
