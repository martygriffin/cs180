package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Procedures;

/**
 * A data access object (DAO) providing persistence and search support for
 * Procedures entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Procedures
 * @author MyEclipse Persistence Tools
 */

public class ProceduresDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ProceduresDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String NAME = "name";
	public static final String NAME_TYPE = "nameType";
	public static final String NAME_VALUE = "nameValue";
	public static final String NAME_ABBREV = "nameAbbrev";
	public static final String LOCATION = "location";
	public static final String PROVIDER_NAME = "providerName";
	public static final String PROVIDER_INSTITUTION = "providerInstitution";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Procedures transientInstance) {
		log.debug("saving Procedures instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Procedures persistentInstance) {
		log.debug("deleting Procedures instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Procedures findById(java.lang.Integer id) {
		log.debug("getting Procedures instance with id: " + id);
		try {
			Procedures instance = (Procedures) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Procedures", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Procedures instance) {
		log.debug("finding Procedures instance by example");
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
		log.debug("finding Procedures instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Procedures as model where model."
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

	public List findByNameValue(Object nameValue) {
		return findByProperty(NAME_VALUE, nameValue);
	}

	public List findByNameAbbrev(Object nameAbbrev) {
		return findByProperty(NAME_ABBREV, nameAbbrev);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByProviderName(Object providerName) {
		return findByProperty(PROVIDER_NAME, providerName);
	}

	public List findByProviderInstitution(Object providerInstitution) {
		return findByProperty(PROVIDER_INSTITUTION, providerInstitution);
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
		log.debug("finding all Procedures instances");
		try {
			String queryString = "from Procedures";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Procedures merge(Procedures detachedInstance) {
		log.debug("merging Procedures instance");
		try {
			Procedures result = (Procedures) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Procedures instance) {
		log.debug("attaching dirty Procedures instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Procedures instance) {
		log.debug("attaching clean Procedures instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProceduresDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ProceduresDAO) ctx.getBean("ProceduresDAO");
	}
}