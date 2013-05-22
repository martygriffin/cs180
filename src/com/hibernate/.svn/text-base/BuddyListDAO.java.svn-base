package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BuddyList entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hibernate.BuddyList
 * @author MyEclipse Persistence Tools
 */

public class BuddyListDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(BuddyListDAO.class);
	// property constants
	public static final String USER_ID2 = "userId2";
	public static final String IS_ACTIVE = "isActive";

	protected void initDao() {
		// do nothing
	}

	public void save(BuddyList transientInstance) {
		log.debug("saving BuddyList instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BuddyList persistentInstance) {
		log.debug("deleting BuddyList instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BuddyList findById(java.lang.Integer id) {
		log.debug("getting BuddyList instance with id: " + id);
		try {
			BuddyList instance = (BuddyList) getHibernateTemplate().get(
					"com.hibernate.BuddyList", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BuddyList instance) {
		log.debug("finding BuddyList instance by example");
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
		log.debug("finding BuddyList instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BuddyList as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId2(Object userId2) {
		return findByProperty(USER_ID2, userId2);
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findAll() {
		log.debug("finding all BuddyList instances");
		try {
			String queryString = "from BuddyList";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BuddyList merge(BuddyList detachedInstance) {
		log.debug("merging BuddyList instance");
		try {
			BuddyList result = (BuddyList) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BuddyList instance) {
		log.debug("attaching dirty BuddyList instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BuddyList instance) {
		log.debug("attaching clean BuddyList instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BuddyListDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BuddyListDAO) ctx.getBean("BuddyListDAO");
	}
}