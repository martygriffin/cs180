package edu.ucr.c3.phr.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Notes;

/**
 * A data access object (DAO) providing persistence and search support for Notes
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Notes
 * @author MyEclipse Persistence Tools
 */

public class NotesDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(NotesDAO.class);
	// property constants
	public static final String NOTE = "note";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Notes transientInstance) {
		log.debug("saving Notes instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Notes persistentInstance) {
		log.debug("deleting Notes instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Notes findById(java.lang.Integer id) {
		log.debug("getting Notes instance with id: " + id);
		try {
			Notes instance = (Notes) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Notes", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Notes instance) {
		log.debug("finding Notes instance by example");
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
		log.debug("finding Notes instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Notes as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNote(Object note) {
		return findByProperty(NOTE, note);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Notes instances");
		try {
			String queryString = "from Notes";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Notes merge(Notes detachedInstance) {
		log.debug("merging Notes instance");
		try {
			Notes result = (Notes) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Notes instance) {
		log.debug("attaching dirty Notes instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Notes instance) {
		log.debug("attaching clean Notes instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NotesDAO getFromApplicationContext(ApplicationContext ctx) {
		return (NotesDAO) ctx.getBean("NotesDAO");
	}
}