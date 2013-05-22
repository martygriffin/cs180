package edu.ucr.c3.wms.dao.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.University;

/**
 * A data access object (DAO) providing persistence and search support for
 * University entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.University
 * @author MyEclipse Persistence Tools
 */

public class UniversityDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UniversityDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String HOME_URL = "homeUrl";
	public static final String SID_RULE = "sidRule";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(University transientInstance) {
		log.debug("saving University instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(University persistentInstance) {
		log.debug("deleting University instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public University findById(java.lang.Integer id) {
		log.debug("getting University instance with id: " + id);
		try {
			University instance = (University) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.University", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(University instance) {
		log.debug("finding University instance by example");
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
		log.debug("finding University instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from University as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByHomeUrl(Object homeUrl) {
		return findByProperty(HOME_URL, homeUrl);
	}

	public List findBySidRule(Object sidRule) {
		return findByProperty(SID_RULE, sidRule);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all University instances");
		try {
			String queryString = "from University";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public University merge(University detachedInstance) {
		log.debug("merging University instance");
		try {
			University result = (University) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(University instance) {
		log.debug("attaching dirty University instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(University instance) {
		log.debug("attaching clean University instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UniversityDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UniversityDAO) ctx.getBean("UniversityDAO");
	}
}