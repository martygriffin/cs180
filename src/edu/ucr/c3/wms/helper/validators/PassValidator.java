package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.validator.ValidationException;

public class PassValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		String pass = (String)getFieldValue(name, arg0);
		if(pass.equals("Enter new password.")) {
			addFieldError(name, arg0);			
		}
	}

}
