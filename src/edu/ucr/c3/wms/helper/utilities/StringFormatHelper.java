package edu.ucr.c3.wms.helper.utilities;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This utility class will handle all data formating relating to Strings
 * @author rholguin
 *
 */
public class StringFormatHelper {
	
	private static final String[] MONTHS = {"January","February","March","April","May","June","July",
		"August","September","October","November","December"};
	
	/**
	 * This will take a name and convert it to where the first letter is Upper case,
	 * and the rest of Lower case. ie: JAVA == Java
	 * @param name String to be converted to uppercase
	 * @return String
	 */
	public static String convertNameCase(String name) {
		String newName = "";
		
		for(int x = 0; x < name.length(); x++) {
			//if at the first letter, make it upper, else maek it lower
			newName += (x == 0) ? (""+name.charAt(x)).toUpperCase() : (""+name.charAt(x)).toLowerCase();
		}
		
		return newName;
	}
	
	/**
	 * This will take a string of digits and convert it into the standard phone number format
	 * ie: (951) 123-4567
	 * @param phone Phone number to be converted to standard format
	 * @return String
	 */
	public static String formatPhoneNumber(String phone) {
		String number = "";
		String[] temp = new String[3];
		temp[0] = phone.substring(0,3);
		temp[1] = phone.substring(3,6);
		temp[2] = phone.substring(6,10);
		
		number = "("+temp[0]+") "+temp[1]+"-"+temp[2];
		
		return number;
	}
	
	/**
	 * This method will take the String that represents a time value from the form
	 * and return the Hour and Minutes
	 * @param formTime Time String in the following format (XX:YY ZZ) Military Time. ie: 14:25 PM
	 */
	public static short[] formTimeParser(String formTime) {
//		String[] startTimeArray = formTime.split(":");
//		short hour = new Short(startTimeArray[0]).shortValue();
//		short minute = new Short(startTimeArray[1].substring(0,2)).shortValue();
//		boolean am = false;			
//		if ( startTimeArray[1].substring(3,4).equals("A") ) {
//			am = true;
//		}
//		if ( !am && hour < 12 ) {
//			hour += 12;
//		}
//		if(am && hour == 12) {
//			hour = 0;
//		}
		
		String[] startTimeArray = formTime.split(":");
		short hour = new Short(startTimeArray[0]).shortValue();
		short minute = new Short(startTimeArray[1]).shortValue();
		
		return new short[] {hour,minute};
	}
	
	/**
	 * This method will take the String that represents a date value from the form
	 * and return a calendar object representing that date
	 * @param formDate String in the format of (MM/dddd/yyyy)
	 * 
	 */
	public static Calendar formDateParser(String formDate) {
		DateFormat fmt = new SimpleDateFormat("MM/dddd/yyyy");
		fmt.setLenient(false);
		Calendar date = new GregorianCalendar();
		
		try {
			date.setTime(fmt.parse(formDate));
		} catch (ParseException e) {}
		
		return date;
	}
	
	/**
	 * This will take a minte and hour value and create a time String in the form of
	 * HH:MM AM/PM
	 * @param hour Hour of the day
	 * @param minute Minute of the day
	 * @return String
	 */
	public static String createTimeString(int hour, int minute, boolean display) {
		String min = (minute == 0) ? "00" : String.valueOf(minute);
		String zone;
		
		if(!display) {
			return hour+":"+min;
		} else {
			//special case for midnight
			if(hour == 24) {
				return "Midnight";
			}
			
			if(hour >= 12) {
				zone = "PM";
				hour = (hour > 12) ? hour - 12 : hour;
			} else if (hour == -1 || hour == 0) {
				zone = "AM";
				hour = 12;
			} else {
				zone = "AM";
			}
			
			return hour+":"+min+" "+zone;
		}
	}
	
	public static String convertToStandardTime(String militaryTime) {
		SimpleDateFormat sdf_a = new SimpleDateFormat("h:mm a");
		SimpleDateFormat sdf_m = new SimpleDateFormat("HH:mm");
		String m = "";
		try {
			m = sdf_a.format(sdf_m.parse(militaryTime));
		} catch (ParseException e) {}

		if(militaryTime.equals("24:00")) {
			return "Midnight";
		} else {
			return m;
		}
	}
	
	/**
	 * This will take numerical values of the month, day and year and create 
	 * a String in the form of of the date. ie; April 17, 2007
	 * @param day Day 
	 * @param month Numerical value of the month. see {@link java.util.Calendar Calendar}
	 * @param year Year
	 * @return String 
	 */
	public static String createDateString(int day, int month, int year) {
		return MONTHS[month]+" "+day+", "+year;
	}
	
	public static String createDateString(Date date) {
		DateFormat fmt = new SimpleDateFormat("MM/dd/yyyy"); 
		return fmt.format(date);
	}
	
	/**
	 * If windows style path then reverse the slash direction
	 * ie: C:\windows\system32 => C:/windows/system32
	 * @param path Filesystem path
	 * @return String
	 */
	public static String convertUnixStylePath(String path) {
		path = path.replaceAll("\\\\", "/");
		
		//if no trailing slash at the end of path then add it
		if(path.charAt(path.length()-1) != '/') {
			path = path+"/";
		}
		return path;
	}
	
	/**
	 * If windows path the leading drive letter (C:) will be stripped off
	 * ie: C:\windows\system32 => \windows\system32
	 * @param path Filesystem path
	 * @return String
	 */
	public static String parsePath(String path) {
		String[] result = path.split("(.)*:");
		if(result.length > 1) {
			return result[1];
		} else {
			return path;
		}
	}
	
	public static String URLBuilder(Map<String,String> parameterMap) {
		StringBuffer urlVars = new StringBuffer();
		
		char seperator = '?';
        /*
         * iterate over the parameter map. add key=value where value is 
         * url encoded
         */ 
        for(Map.Entry<String,String> paramEntry : parameterMap.entrySet()) {
            urlVars.append(seperator);
            urlVars.append((String)paramEntry.getKey());
            urlVars.append('=');
            String encodedURL = null;
            try {
                encodedURL = 
                	URLEncoder.encode(paramEntry.getValue().toString(), 
                			"UTF-8");
            } catch (UnsupportedEncodingException uce) {
                // this should not happen, UTF-8 is the W3C Recommendation
                String fatalMsg = "UTF-8 Character Encoding not supported";
                throw new RuntimeException(fatalMsg, uce);
            }//catch
            
            urlVars.append(encodedURL);
            seperator = '&'; // next seperator will always be the ampersand
        }//for
        
        return urlVars.toString();
	}
	
	public static boolean isBlankOrNull(String s) {
		if(s == null || s.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
	private static Log logger = LogFactory.getLog(StringFormatHelper.class);
}
