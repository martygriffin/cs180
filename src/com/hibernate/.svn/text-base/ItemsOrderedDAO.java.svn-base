package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ItemsOrdered entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hibernate.ItemsOrdered
 * @author MyEclipse Persistence Tools
 */

public class ItemsOrderedDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ItemsOrderedDAO.class);
	// property constants
	public static final String IS_ACTIVE = "isActive";
	public static final String ITEM_PRIORITY = "itemPriority";

	protected void initDao() {
		// do nothing
	}

	public void save(ItemsOrdered transientInstance) {
		log.debug("saving ItemsOrdered instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ItemsOrdered persistentInstance) {
		log.debug("deleting ItemsOrdered instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItemsOrdered findById(java.lang.Integer id) {
		log.debug("getting ItemsOrdered instance with id: " + id);
		try {
			ItemsOrdered instance = (ItemsOrdered) getHibernateTemplate().get(
					"com.hibernate.ItemsOrdered", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ItemsOrdered instance) {
		log.debug("finding ItemsOrdered instance by example");
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
		log.debug("finding ItemsOrdered instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ItemsOrdered as model where model."
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

	public List findByItemPriority(Object itemPriority) {
		return findByProperty(ITEM_PRIORITY, itemPriority);
	}

	public List findAll() {
		log.debug("finding all ItemsOrdered instances");
		try {
			String queryString = "from ItemsOrdered";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ItemsOrdered merge(ItemsOrdered detachedInstance) {
		log.debug("merging ItemsOrdered instance");
		try {
			ItemsOrdered result = (ItemsOrdered) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ItemsOrdered instance) {
		log.debug("attaching dirty ItemsOrdered instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ItemsOrdered instance) {
		log.debug("attaching clean ItemsOrdered instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ItemsOrderedDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ItemsOrderedDAO) ctx.getBean("ItemsOrderedDAO");
	}
}