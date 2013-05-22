package edu.ucr.c3.wms.helper.validators;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hibernate.UserDAO;
import com.opensymphony.xwork2.validator.ValidationException;

import edu.ucr.c3.wms.business.SBRException;

public class LoginValidator extends BaseValidator {
	private ServletContext context;

	public void validate(Object arg0) throws ValidationException {
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, arg0);
		
			
			try {
				UserDAO svc = (UserDAO) getService("UserDAO");
				if (svc.findByUsername((String) value) == null) {
					addFieldError(fieldName, arg0);
				}
			
				}
			
					
				
				
			 catch (Exception e) {
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
