package edu.ucr.c3.phr.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Vitals;

/**
 * A data access object (DAO) providing persistence and search support for
 * Vitals entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Vitals
 * @author MyEclipse Persistence Tools
 */

public class VitalsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(VitalsDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String NAME = "name";
	public static final String NAME_TYPE = "nameType";
	public static final String VALUE = "value";
	public static final String UNIT = "unit";
	public static final String UNIT_TYPE = "unitType";
	public static final String SITE = "site";
	public static final String POSITION = "position";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Vitals transientInstance) {
		log.debug("saving Vitals instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vitals persistentInstance) {
		log.debug("deleting Vitals instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vitals findById(java.lang.Integer id) {
		log.debug("getting Vitals instance with id: " + id);
		try {
			Vitals instance = (Vitals) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Vitals", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vitals instance) {
		log.debug("finding Vitals instance by example");
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
		log.debug("finding Vitals instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Vitals as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByNameType(Object nameType) {
		return findByProperty(NAME_TYPE, nameType);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findByUnit(Object unit) {
		return findByProperty(UNIT, unit);
	}

	public List findByUnitType(Object unitType) {
		return findByProperty(UNIT_TYPE, unitType);
	}

	public List findBySite(Object site) {
		return findByProperty(SITE, site);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findByNotesId(Object notesId) {
		return findByProperty(NOTES_ID, notesId);
	}

	public List findByIsCurrent(Object isCurrent) {
		return findByProperty(IS_CURRENT, isCurrent);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Vitals instances");
		try {
			String queryString = "from Vitals";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Vitals merge(Vitals detachedInstance) {
		log.debug("merging Vitals instance");
		try {
			Vitals result = (Vitals) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vitals instance) {
		log.debug("attaching dirty Vitals instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vitals instance) {
		log.debug("attaching clean Vitals instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VitalsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VitalsDAO) ctx.getBean("VitalsDAO");
	}
}