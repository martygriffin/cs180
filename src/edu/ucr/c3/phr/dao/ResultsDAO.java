package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Results;

/**
 * A data access object (DAO) providing persistence and search support for
 * Results entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Results
 * @author MyEclipse Persistence Tools
 */

public class ResultsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ResultsDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String TEST_NAME = "testName";
	public static final String RESULT = "result";
	public static final String UNITS = "units";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Results transientInstance) {
		log.debug("saving Results instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Results persistentInstance) {
		log.debug("deleting Results instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Results findById(java.lang.Integer id) {
		log.debug("getting Results instance with id: " + id);
		try {
			Results instance = (Results) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Results", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Results instance) {
		log.debug("finding Results instance by example");
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
		log.debug("finding Results instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Results as model where model."
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

	public List findByTestName(Object testName) {
		return findByProperty(TEST_NAME, testName);
	}

	public List findByResult(Object result) {
		return findByProperty(RESULT, result);
	}

	public List findByUnits(Object units) {
		return findByProperty(UNITS, units);
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
		log.debug("finding all Results instances");
		try {
			String queryString = "from Results";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Results merge(Results detachedInstance) {
		log.debug("merging Results instance");
		try {
			Results result = (Results) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Results instance) {
		log.debug("attaching dirty Results instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Results instance) {
		log.debug("attaching clean Results instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ResultsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ResultsDAO) ctx.getBean("ResultsDAO");
	}
}