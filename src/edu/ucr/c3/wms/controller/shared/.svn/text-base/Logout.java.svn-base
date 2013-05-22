package edu.ucr.c3.wms.controller.shared;

import java.sql.Timestamp;

import org.apache.struts2.dispatcher.SessionMap;

import com.hibernate.Log;
import com.hibernate.User;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.LogonRoleLookup;

/**
 * Logout class to end a user's web session.
 * 
 * @author matthew
 */
public class Logout extends BaseAction {


	/* (non-Javadoc)
	 * @see edu.ucr.c3.Sap4App.controller.SelfServiceMgmtAction#executeSRSApp(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	String footer;
	String auth_key;
	String dept_name;
	String service;
	public String getFooter() {
		return footer;
	}

	public String execute() throws SBRException {
		/*
		Boolean studentFlag = false;
		if(getLoggedInUser(LogonRoleLookup.STUDENT) != null) 
			{
				studentFlag = true;
				auth_key = (String) session.get("authKey");
				footer = (String) session.get("footer");
				dept_name = (String) session.get("leftHeader");
				service = (String) session.get("rightHeader");
				
			}
		footer = (String)session.get("footer");
		if (session != null && session instanceof SessionMap) {
		    try {
		        ((SessionMap)session).invalidate();
		    } catch (IllegalStateException e) {}
		}//if
		if(studentFlag)
			{
			session.put("leftHeader",dept_name);
			session.put("footer",footer);
			session.put("rightHeader",service);
			session.put("authkey",getParameter("authkey"));
			return "student";
			}
			*/
		if (session != null && session instanceof SessionMap) {
		    try {
		    	String temp = ((User)session.get("loggedInUser")).getUsername()+ " Logged out";
		    	CCRService dao=(CCRService)getService("CCRService");		
		    	((SessionMap)session).invalidate();
		       // String temp = userLogin.getUsername()+ " Logged in";
				 java.util.Date date= new java.util.Date();
				Timestamp t = new Timestamp(date.getTime());
				Log l = new Log (temp, t);
				dao.saveLogEntry(l);
		    } catch (IllegalStateException e) {}
		}
		addActionMessage("You have been logged out.");
		
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see edu.ucr.c3.Sap4App.controller.SelfServiceMgmtAction#isLoginRequired()
	 */
	public Boolean isLoginRequired() {
		return false;
	}

	public String getAuth_key() {
		return auth_key;
	}

	public void setAuth_key(String authKey) {
		auth_key = authKey;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String deptName) {
		dept_name = deptName;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}
}
