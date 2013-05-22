package com.social;

import java.sql.Timestamp;
import java.util.List;

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

public class SocialFunctions extends BaseAction  implements ModelDriven, Preparable {
	private SocialForm form = new SocialForm();
	
	public String execute() throws SBRException {
		return "success";
	}
	
	public String view() throws SBRException {
		CCRService svc = (CCRService)getService("CCRService");
		form.setSocial_list(svc.getAllSocial());
		return "view";
	}
	public String add() throws SBRException
	{
		
		CCRService svc = (CCRService)getService("CCRService");
		if(checkFormForError())
		{
			return "error";
		}

		Social  new_social= new Social(form.getName(),form.getCode(),true);
		svc.saveSocial(new_social);
		String temp = "social " + form.getName() +" added";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "add";
	}
	public boolean checkFormForError()
	{   
		boolean error = false;
		String name = form.getName();
		String description = form.getCode();
		if(name.isEmpty())
		{
			addActionError("Social Button Name is Emtpy");
			if(!error)
				error=true;
		}
		if(description .isEmpty())
		{
			addActionError("Social Code is Emtpy");
			if(!error)
				error=true;
		}
		
		
		
		
		return error;
		
	}
	public String popEditFields()
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Social current = svc.getSocialById(id);
		form.setName(current.getTitle());
		form.setCode(current.getLink());
		session.put("id", id);
		return "edit";
	}
	public String edit()
	{
		int id = (Integer) session.get("id");
		session.remove("id");
		if(checkFormForError())
		{
			session.put("id", id);
			return "error2";
		}

		CCRService svc = (CCRService)getService("CCRService");
		Social current = svc.getSocialById(id);
		current.setLink(form.getCode());
		current.setTitle(form.getName());
		String temp = "social " + id +" edited";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "add";
	}
	public String setInactive()
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Social current = svc.getSocialById(id);
		current.setIsActive(false);
		String temp = "social " + id +" inactive";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "add";
	}
	public String setActive()
	{
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Social current = svc.getSocialById(id);
		current.setIsActive(true);
		String temp = "social " + id +" active";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		
		return "add";
	}
	public String inactive()
	{
		
		CCRService svc = (CCRService)getService("CCRService");
		form.setSocial_list(svc.getAllInactiveSocial());
		return "inactive";
	}
	
	@Override
	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(SocialForm form) {
		this.form = form;
	}
	public SocialForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
