package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Medication;

/**
 * A data access object (DAO) providing persistence and search support for
 * Medication entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Medication
 * @author MyEclipse Persistence Tools
 */

public class MedicationDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(MedicationDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String NAME = "name";
	public static final String NAME_TYPE = "nameType";
	public static final String NAME_VALUE = "nameValue";
	public static final String NAME_ABBREV = "nameAbbrev";
	public static final String BRAND_NAME = "brandName";
	public static final String BRAND_NAME_TYPE = "brandNameType";
	public static final String BRAND_NAME_VALUE = "brandNameValue";
	public static final String BRAND_NAME_ABBREV = "brandNameAbbrev";
	public static final String DOSE_TEXTVALUE = "doseTextvalue";
	public static final String DOSE_VALUE = "doseValue";
	public static final String DOSE_UNIT = "doseUnit";
	public static final String DOSE_UNIT_TYPE = "doseUnitType";
	public static final String DOSE_UNIT_VALUE = "doseUnitValue";
	public static final String DOSE_UNIT_TYPE_ABBREV = "doseUnitTypeAbbrev";
	public static final String ROUTE = "route";
	public static final String ROUTE_TYPE = "routeType";
	public static final String ROUTE_VALUE = "routeValue";
	public static final String ROUTE_ABBREV = "routeAbbrev";
	public static final String STRENGTH_TEXTVALUE = "strengthTextvalue";
	public static final String STRENGTH_VALUE = "strengthValue";
	public static final String STRENGTH_UNIT = "strengthUnit";
	public static final String STRENGTH_UNIT_TYPE = "strengthUnitType";
	public static final String STRENGTH_UNIT_VALUE = "strengthUnitValue";
	public static final String STRENGTH_UNIT_ABBREV = "strengthUnitAbbrev";
	public static final String FREQUENCY = "frequency";
	public static final String FREQUENCY_TYPE = "frequencyType";
	public static final String FREQUENCY_VALUE = "frequencyValue";
	public static final String FREQUENCY_ABBREV = "frequencyAbbrev";
	public static final String PRESCRIBED_BY_NAME = "prescribedByName";
	public static final String PRESCRIBED_BY_INSTITUTION = "prescribedByInstitution";
	public static final String DISPENSE_AS_WRITTEN = "dispenseAsWritten";
	public static final String PRESCRIPTION_DURATION = "prescriptionDuration";
	public static final String PRESCRIPTION_REFILL_INFO = "prescriptionRefillInfo";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Medication transientInstance) {
		log.debug("saving Medication instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Medication persistentInstance) {
		log.debug("deleting Medication instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Medication findById(java.lang.Integer id) {
		log.debug("getting Medication instance with id: " + id);
		try {
			Medication instance = (Medication) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Medication", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Medication instance) {
		log.debug("finding Medication instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Medication instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Medication as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByNameType(Object nameType) {
		return findByProperty(NAME_TYPE, nameType);
	}

	public List findByNameValue(Object nameValue) {
		return findByProperty(NAME_VALUE, nameValue);
	}

	public List findByNameAbbrev(Object nameAbbrev) {
		return findByProperty(NAME_ABBREV, nameAbbrev);
	}

	public List findByBrandName(Object brandName) {
		return findByProperty(BRAND_NAME, brandName);
	}

	public List findByBrandNameType(Object brandNameType) {
		return findByProperty(BRAND_NAME_TYPE, brandNameType);
	}

	public List findByBrandNameValue(Object brandNameValue) {
		return findByProperty(BRAND_NAME_VALUE, brandNameValue);
	}

	public List findByBrandNameAbbrev(Object brandNameAbbrev) {
		return findByProperty(BRAND_NAME_ABBREV, brandNameAbbrev);
	}

	public List findByDoseTextvalue(Object doseTextvalue) {
		return findByProperty(DOSE_TEXTVALUE, doseTextvalue);
	}

	public List findByDoseValue(Object doseValue) {
		return findByProperty(DOSE_VALUE, doseValue);
	}

	public List findByDoseUnit(Object doseUnit) {
		return findByProperty(DOSE_UNIT, doseUnit);
	}

	public List findByDoseUnitType(Object doseUnitType) {
		return findByProperty(DOSE_UNIT_TYPE, doseUnitType);
	}

	public List findByDoseUnitValue(Object doseUnitValue) {
		return findByProperty(DOSE_UNIT_VALUE, doseUnitValue);
	}

	public List findByDoseUnitTypeAbbrev(Object doseUnitTypeAbbrev) {
		return findByProperty(DOSE_UNIT_TYPE_ABBREV, doseUnitTypeAbbrev);
	}

	public List findByRoute(Object route) {
		return findByProperty(ROUTE, route);
	}

	public List findByRouteType(Object routeType) {
		return findByProperty(ROUTE_TYPE, routeType);
	}

	public List findByRouteValue(Object routeValue) {
		return findByProperty(ROUTE_VALUE, routeValue);
	}

	public List findByRouteAbbrev(Object routeAbbrev) {
		return findByProperty(ROUTE_ABBREV, routeAbbrev);
	}

	public List findByStrengthTextvalue(Object strengthTextvalue) {
		return findByProperty(STRENGTH_TEXTVALUE, strengthTextvalue);
	}

	public List findByStrengthValue(Object strengthValue) {
		return findByProperty(STRENGTH_VALUE, strengthValue);
	}

	public List findByStrengthUnit(Object strengthUnit) {
		return findByProperty(STRENGTH_UNIT, strengthUnit);
	}

	public List findByStrengthUnitType(Object strengthUnitType) {
		return findByProperty(STRENGTH_UNIT_TYPE, strengthUnitType);
	}

	public List findByStrengthUnitValue(Object strengthUnitValue) {
		return findByProperty(STRENGTH_UNIT_VALUE, strengthUnitValue);
	}

	public List findByStrengthUnitAbbrev(Object strengthUnitAbbrev) {
		return findByProperty(STRENGTH_UNIT_ABBREV, strengthUnitAbbrev);
	}

	public List findByFrequency(Object frequency) {
		return findByProperty(FREQUENCY, frequency);
	}

	public List findByFrequencyType(Object frequencyType) {
		return findByProperty(FREQUENCY_TYPE, frequencyType);
	}

	public List findByFrequencyValue(Object frequencyValue) {
		return findByProperty(FREQUENCY_VALUE, frequencyValue);
	}

	public List findByFrequencyAbbrev(Object frequencyAbbrev) {
		return findByProperty(FREQUENCY_ABBREV, frequencyAbbrev);
	}

	public List findByPrescribedByName(Object prescribedByName) {
		return findByProperty(PRESCRIBED_BY_NAME, prescribedByName);
	}

	public List findByPrescribedByInstitution(Object prescribedByInstitution) {
		return findByProperty(PRESCRIBED_BY_INSTITUTION,
				prescribedByInstitution);
	}

	public List findByDispenseAsWritten(Object dispenseAsWritten) {
		return findByProperty(DISPENSE_AS_WRITTEN, dispenseAsWritten);
	}

	public List findByPrescriptionDuration(Object prescriptionDuration) {
		return findByProperty(PRESCRIPTION_DURATION, prescriptionDuration);
	}

	public List findByPrescriptionRefillInfo(Object prescriptionRefillInfo) {
		return findByProperty(PRESCRIPTION_REFILL_INFO, prescriptionRefillInfo);
	}

	public List findByNotesId(Object notesId) {
		return findByProperty(NOTES_ID, notesId);
	}

	public List findByIsCurrent(Object isCurrent) {
		return findByProperty(IS_CURRENT, isCurrent);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Medication instances");
		try {
			String queryString = "from Medication";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Medication merge(Medication detachedInstance) {
		log.debug("merging Medication instance");
		try {
			Medication result = (Medication) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Medication instance) {
		log.debug("attaching dirty Medication instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Medication instance) {
		log.debug("attaching clean Medication instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MedicationDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MedicationDAO) ctx.getBean("MedicationDAO");
	}
}