package edu.ucr.c3.wms.helper.validators;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.validator.ValidationException;

public class SectionValidator extends BaseValidator {

	public void validate(Object arg0) throws ValidationException {
		String timeOrDay = getFieldName();
		String timeOrDayValue = (String)getFieldValue(timeOrDay, arg0);
		
		if(timeOrDay.startsWith("w")){
			String time = "time";
			time += timeOrDay.substring(timeOrDay.length() - 1);
			String timeValue = (String)getFieldValue(time, arg0);
			if(timeValue.equals("") && !timeOrDayValue.equals(""))
				addFieldError(timeOrDay, arg0);
		}
		else{
			String day = "weeklyDay";
			day += timeOrDay.substring(timeOrDay.length() - 1);
			String dayValue = (String)getFieldValue(day, arg0);
			if(dayValue.equals("") && !timeOrDayValue.equals(""))
				addFieldError(timeOrDay, arg0);		
				
		}
		
		

	}

}
