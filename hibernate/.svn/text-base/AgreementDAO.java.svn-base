package edu.ucr.c3.wms.dao.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.Agreement;

/**
 * A data access object (DAO) providing persistence and search support for
 * Agreement entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.Agreement
 * @author MyEclipse Persistence Tools
 */

public class AgreementDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(AgreementDAO.class);
	// property constants
	public static final String CONTENT = "content";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Agreement transientInstance) {
		log.debug("saving Agreement instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Agreement persistentInstance) {
		log.debug("deleting Agreement instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Agreement findById(java.lang.Integer id) {
		log.debug("getting Agreement instance with id: " + id);
		try {
			Agreement instance = (Agreement) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.Agreement", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Agreement instance) {
		log.debug("finding Agreement instance by example");
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
		log.debug("finding Agreement instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Agreement as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Agreement instances");
		try {
			String queryString = "from Agreement";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Agreement merge(Agreement detachedInstance) {
		log.debug("merging Agreement instance");
		try {
			Agreement result = (Agreement) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Agreement instance) {
		log.debug("attaching dirty Agreement instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Agreement instance) {
		log.debug("attaching clean Agreement instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AgreementDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AgreementDAO) ctx.getBean("AgreementDAO");
	}
}