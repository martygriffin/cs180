package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.validator.ValidationException;

public class YearValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		Short yearValue = (Short)getFieldValue(name, arg0);
		Date startDate = (Date)getFieldValue("startDate", arg0);
		if(startDate == null || yearValue == null){
			return;
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		if(cal.get(Calendar.YEAR) != yearValue ) {
			addFieldError(name, arg0);			
		}
	}

}
