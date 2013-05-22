package edu.ucr.c3.phr.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Immunization;

/**
 * A data access object (DAO) providing persistence and search support for
 * Immunization entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Immunization
 * @author MyEclipse Persistence Tools
 */

public class ImmunizationDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ImmunizationDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String ADMINISTERED_BY = "administeredBy";
	public static final String VACCINE_TYPE = "vaccineType";
	public static final String VACCINE_VALUE = "vaccineValue";
	public static final String VACCINE_MANUFACTURER = "vaccineManufacturer";
	public static final String VACCINE_LOT = "vaccineLot";
	public static final String SEQUENCE = "sequence";
	public static final String ANATOMIC_SURFACE = "anatomicSurface";
	public static final String ANATOMIC_SURFACE_VALUE = "anatomicSurfaceValue";
	public static final String ANATOMIC_SURFACE_ABBREV = "anatomicSurfaceAbbrev";
	public static final String ADVERSE_EVENT = "adverseEvent";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Immunization transientInstance) {
		log.debug("saving Immunization instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Immunization persistentInstance) {
		log.debug("deleting Immunization instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Immunization findById(java.lang.Integer id) {
		log.debug("getting Immunization instance with id: " + id);
		try {
			Immunization instance = (Immunization) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Immunization", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Immunization instance) {
		log.debug("finding Immunization instance by example");
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
		log.debug("finding Immunization instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Immunization as model where model."
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

	public List findByAdministeredBy(Object administeredBy) {
		return findByProperty(ADMINISTERED_BY, administeredBy);
	}

	public List findByVaccineType(Object vaccineType) {
		return findByProperty(VACCINE_TYPE, vaccineType);
	}

	public List findByVaccineValue(Object vaccineValue) {
		return findByProperty(VACCINE_VALUE, vaccineValue);
	}

	public List findByVaccineManufacturer(Object vaccineManufacturer) {
		return findByProperty(VACCINE_MANUFACTURER, vaccineManufacturer);
	}

	public List findByVaccineLot(Object vaccineLot) {
		return findByProperty(VACCINE_LOT, vaccineLot);
	}

	public List findBySequence(Object sequence) {
		return findByProperty(SEQUENCE, sequence);
	}

	public List findByAnatomicSurface(Object anatomicSurface) {
		return findByProperty(ANATOMIC_SURFACE, anatomicSurface);
	}

	public List findByAnatomicSurfaceValue(Object anatomicSurfaceValue) {
		return findByProperty(ANATOMIC_SURFACE_VALUE, anatomicSurfaceValue);
	}

	public List findByAnatomicSurfaceAbbrev(Object anatomicSurfaceAbbrev) {
		return findByProperty(ANATOMIC_SURFACE_ABBREV, anatomicSurfaceAbbrev);
	}

	public List findByAdverseEvent(Object adverseEvent) {
		return findByProperty(ADVERSE_EVENT, adverseEvent);
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
		log.debug("finding all Immunization instances");
		try {
			String queryString = "from Immunization";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Immunization merge(Immunization detachedInstance) {
		log.debug("merging Immunization instance");
		try {
			Immunization result = (Immunization) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Immunization instance) {
		log.debug("attaching dirty Immunization instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Immunization instance) {
		log.debug("attaching clean Immunization instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ImmunizationDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ImmunizationDAO) ctx.getBean("ImmunizationDAO");
	}
}