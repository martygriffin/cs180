package com.user;

import java.sql.Timestamp;
import java.util.regex.Matcher;  
import java.util.regex.Pattern; 
import java.util.ArrayList;
import java.util.List;

import com.hibernate.Item;
import com.hibernate.ItemDAO;
import com.hibernate.Log;
import com.hibernate.User;
import com.hibernate.UserDAO;
import com.opensymphony.xwork2.ModelDriven;
import com.user.UserForm;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;

public class UserFunctions extends BaseAction implements ModelDriven {
	private UserForm form = new UserForm();
	private UserDAO userDAO = new UserDAO();
	private User user = new User();

	public String execute() throws SBRException {
		return "success";
	}

	public String viewAdmins() {
		CCRService svc = (CCRService) getService("CCRService");
		form.setAdminlist(svc.getActiveAdmins());
		return "view";
	}

	public String viewInactiveAdmins() {
		CCRService svc = (CCRService) getService("CCRService");
		form.setAdminlist(svc.getInactiveAdmins());
		return "viewinactive";
	}

	public String adminActive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);
		tempuser.setIsActive(true);
		svc.saveUser(tempuser);
		String temp = "Admin " + id + " UnDeleted";
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}

	public String adminInactive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);
		tempuser.setIsActive(false);
		svc.saveUser(tempuser);
		String temp = "Admin " + id + " Deleted";
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}

	public String grantAdmin() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);
		tempuser.setIsAdmn(true);
		svc.saveUser(tempuser);
		String temp = "Admin gratned to userID:" + id;
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}

	public String removeAdmin() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);
		tempuser.setIsAdmn(false);
		svc.saveUser(tempuser);
		String temp = "Admin removed from userID:" + id;
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);
		return "edited";
	}

	public String popUserField() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);

		form.setUsername(tempuser.getUsername());
		form.setPassword(tempuser.getPassword());
		form.setEmail(tempuser.getEmail());
		form.setFirstName(tempuser.getFirstName());
		form.setLastName(tempuser.getLastName());
		form.setAddress(tempuser.getAddress());
		form.setCity(tempuser.getCity());
		form.setState(tempuser.getState());
		form.setPhone(tempuser.getPhone());
		form.setZip(tempuser.getZip());
		session.put("id", id);
		return "load/edit";

	}

	public String edit() {
		int id = (Integer) session.get("id");
		
		if(checkEditFormForErrors())
		{
			session.put("id", id);
			return "erroredit";
		}
		System.out.println(id);
		CCRService svc = (CCRService) getService("CCRService");
		User tempuser = svc.getUserByID(id);
		tempuser.setUsername(form.getUsername());
		tempuser.setPassword(form.getPassword());
		tempuser.setEmail(form.getEmail());
		tempuser.setFirstName(form.getFirstName());
		tempuser.setLastName(form.getLastName());
		tempuser.setAddress(form.getAddress());
		tempuser.setCity(form.getCity());
		tempuser.setState(form.getState());
		tempuser.setPhone(form.getPhone());
		tempuser.setZip(form.getZip());
		svc.saveUser(tempuser);
		String temp = "User " + id + " Edited";
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);
		session.remove("id");
		return "edited";

	}

	public String addAdmin() throws SBRException {
		if(checkFormForErrors())
		{
			return "erroradd";
		}
		String username = form.getUsername();
		String password = form.getPassword();
		String email = form.getEmail();
		String firstName = form.getFirstName();
		String lastName = form.getLastName();
		String address = form.getAddress();
		String city = form.getCity();
		String state = form.getState();
		String phone = form.getPhone();
		String zip = form.getZip();

		
		CCRService svc = (CCRService) getService("CCRService");
		com.hibernate.User to_insert = new com.hibernate.User(username,
				password, email, firstName, lastName, address, city, state,
				phone, zip, true, true,null,null,null);

		svc.saveUser(to_insert);
		String temp = "User " + form.getUsername() + " Added";
		java.util.Date date = new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log(temp, t);
		svc.saveLogEntry(l);

		return "edited";
	}
	public boolean checkFormForErrors()
	{
		boolean error = false;
		String username = form.getUsername();
		String password = form.getPassword();
		String email = form.getEmail();
		String firstName = form.getFirstName();
		String lastName = form.getLastName();
		String phone = form.getPhone();
		String zip = form.getZip();
		CCRService svc = (CCRService) getService("CCRService");
		
		if(!svc.findByUsername(username).isEmpty())
		{
			addActionError("User with same Username already exisits");
			if(!error)
				error = true;
		}
		if(username.isEmpty())
		{
			addActionError("Username cannot be Empty");
			if(!error)
				error = true;
		}
		if(password.isEmpty())
		{
			addActionError("Password cannot be Empty");
			if(!error)
				error = true;
		}
		if(!emailChecker(email))
		{
			addActionError("Email is not in valid format");
			if(!error)
				error = true;
		}
		if(email.isEmpty())
		{
			addActionError("Email cannot be Empty");
			if(!error)
				error = true;
		}
		if(firstName.isEmpty())
		{
			addActionError("First Name cannot be Empty");
			if(!error)
				error = true;
		}
		if(lastName.isEmpty())
		{
			addActionError("Last Name cannot be Empty");
			if(!error)
				error = true;
		}
		if(!isPhoneNumberValid(phone))
		{
			addActionError("Phone Number not Valid, expected format (nnn)nnn-nnnn or nnnnnnnnnn or nnn-nnn-nnnn  ");
			if(!error)
				error = true;
		}
		if(!isNumeric(zip))
		{
			addActionError("Zip code invalid");
			if(!error)
				error = true;
		}
		
	
		return error;
	}
	public boolean checkEditFormForErrors()
	{
		boolean error = false;
		String username = form.getUsername();
		String password = form.getPassword();
		String email = form.getEmail();
		String firstName = form.getFirstName();
		String lastName = form.getLastName();
		String phone = form.getPhone();
		String zip = form.getZip();
		
		CCRService svc = (CCRService) getService("CCRService");
		int id = (Integer)session.get("id");
		User test  = svc.getUserByID(id);
		if(!test.getUsername().toLowerCase().equals(username.toLowerCase()))
		{
			
			if(!svc.findByUsername(username).isEmpty())
			{
				addActionError("User with same Username already exisits");
				if(!error)
				error = true;
			}
			
		}
		if(username.isEmpty())
		{
			addActionError("Username cannot be Empty");
			if(!error)
				error = true;
		}
		

		if(password.isEmpty())
		{
			addActionError("Password cannot be Empty");
			if(!error)
				error = true;
		}
		if(!emailChecker(email))
		{
			addActionError("Email is not in valid format");
			if(!error)
				error = true;
		}
		if(email.isEmpty())
		{
			addActionError("Email cannot be Empty");
			if(!error)
				error = true;
		}
		if(firstName.isEmpty())
		{
			addActionError("First Name cannot be Empty");
			if(!error)
				error = true;
		}
		if(lastName.isEmpty())
		{
			addActionError("Last Name cannot be Empty");
			if(!error)
				error = true;
		}
		if(!isPhoneNumberValid(phone))
		{
			addActionError("Phone Number not Valid, expected format (nnn)nnn-nnnn or nnnnnnnnnn or nnn-nnn-nnnn  ");
			if(!error)
				error = true;
		}
		if(!isNumeric(zip))
		{
			addActionError("Zip code invalid");
			if(!error)
				error = true;
		}
		
	
		return error;
	}
	public boolean emailChecker(String email)
	{
		
		String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
		   CharSequence inputStr = email;  
		   Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
		   Matcher matcher = pattern.matcher(inputStr);  
		   return matcher.matches(); 
	}
	public static boolean isPhoneNumberValid(String phoneNumber){  
		boolean isValid = false;  
		/* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn 
		    ^\\(? : May start with an option "(" . 
		    (\\d{3}): Followed by 3 digits. 
		    \\)? : May have an optional ")" 
		    [- ]? : May have an optional "-" after the first 3 digits or after optional ) character. 
		    (\\d{3}) : Followed by 3 digits. 
		     [- ]? : May have another optional "-" after numeric digits. 
		     (\\d{4})$ : ends with four digits. 
		 
		         Examples: Matches following phone numbers: 
		         (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890 
		 
		*/  
		//Initialize reg ex for phone number.   
		String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
		CharSequence inputStr = phoneNumber;  
		Pattern pattern = Pattern.compile(expression);  
		Matcher matcher = pattern.matcher(inputStr);  
		if(matcher.matches()){  
		isValid = true;  
		}  
		return isValid;  
		}  
	public static boolean isNumeric(String number){  
		boolean isValid = false;  
		  
		/*Number: A numeric value will have following format: 
		         ^[-+]?: Starts with an optional "+" or "-" sign. 
		     [0-9]*: May have one or more digits. 
		    \\.? : May contain an optional "." (decimal point) character. 
		    [0-9]+$ : ends with numeric digit. 
		*/  
		  
		//Initialize reg ex for numeric data.  
		String expression = "^[-+]?[0-9]*\\.?[0-9]+$";  
		CharSequence inputStr = number;  
		Pattern pattern = Pattern.compile(expression);  
		Matcher matcher = pattern.matcher(inputStr);  
		if(matcher.matches()){  
		isValid = true;  
		}  
		return isValid;  
		}  
	public String viewLog() {
		CCRService svc = (CCRService) getService("CCRService");
		List<Log> templog = svc.getLog();
		List<Log> log = new ArrayList();

		if (templog.size() > 300) {
			for (int i = templog.size() - 1; i >= templog.size()-300; --i) {
				log.add(templog.get(i));
			}
		} 
		else {
			for (int i = templog.size() - 1; i >=0; --i) {
				log.add(templog.get(i));
			}
		}
		
		form.setSite_log(log);
		return "log";

	}

	@Override
	public Boolean isLoginRequired() {
		return false;
	}

	public Object getModel() {
		return form;
	}

	public void setForm(UserForm form) {
		this.form = form;
	}

	public UserForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {

	}

}
