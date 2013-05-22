package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ItemCustomizations entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hibernate.ItemCustomizations
 * @author MyEclipse Persistence Tools
 */

public class ItemCustomizationsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ItemCustomizationsDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(ItemCustomizations transientInstance) {
		log.debug("saving ItemCustomizations instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ItemCustomizations persistentInstance) {
		log.debug("deleting ItemCustomizations instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItemCustomizations findById(java.lang.Integer id) {
		log.debug("getting ItemCustomizations instance with id: " + id);
		try {
			ItemCustomizations instance = (ItemCustomizations) getHibernateTemplate()
					.get("com.hibernate.ItemCustomizations", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ItemCustomizations instance) {
		log.debug("finding ItemCustomizations instance by example");
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
		log.debug("finding ItemCustomizations instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ItemCustomizations as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ItemCustomizations instances");
		try {
			String queryString = "from ItemCustomizations";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ItemCustomizations merge(ItemCustomizations detachedInstance) {
		log.debug("merging ItemCustomizations instance");
		try {
			ItemCustomizations result = (ItemCustomizations) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ItemCustomizations instance) {
		log.debug("attaching dirty ItemCustomizations instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ItemCustomizations instance) {
		log.debug("attaching clean ItemCustomizations instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ItemCustomizationsDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ItemCustomizationsDAO) ctx.getBean("ItemCustomizationsDAO");
	}
}