package com.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Social entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hibernate.Social
 * @author MyEclipse Persistence Tools
 */

public class SocialDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SocialDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String LINK = "link";
	public static final String IS_ACTIVE = "isActive";

	protected void initDao() {
		// do nothing
	}

	public void save(Social transientInstance) {
		log.debug("saving Social instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Social persistentInstance) {
		log.debug("deleting Social instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Social findById(java.lang.Integer id) {
		log.debug("getting Social instance with id: " + id);
		try {
			Social instance = (Social) getHibernateTemplate().get(
					"com.hibernate.Social", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Social instance) {
		log.debug("finding Social instance by example");
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
		log.debug("finding Social instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Social as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findAll() {
		log.debug("finding all Social instances");
		try {
			String queryString = "from Social";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Social merge(Social detachedInstance) {
		log.debug("merging Social instance");
		try {
			Social result = (Social) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Social instance) {
		log.debug("attaching dirty Social instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Social instance) {
		log.debug("attaching clean Social instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SocialDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SocialDAO) ctx.getBean("SocialDAO");
	}
}