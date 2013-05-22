package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Measurement;

/**
 * A data access object (DAO) providing persistence and search support for
 * Measurement entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Measurement
 * @author MyEclipse Persistence Tools
 */

public class MeasurementDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(MeasurementDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String TYPE = "type";
	public static final String VALUE = "value";
	public static final String UNIT = "unit";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Measurement transientInstance) {
		log.debug("saving Measurement instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Measurement persistentInstance) {
		log.debug("deleting Measurement instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Measurement findById(java.lang.Integer id) {
		log.debug("getting Measurement instance with id: " + id);
		try {
			Measurement instance = (Measurement) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Measurement", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Measurement instance) {
		log.debug("finding Measurement instance by example");
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
		log.debug("finding Measurement instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Measurement as model where model."
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

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findByUnit(Object unit) {
		return findByProperty(UNIT, unit);
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
		log.debug("finding all Measurement instances");
		try {
			String queryString = "from Measurement";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Measurement merge(Measurement detachedInstance) {
		log.debug("merging Measurement instance");
		try {
			Measurement result = (Measurement) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Measurement instance) {
		log.debug("attaching dirty Measurement instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Measurement instance) {
		log.debug("attaching clean Measurement instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MeasurementDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (MeasurementDAO) ctx.getBean("MeasurementDAO");
	}
}