package edu.ucr.c3.wms.controller;


import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.domain.LogonRoleLookup;
import edu.ucr.c3.wms.helper.dataholder.LoginManager;

/**
 * Base Action class for the Tutorial package.
 */
public class BaseAction extends ActionSupport implements ServletContextAware, SessionAware, ParameterAware, ServletRequestAware {
	
	public Object getLoggedInUser(short userType) throws SBRException {
		Object user = null;
		UserService svc = (UserService)getService("userService");
		
		if(loginManager != null) {
			System.out.println("In BaseAction");
			if(userType == LogonRoleLookup.USER && loginManager.getLogin() != null){
			//	user = svc.retrieveUserByID((loginManager.getLogin().getId()));
			} else if(userType == LogonRoleLookup.ADMIN && loginManager.getAdmin() != null){
				
			}
		}
		return user;
	}
	
	protected Map<Integer,String> generateYearList() {
		Map<Integer,String> years = new TreeMap<Integer,String>();
		
		for(int x = 2009; x < 2011; x++) {
			years.put(Integer.valueOf(x+1), String.valueOf(x+"-"+(x+1)));
		}
		
		return years;
	}
	
	/**
	 * Returns the name of the session variable that is used to determine
	 * if the user is logged in.
	 * @param mapping
	 * @return String
	 */
	public String getSessionLoginVarable(ActionMapping mapping) {
		String module = mapping.getNamespace();
		if (module.equals("/")) {
			module = "";
		}
		System.out.println(module);
		return module+"/"+SESSION_LOGGED_IN;	
	}
	
	/**
	 * Method used to obtain a reference to a given service name.
	 * @param serviceName
	 * @return Object
	 */
	public Object getService(String serviceName) {
		ApplicationContext springContext = 
			WebApplicationContextUtils.getWebApplicationContext(context);
		return springContext.getBean(serviceName);
	}
	
	/*
	 * Override to allow Action to be used by public
	 */
	public Boolean isLoginRequired() {
		return true;
	}
	
	public String getParameter(String param) {
		String value = null;
		
		try {
			value = parameters.get(param)[0];
		} catch (NullPointerException ex) {}
		
		return value;
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return this.session;
	}
	public void setParameters(Map<String, String[]> parameters) {
		this.parameters = parameters;	
	}
	public void setServletRequest(HttpServletRequest req) {
		this.req = req;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setLoginManager(LoginManager loginMgr) {
		this.loginManager = loginMgr;
	}
	
	//
	


	private LoginManager loginManager;
	protected ServletContext context;
	protected Map<String, Object> session;
	protected HttpServletRequest req;
	protected Map<String, String[]> parameters;
	private Date date;
	private static final String SESSION_LOGGED_IN = BaseAction.class.getName() + "/LOGGED_IN";
	protected static final String INVALID_TOKEN = "invalidToken";
}
