package edu.ucr.c3.wms.helper.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.helper.dataholder.LoginManager;


public class LoginInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		final ActionContext context = invocation.getInvocationContext(); 
		ActionMapping mapping = (ActionMapping)context.get(ServletActionContext.ACTION_MAPPING);
		
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST);
		HttpSession session =  request.getSession();
		
		BaseAction action = (BaseAction)invocation.getAction();
		LoginManager login = (session.getAttribute("loginManager") != null) ? (LoginManager)session.getAttribute("loginManager") : null;
		
		/*
		 * for debugging, allow instant login, comment out for production
		 */
//		//UserMgmtService userSvc = (UserMgmtService)action.getService("userMgmtService");
//		login = new LoginManager();
//		Requestor user;
//		user = new Requestor();
//		login.setRequestor(user);
//		login.getLoginPaths().put("/"+BaseAction.class.getName()+"/LOGGED_IN", Boolean.TRUE);
//		action.getSession().put("loginManager", login);
//		return invocation.invoke();
//		//end debug
		
		if(login == null && action.isLoginRequired()) {
			//user is not logged in and login required, redirect them to login module
			//System.out.println("User is not logged in, login is required.");
			action.addActionMessage("Log-in is required for this page. Please log-in.");
			return BaseAction.LOGIN;
		} else if(login != null && action.isLoginRequired()) {
			//logged in, make sure they are accessing a valid resource
			String loginKey = action.getSessionLoginVarable(mapping);
			System.out.println("Login Path: " + login.getLoginPaths());
			System.out.println("Login Key: " + loginKey);
			if(login.getLoginPaths().containsKey(loginKey)) {
				return invocation.invoke();
			} else {
				//return to login which will redirect them to appropriate path
				System.out.println("User is logged in, but rejected!!.");
				action.addActionMessage("You do not have access to this page. Please log-in.");
				return "logout";
			}
		} else {
			//public access to continue with action
			String loginKey = action.getSessionLoginVarable(mapping);
			String path = ( login == null ) ? "" :  login.getLoginPaths().toString();
			//System.out.println("Login Path: " + path);
			//System.out.println("Login Key: " + loginKey);
			return invocation.invoke();
		}
	}
}
