package com.reservation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.hibernate.Item;
import com.hibernate.ItemsOrdered;
import com.hibernate.Log;
import com.hibernate.Order;
import com.hibernate.Reservation;
import com.hibernate.User;
import com.menu.MenuForm;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;


public class ReservationFunctions extends BaseAction  implements ModelDriven, Preparable {
	private ReservationForm form = new ReservationForm();
	
	public String execute() throws SBRException {
		return "success";
	}
	
	public String makeReservation() {
		return "reservation";
	}
	
	public String currentReservations()
	{
		
		CCRService svc = (CCRService)getService("CCRService");	
		form.setResvervation_list(svc.getCurrentReservations());
		//System.out.println("reservations " +svc.getCurrentReservations());
	
		//form.setReservation(svc.getCurrentReservations().get(0));
		form.setR_list(svc.getCurrentReservations());
		
		return "current";
	}
	
	public String pastReservations() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setResvervation_list(svc.getAllDeletedReservations());
		//System.out.println("reservations " +svc.getAllDeletedReservations());
	
		//form.setReservation(svc.getAllDeletedReservations().get(0));
		form.setR_list(svc.getAllDeletedReservations());
		
		return "deleted";
		
	}
	
	
	public String reservationActive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Reservation tempres = svc.getReservationByID(id);
		tempres.setIsActive(true);
		svc.saveReservation(tempres);
		
		String temp = "Reservation " + id +" Undeleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "edited";
	}
	
	public String reservationInactive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Reservation tempres = svc.getReservationByID(id);
		tempres.setIsActive(false);
		svc.saveReservation(tempres);
		
		String temp = "Reservation " + id +"Deleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "edited";
	}
	

	public String addReservation()throws SBRException
	{
		if(checkFormForErrors())
		{
			return "erroradd";
		}
		
	
		Timestamp tempdate = null;
		Timestamp dateTime = tempdate.valueOf(form.getDate().substring(0,10) + " " + form.getTime().substring(11,19).replaceAll("-", ":") );
		
		String tableNumber = form.getTableNumber();
		String duration = form.getDuration();
		Integer tempint = null;
		Integer groupSize = tempint.valueOf(form.getGroupSize());
		String specialRequests = form.getSpecialRequests();
		String name = form.getName();
		

		CCRService svc = (CCRService)getService("CCRService");	
		com.hibernate.Reservation to_insert = new com.hibernate.Reservation(name, dateTime, tableNumber, 
																			duration, groupSize, specialRequests, true);


		svc.saveReservation(to_insert);
		String temp = "Reservation for "+ form.getName() +" Add";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
			
		return "edited";
	}
	
	public String popReservationField() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Reservation tempres = svc.getReservationByID(id);
		//form.setUser(tempres.getUser() );
		form.setName(tempres.getName());
		form.setDateTime(tempres.getDateTime() );
		//THIS FLOORS TO THE NEXT LOWEST 5 MINUTE INTERVAL
		form.setDate(tempres.getDateTime().toString().substring(0,10));
		form.setTime(tempres.getDateTime().toString().substring(11,19));
		form.setTableNumber(tempres.getTableNumber());
		String tempster = tempres.getGroupSize().toString();
		form.setGroupSize(tempster);
		form.setDuration(tempres.getDuration());
		form.setSpecialRequests(tempres.getSpecialRequests());
		session.put("id", id);
		return "load/edit";
	}
	
	public String edit()
	{
		int id = (Integer)session.get("id");
		
		if(checkFormForErrors())
		{
			return "erroredit";
		}
		
		CCRService svc = (CCRService)getService("CCRService");
		Reservation tempres = svc.getReservationByID(id);

		Timestamp tempdate = null;
		Timestamp dateTime = tempdate.valueOf(form.getDate().substring(0,10) + " " + form.getTime().substring(11,19).replaceAll("-", ":") );
		tempres.setDateTime(dateTime );
		tempres.setTableNumber(form.getTableNumber());
		Integer tempint = null;
		Integer groupSize = tempint.valueOf(form.getGroupSize());
		tempres.setGroupSize(groupSize);
		tempres.setSpecialRequests(form.getSpecialRequests());
		tempres.setName(form.getName());

		svc.saveReservation(tempres);
		String temp = "Reservation " + id +" Edit";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		

		session.remove("id");
		return "edited";

	}
	
	public boolean checkFormForErrors()
	{
		boolean error = false;
		Date date = new Date();
		Timestamp tempdate = null;
		Timestamp dateTime = null;
		if ( form.getDate().isEmpty() ) {	
			 addActionError("A date must be selected");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		if ( form.getTime().isEmpty() ) {	
			 addActionError("A time must be selected");
			 if(!error)
			 {
				 error=true;
			 }
		}
		

		
		String name = form.getName();
		String duration = form.getDuration();
		String groupSize = form.getGroupSize();
		String tableNumber = form.getTableNumber();
		
		if(name.isEmpty())
		{
			 addActionError("Reservation must have a Customer Name");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		if(groupSize.isEmpty())
		{
			 addActionError("Reservation must have a group size");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		else if ( !Pattern.matches("[1-9]*", groupSize) ) {
			
			 addActionError("Group size must be a number greater than 0");
			 if(!error)
			 {
				 error=true;
			 }
			
		}

		
		if( !Pattern.matches("\\d*[.]?\\d*", duration) )
		{
			 addActionError("Duration must be a number in the format Hours.Minutes");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		if ( !tableNumber.isEmpty() && !Pattern.matches("[1-9]*", tableNumber) ) {
			
			 addActionError("Table Number must be a Number");
			 if(!error)
			 {
				 error=true;
			 }
			
		}
		
		if ( !form.getDate().isEmpty() && !form.getTime().isEmpty() ) {	
			dateTime = tempdate.valueOf(form.getDate().substring(0,10) + " " + form.getTime().substring(11,19).replaceAll("-", ":") );
		
			if ( !dateTime.after(date) ) {
				
				addActionError("Date and time of reservation must not be in the past");
				if(	!error)
				{	
				 error=true;
			 	}
			 
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
	public void setForm(ReservationForm form) {
		this.form = form;
	}
	public ReservationForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
