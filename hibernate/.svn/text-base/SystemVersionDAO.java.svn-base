package edu.ucr.c3.wms.dao.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.SystemVersion;

/**
 * A data access object (DAO) providing persistence and search support for
 * SystemVersion entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.SystemVersion
 * @author MyEclipse Persistence Tools
 */

public class SystemVersionDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(SystemVersionDAO.class);
	// property constants
	public static final String MAJOR = "major";
	public static final String MINOR = "minor";
	public static final String BUGFIX = "bugfix";
	public static final String DESCRIPTION = "description";
	public static final String APP_RELEASE = "appRelease";

	protected void initDao() {
		// do nothing
	}

	public void save(SystemVersion transientInstance) {
		log.debug("saving SystemVersion instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SystemVersion persistentInstance) {
		log.debug("deleting SystemVersion instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SystemVersion findById(java.lang.Integer id) {
		log.debug("getting SystemVersion instance with id: " + id);
		try {
			SystemVersion instance = (SystemVersion) getHibernateTemplate()
					.get("edu.ucr.c3.wms.domain.SystemVersion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SystemVersion instance) {
		log.debug("finding SystemVersion instance by example");
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
		log.debug("finding SystemVersion instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from SystemVersion as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	public List findByMinor(Object minor) {
		return findByProperty(MINOR, minor);
	}

	public List findByBugfix(Object bugfix) {
		return findByProperty(BUGFIX, bugfix);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByAppRelease(Object appRelease) {
		return findByProperty(APP_RELEASE, appRelease);
	}

	public List findAll() {
		log.debug("finding all SystemVersion instances");
		try {
			String queryString = "from SystemVersion";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SystemVersion merge(SystemVersion detachedInstance) {
		log.debug("merging SystemVersion instance");
		try {
			SystemVersion result = (SystemVersion) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SystemVersion instance) {
		log.debug("attaching dirty SystemVersion instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SystemVersion instance) {
		log.debug("attaching clean SystemVersion instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SystemVersionDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (SystemVersionDAO) ctx.getBean("SystemVersionDAO");
	}
}