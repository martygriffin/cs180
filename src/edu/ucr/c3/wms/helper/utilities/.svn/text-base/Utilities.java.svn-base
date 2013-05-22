package edu.ucr.c3.wms.helper.utilities;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.twmacinta.util.MD5;

public class Utilities {
	
	/**
	 * For whatever reason the built in fucntion in the Calendar objects to check date equality
	 * is not reliable, so this will check if 2 dates are equal
	 * @param date1 Date to compare
	 * @param date2 Date to compare
	 * @return boolean
	 */
	public static boolean isDateEqual (Date date1, Date date2) {
		boolean isEqual = false;
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(date1);
		GregorianCalendar cal2 = new GregorianCalendar();
		cal2.setTime(date2);
		
		//check is year,month,and date are the same for each date
		if(cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && 
				cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
				cal1.get(Calendar.DATE) == cal2.get(Calendar.DATE)) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	public static short retrieveFiscalYear(Date date) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		
		if(cal.get(Calendar.MONTH) <= Calendar.JUNE) {
			return (short)(year);
		} else {
			return (short)(year + 1);
		}
	}
	
	/**
	 * Converts value to MD5
	 * @param string String to be converted
	 * @return MD5 string
	 */
	public static String getMD5Value(String string) {
		MD5 md5 = new MD5();
		
		md5.Update(string);
		return md5.asHex();
	}
}
