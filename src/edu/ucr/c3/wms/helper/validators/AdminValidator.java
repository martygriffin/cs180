package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.Admin;
import edu.ucr.c3.wms.domain.Manager;

import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.validator.ValidationException;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;

public class AdminValidator extends BaseValidator {
	private ServletContext context;
	private String manName;
	private String manId;

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		this.manName = (String)getFieldValue(name, arg0);
		int manId = (Integer)getFieldValue("manId", arg0);
	
		try{
			//if admin or manager exists already, deny
			if(getAdmin() || getManager(manId)) {
				addFieldError(name, arg0);			
			}
		}
		catch(SBRException e){
			e.printStackTrace();
		}

	}
	
	private boolean getAdmin() throws SBRException{
		UserService userSvc = (UserService)getService("userService");
		Admin admin = userSvc.retrieveAdminByUsername(this.manName);
		return (admin != null) ? true : false;
	}
	
	private boolean getManager(int manId) throws SBRException{
		UserService userSvc = (UserService)getService("userService");
		Manager man = userSvc.retrieveManagerByUsernameRaw(this.manName);
		
		//if manager name does not exist, no flag		
		if(man == null) return false;
		
		//if manager name does exist, but is the current manager, no flag
		else if(man.getId() == manId) return false;
		
		//otherwise, flag
		return true;
	}

	
	public Object getService(String serviceName) {
		ApplicationContext springContext = 
			WebApplicationContextUtils.getWebApplicationContext(context);
		return springContext.getBean(serviceName);
	}
	
	public void setServletContext(ServletContext context) {
		this.context = context;
	}	
	

}
