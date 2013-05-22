package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Modality;

/**
 * A data access object (DAO) providing persistence and search support for
 * Modality entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Modality
 * @author MyEclipse Persistence Tools
 */

public class ModalityDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ModalityDAO.class);
	// property constants
	public static final String SYMBOL = "symbol";
	public static final String DESCRIPTION = "description";

	protected void initDao() {
		// do nothing
	}

	public void save(Modality transientInstance) {
		log.debug("saving Modality instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Modality persistentInstance) {
		log.debug("deleting Modality instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Modality findById(java.lang.Integer id) {
		log.debug("getting Modality instance with id: " + id);
		try {
			Modality instance = (Modality) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Modality", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Modality instance) {
		log.debug("finding Modality instance by example");
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
		log.debug("finding Modality instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Modality as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySymbol(Object symbol) {
		return findByProperty(SYMBOL, symbol);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Modality instances");
		try {
			String queryString = "from Modality";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Modality merge(Modality detachedInstance) {
		log.debug("merging Modality instance");
		try {
			Modality result = (Modality) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Modality instance) {
		log.debug("attaching dirty Modality instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Modality instance) {
		log.debug("attaching clean Modality instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ModalityDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ModalityDAO) ctx.getBean("ModalityDAO");
	}
}