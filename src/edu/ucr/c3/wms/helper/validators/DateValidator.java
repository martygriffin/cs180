package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.validator.ValidationException;

public class DateValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		Date endDate = (Date)getFieldValue("endDate", arg0);
		Date startDate = (Date)getFieldValue(name, arg0);
		if(endDate == null || startDate == null){
			return;
		}
		Calendar end = Calendar.getInstance();
		Calendar start = Calendar.getInstance();
		end.setTime(endDate);
		start.setTime(startDate);
		if(start.after(end)) {
			addFieldError(name, arg0);			
		}
	}

}
