package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.InsuranceType;

/**
 * A data access object (DAO) providing persistence and search support for
 * InsuranceType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.InsuranceType
 * @author MyEclipse Persistence Tools
 */

public class InsuranceTypeDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(InsuranceTypeDAO.class);
	// property constants
	public static final String NAME = "name";

	protected void initDao() {
		// do nothing
	}

	public void save(InsuranceType transientInstance) {
		log.debug("saving InsuranceType instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(InsuranceType persistentInstance) {
		log.debug("deleting InsuranceType instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InsuranceType findById(java.lang.Integer id) {
		log.debug("getting InsuranceType instance with id: " + id);
		try {
			InsuranceType instance = (InsuranceType) getHibernateTemplate()
					.get("edu.ucr.c3.phr.domain.InsuranceType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(InsuranceType instance) {
		log.debug("finding InsuranceType instance by example");
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
		log.debug("finding InsuranceType instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from InsuranceType as model where model."
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

	public List findAll() {
		log.debug("finding all InsuranceType instances");
		try {
			String queryString = "from InsuranceType";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public InsuranceType merge(InsuranceType detachedInstance) {
		log.debug("merging InsuranceType instance");
		try {
			InsuranceType result = (InsuranceType) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(InsuranceType instance) {
		log.debug("attaching dirty InsuranceType instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InsuranceType instance) {
		log.debug("attaching clean InsuranceType instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InsuranceTypeDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (InsuranceTypeDAO) ctx.getBean("InsuranceTypeDAO");
	}
}