package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.AdminLogin;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdminLogin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.AdminLogin
 * @author MyEclipse Persistence Tools
 */

public class AdminLoginDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(AdminLoginDAO.class);
	// property constants
	public static final String LOGON_IP = "logonIp";

	protected void initDao() {
		// do nothing
	}

	public void save(AdminLogin transientInstance) {
		log.debug("saving AdminLogin instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AdminLogin persistentInstance) {
		log.debug("deleting AdminLogin instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AdminLogin findById(java.lang.Integer id) {
		log.debug("getting AdminLogin instance with id: " + id);
		try {
			AdminLogin instance = (AdminLogin) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.AdminLogin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AdminLogin instance) {
		log.debug("finding AdminLogin instance by example");
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
		log.debug("finding AdminLogin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AdminLogin as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLogonIp(Object logonIp) {
		return findByProperty(LOGON_IP, logonIp);
	}

	public List findAll() {
		log.debug("finding all AdminLogin instances");
		try {
			String queryString = "from AdminLogin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AdminLogin merge(AdminLogin detachedInstance) {
		log.debug("merging AdminLogin instance");
		try {
			AdminLogin result = (AdminLogin) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AdminLogin instance) {
		log.debug("attaching dirty AdminLogin instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AdminLogin instance) {
		log.debug("attaching clean AdminLogin instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AdminLoginDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AdminLoginDAO) ctx.getBean("AdminLoginDAO");
	}
}