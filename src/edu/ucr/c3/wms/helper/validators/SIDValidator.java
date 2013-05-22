//package edu.ucr.c3.wms.helper.validators;
//
//import java.util.Calendar;
//import edu.ucr.c3.wms.controller.BaseAction;
//import edu.ucr.c3.wms.domain.Admin;
//import edu.ucr.c3.wms.domain.Session;
//
//import java.util.Date;
//
//import javax.servlet.ServletContext;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import com.opensymphony.xwork2.validator.ValidationException;
//
//import edu.ucr.c3.wms.business.SBRException;
//import edu.ucr.c3.wms.business.admin.UserService;
//
//public class SIDValidator extends BaseValidator {
//	private ServletContext context;
//	private String manName;
//
//	public void validate(Object arg0) throws ValidationException {
//		String fieldName = getFieldName();
//		Object value = this.getFieldValue(fieldName, arg0);
//			
//			try {
//				UserService svc = (UserService) getService("userService");
//				
//				}
//				
//				
//			 catch (SBRException e) {
//				e.printStackTrace();
//			}
//		}
//	
//	boolean check_sid(String sid_rule, String student_sid) {
//		System.out.print(sid_rule +"  "+student_sid);
//			if(sid_rule.length() !=student_sid.length())
//				return false;
//		for (int i = 0; i < sid_rule.length(); i++){
//		    char c = sid_rule.charAt(i);
//		    char a = student_sid.charAt(i);
//		    if(c=='x')
//		    {
//		     
//		     if(a>48 || a<58)
//		    	 return false;
//		    }
//		    else
//		    {
//		    	if(a!=c)
//		    		return false;
//		    }
//		    //Process char
//		}
//		
//		return true;
//	}
//
//	public Object getService(String serviceName) {
//		ApplicationContext springContext = WebApplicationContextUtils
//				.getWebApplicationContext(context);
//		return springContext.getBean(serviceName);
//	}
//
//	public void setServletContext(ServletContext context) {
//		this.context = context;
//	}
//
//	
//
//}
