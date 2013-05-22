package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MenuItem entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hibernate.MenuItem
 * @author MyEclipse Persistence Tools
 */

public class MenuItemDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(MenuItemDAO.class);
	// property constants
	public static final String IS_ACTIVE = "isActive";

	protected void initDao() {
		// do nothing
	}

	public void save(MenuItem transientInstance) {
		log.debug("saving MenuItem instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MenuItem persistentInstance) {
		log.debug("deleting MenuItem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MenuItem findById(java.lang.Integer id) {
		log.debug("getting MenuItem instance with id: " + id);
		try {
			MenuItem instance = (MenuItem) getHibernateTemplate().get(
					"com.hibernate.MenuItem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MenuItem instance) {
		log.debug("finding MenuItem instance by example");
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
		log.debug("finding MenuItem instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MenuItem as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findAll() {
		log.debug("finding all MenuItem instances");
		try {
			String queryString = "from MenuItem";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MenuItem merge(MenuItem detachedInstance) {
		log.debug("merging MenuItem instance");
		try {
			MenuItem result = (MenuItem) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MenuItem instance) {
		log.debug("attaching dirty MenuItem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MenuItem instance) {
		log.debug("attaching clean MenuItem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MenuItemDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MenuItemDAO) ctx.getBean("MenuItemDAO");
	}
}