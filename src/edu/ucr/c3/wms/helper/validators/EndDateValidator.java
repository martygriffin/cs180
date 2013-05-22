package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.validator.ValidationException;

public class EndDateValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String name = getFieldName();
		Date endDate = (Date)getFieldValue(name, arg0);
		if(endDate == null){
			return;
		}
		Calendar end = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		

		
		end.setTime(endDate);
		if(end.before(now)) {
			//If end is today, assume manager wants to set end date to today.
			if(end.get(Calendar.DATE) == now.get(Calendar.DATE)) return;
			addFieldError(name, arg0);			
		}
	}

}
