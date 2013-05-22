package edu.ucr.c3.wms.business.utils;

/**
 * Utilitly Class used for validating the existance of template files.
 * @author ryanrich
 *
 */
public class SBRUtils {

	/*
	 * Private contstructor, since this is a utility class.  All methods
	 * should be static.
	 */
	private SBRUtils() {}

	/**
	 * Fetch the path to the appropriate template file. 
	 * The provided template file name is assumed to be in the class path
	 * @param templateFileName Name of mail template file
	 * @return path to appropriate template file in the classpath
	 */
	public static String getMailTemplatePath(String templateFileName) {
		String path = TEMPLATE_PATH + templateFileName;
		if (!existsInClassPath(path)) {
			//this would not be found now only if the file specified
			//was invalid
			throw new IllegalArgumentException("Error, no such template " +
					"exists.");
		}		
		return path;
	}
	
	private static boolean existsInClassPath(String resource) {
		return (SBRUtils.class.getResource("/"+resource) != null) ? true : 
			false;		
	}
	
	private static final String TEMPLATE_PATH = "mailTemplates/";	

}
