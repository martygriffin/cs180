package edu.ucr.c3.wms.helper.validators;

import com.opensymphony.xwork2.validator.ValidationException;

public class SelectValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		int value = (Integer)getFieldValue(name, arg0);
		
		if(value == -1) {
			addFieldError(name, arg0);
			
		}
	}

}
