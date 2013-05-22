package edu.ucr.c3.wms.helper.validators;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.validator.ValidationException;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;

public class StudentValidator extends BaseValidator {
	private ServletContext context;

	public void validate(Object arg0) throws ValidationException {
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, arg0);
		
			
			try {
				UserService svc = (UserService) getService("userService");
				if (svc.retrieveStudentBySID((String) value) == null) {
					addFieldError(fieldName, arg0);
				}
			
				}
			
					
				
				
			 catch (SBRException e) {
				e.printStackTrace();
			}
		}

	public Object getService(String serviceName) {
		ApplicationContext springContext = WebApplicationContextUtils
				.getWebApplicationContext(context);
		return springContext.getBean(serviceName);
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}

	

}
