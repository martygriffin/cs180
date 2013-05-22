package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.List;

import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.domain.Admin;
import edu.ucr.c3.wms.domain.Student;

import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.validator.ValidationException;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;

public class StudentValidator2 extends BaseValidator {
	private ServletContext context;

	public void validate(Object arg0) throws ValidationException {
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, arg0);
		{
			boolean found = false;
			try {
				UserService svc = (UserService) getService("userService");
				List<Student> all_student = svc.retrieveAllStudents();
				for (Student e : all_student) {
					if (e.getNetid().equals(((String) value))) {
						found = true;
					}
				}
				if (!found) {
					addFieldError(fieldName, arg0);
				}
			} catch (SBRException e) {
				e.printStackTrace();
			}
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
