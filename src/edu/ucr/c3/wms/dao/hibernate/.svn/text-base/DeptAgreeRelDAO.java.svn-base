package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.DeptAgreeRel;

/**
 * A data access object (DAO) providing persistence and search support for
 * DeptAgreeRel entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.DeptAgreeRel
 * @author MyEclipse Persistence Tools
 */

public class DeptAgreeRelDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(DeptAgreeRelDAO.class);
	// property constants
	public static final String COMMENTS = "comments";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(DeptAgreeRel transientInstance) {
		log.debug("saving DeptAgreeRel instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DeptAgreeRel persistentInstance) {
		log.debug("deleting DeptAgreeRel instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DeptAgreeRel findById(java.lang.Integer id) {
		log.debug("getting DeptAgreeRel instance with id: " + id);
		try {
			DeptAgreeRel instance = (DeptAgreeRel) getHibernateTemplate().get(
					"edu.ucr.c3.wms.domain.DeptAgreeRel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DeptAgreeRel instance) {
		log.debug("finding DeptAgreeRel instance by example");
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
		log.debug("finding DeptAgreeRel instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DeptAgreeRel as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all DeptAgreeRel instances");
		try {
			String queryString = "from DeptAgreeRel";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DeptAgreeRel merge(DeptAgreeRel detachedInstance) {
		log.debug("merging DeptAgreeRel instance");
		try {
			DeptAgreeRel result = (DeptAgreeRel) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DeptAgreeRel instance) {
		log.debug("attaching dirty DeptAgreeRel instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DeptAgreeRel instance) {
		log.debug("attaching clean DeptAgreeRel instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DeptAgreeRelDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (DeptAgreeRelDAO) ctx.getBean("DeptAgreeRelDAO");
	}
}