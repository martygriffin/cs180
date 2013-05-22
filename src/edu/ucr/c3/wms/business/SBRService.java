package edu.ucr.c3.wms.business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.ucr.c3.wms.servicelayer.Service;

/**
 * @author matthew
 *
 * Base class for the SR Manager Service Layer
 * all classes in the service layer should extend from this class.
 */
public abstract class SBRService extends Service {

	/**
	 * 
	 */
	public SBRService() {
		super();
	}
	
	
	protected static Log logger = LogFactory.getLog(SBRService.class);
	
}//class FacilityMgmtService
