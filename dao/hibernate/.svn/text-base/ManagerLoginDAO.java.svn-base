package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.ManagerLogin;

/**
 * A data access object (DAO) providing persistence and search support for
 * ManagerLogin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.ManagerLogin
 * @author MyEclipse Persistence Tools
 */

public class ManagerLoginDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ManagerLoginDAO.class);
	// property constants
	public static final String LOGON_IP = "logonIp";

	protected void initDao() {
		// do nothing
	}

	public void save(ManagerLogin transientInstance) {
		log.debug("saving ManagerLogin instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ManagerLogin persistentInstance) {
		log.debug("deleting ManagerLogin instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ManagerLogin findById(java.lang.Integer id) {
		log.debug("getting ManagerLogin instance with id: " + id);
		try {
			ManagerLogin instance = (ManagerLogin) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.ManagerLogin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ManagerLogin instance) {
		log.debug("finding ManagerLogin instance by example");
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
		log.debug("finding ManagerLogin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ManagerLogin as model where model."
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
		log.debug("finding all ManagerLogin instances");
		try {
			String queryString = "from ManagerLogin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ManagerLogin merge(ManagerLogin detachedInstance) {
		log.debug("merging ManagerLogin instance");
		try {
			ManagerLogin result = (ManagerLogin) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ManagerLogin instance) {
		log.debug("attaching dirty ManagerLogin instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ManagerLogin instance) {
		log.debug("attaching clean ManagerLogin instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ManagerLoginDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ManagerLoginDAO) ctx.getBean("ManagerLoginDAO");
	}
}