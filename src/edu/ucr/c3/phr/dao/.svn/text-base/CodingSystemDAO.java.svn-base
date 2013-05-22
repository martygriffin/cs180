package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.CodingSystem;

/**
 * A data access object (DAO) providing persistence and search support for
 * CodingSystem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.CodingSystem
 * @author MyEclipse Persistence Tools
 */

public class CodingSystemDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CodingSystemDAO.class);
	// property constants
	public static final String SHORT_NAME = "shortName";
	public static final String DESCRIPTION = "description";

	protected void initDao() {
		// do nothing
	}

	public void save(CodingSystem transientInstance) {
		log.debug("saving CodingSystem instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CodingSystem persistentInstance) {
		log.debug("deleting CodingSystem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CodingSystem findById(java.lang.Integer id) {
		log.debug("getting CodingSystem instance with id: " + id);
		try {
			CodingSystem instance = (CodingSystem) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.CodingSystem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CodingSystem instance) {
		log.debug("finding CodingSystem instance by example");
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
		log.debug("finding CodingSystem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CodingSystem as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShortName(Object shortName) {
		return findByProperty(SHORT_NAME, shortName);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all CodingSystem instances");
		try {
			String queryString = "from CodingSystem";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CodingSystem merge(CodingSystem detachedInstance) {
		log.debug("merging CodingSystem instance");
		try {
			CodingSystem result = (CodingSystem) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CodingSystem instance) {
		log.debug("attaching dirty CodingSystem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CodingSystem instance) {
		log.debug("attaching clean CodingSystem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CodingSystemDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CodingSystemDAO) ctx.getBean("CodingSystemDAO");
	}
}