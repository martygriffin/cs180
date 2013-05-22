package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.SimpleClinicalNote;

/**
 * A data access object (DAO) providing persistence and search support for
 * SimpleClinicalNote entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.SimpleClinicalNote
 * @author MyEclipse Persistence Tools
 */

public class SimpleClinicalNoteDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(SimpleClinicalNoteDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String VISIT_TYPE = "visitType";
	public static final String VISIT_LOCATION = "visitLocation";
	public static final String SPECIALTY = "specialty";
	public static final String SPECIALTY_VALUE = "specialtyValue";
	public static final String PROVIDER_INSTITUTION = "providerInstitution";
	public static final String CHIEF_COMPLAINT = "chiefComplaint";
	public static final String CONTENT = "content";
	public static final String NOTES_ID = "notesId";
	public static final String PROVIDER_ID = "providerId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(SimpleClinicalNote transientInstance) {
		log.debug("saving SimpleClinicalNote instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SimpleClinicalNote persistentInstance) {
		log.debug("deleting SimpleClinicalNote instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SimpleClinicalNote findById(java.lang.Integer id) {
		log.debug("getting SimpleClinicalNote instance with id: " + id);
		try {
			SimpleClinicalNote instance = (SimpleClinicalNote) getHibernateTemplate()
					.get("edu.ucr.c3.phr.domain.SimpleClinicalNote", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SimpleClinicalNote instance) {
		log.debug("finding SimpleClinicalNote instance by example");
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
		log.debug("finding SimpleClinicalNote instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from SimpleClinicalNote as model where model."
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

	public List findByVisitType(Object visitType) {
		return findByProperty(VISIT_TYPE, visitType);
	}

	public List findByVisitLocation(Object visitLocation) {
		return findByProperty(VISIT_LOCATION, visitLocation);
	}

	public List findBySpecialty(Object specialty) {
		return findByProperty(SPECIALTY, specialty);
	}

	public List findBySpecialtyValue(Object specialtyValue) {
		return findByProperty(SPECIALTY_VALUE, specialtyValue);
	}

	public List findByProviderInstitution(Object providerInstitution) {
		return findByProperty(PROVIDER_INSTITUTION, providerInstitution);
	}

	public List findByChiefComplaint(Object chiefComplaint) {
		return findByProperty(CHIEF_COMPLAINT, chiefComplaint);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByNotesId(Object notesId) {
		return findByProperty(NOTES_ID, notesId);
	}

	public List findByProviderId(Object providerId) {
		return findByProperty(PROVIDER_ID, providerId);
	}

	public List findByIsCurrent(Object isCurrent) {
		return findByProperty(IS_CURRENT, isCurrent);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all SimpleClinicalNote instances");
		try {
			String queryString = "from SimpleClinicalNote";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SimpleClinicalNote merge(SimpleClinicalNote detachedInstance) {
		log.debug("merging SimpleClinicalNote instance");
		try {
			SimpleClinicalNote result = (SimpleClinicalNote) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SimpleClinicalNote instance) {
		log.debug("attaching dirty SimpleClinicalNote instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SimpleClinicalNote instance) {
		log.debug("attaching clean SimpleClinicalNote instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SimpleClinicalNoteDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (SimpleClinicalNoteDAO) ctx.getBean("SimpleClinicalNoteDAO");
	}
}