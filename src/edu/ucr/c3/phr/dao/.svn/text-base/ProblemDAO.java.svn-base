package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Problem;

/**
 * A data access object (DAO) providing persistence and search support for
 * Problem entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Problem
 * @author MyEclipse Persistence Tools
 */

public class ProblemDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ProblemDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String NAME = "name";
	public static final String NAME_TYPE = "nameType";
	public static final String NAME_VALUE = "nameValue";
	public static final String NAME_ABBREV = "nameAbbrev";
	public static final String DIAGNOSED_BY = "diagnosedBy";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Problem transientInstance) {
		log.debug("saving Problem instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Problem persistentInstance) {
		log.debug("deleting Problem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Problem findById(java.lang.Integer id) {
		log.debug("getting Problem instance with id: " + id);
		try {
			Problem instance = (Problem) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Problem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Problem instance) {
		log.debug("finding Problem instance by example");
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
		log.debug("finding Problem instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Problem as model where model."
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

	public List findByDiagnosedBy(Object diagnosedBy) {
		return findByProperty(DIAGNOSED_BY, diagnosedBy);
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
		log.debug("finding all Problem instances");
		try {
			String queryString = "from Problem";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Problem merge(Problem detachedInstance) {
		log.debug("merging Problem instance");
		try {
			Problem result = (Problem) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Problem instance) {
		log.debug("attaching dirty Problem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Problem instance) {
		log.debug("attaching clean Problem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProblemDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ProblemDAO) ctx.getBean("ProblemDAO");
	}
}