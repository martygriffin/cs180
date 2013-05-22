package edu.ucr.c3.wms.dao.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.AppType;

/**
 * A data access object (DAO) providing persistence and search support for
 * AppType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.AppType
 * @author MyEclipse Persistence Tools
 */

public class AppTypeDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(AppTypeDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(AppType transientInstance) {
		log.debug("saving AppType instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AppType persistentInstance) {
		log.debug("deleting AppType instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AppType findById(java.lang.Short id) {
		log.debug("getting AppType instance with id: " + id);
		try {
			AppType instance = (AppType) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.AppType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AppType instance) {
		log.debug("finding AppType instance by example");
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
		log.debug("finding AppType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AppType as model where model."
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

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all AppType instances");
		try {
			String queryString = "from AppType";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AppType merge(AppType detachedInstance) {
		log.debug("merging AppType instance");
		try {
			AppType result = (AppType) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AppType instance) {
		log.debug("attaching dirty AppType instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AppType instance) {
		log.debug("attaching clean AppType instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AppTypeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AppTypeDAO) ctx.getBean("AppTypeDAO");
	}
}