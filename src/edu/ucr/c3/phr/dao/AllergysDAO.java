package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Allergys;

/**
 * A data access object (DAO) providing persistence and search support for
 * Allergys entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Allergys
 * @author MyEclipse Persistence Tools
 */

public class AllergysDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(AllergysDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String DIAGNOSED_BY = "diagnosedBy";
	public static final String ALLERGEN_TYPE = "allergenType";
	public static final String ALLERGEN_TYPE_TYPE = "allergenTypeType";
	public static final String ALLERGEN_TYPE_VALUE = "allergenTypeValue";
	public static final String ALLERGEN_TYPE_ABBREV = "allergenTypeAbbrev";
	public static final String ALLERGEN_NAME = "allergenName";
	public static final String ALLERGEN_NAME_TYPE = "allergenNameType";
	public static final String ALLERGEN_NAME_VALUE = "allergenNameValue";
	public static final String ALLERGEN_NAME_ABBREV = "allergenNameAbbrev";
	public static final String REACTION = "reaction";
	public static final String SPECIFICS = "specifics";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Allergys transientInstance) {
		log.debug("saving Allergys instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Allergys persistentInstance) {
		log.debug("deleting Allergys instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Allergys findById(java.lang.Integer id) {
		log.debug("getting Allergys instance with id: " + id);
		try {
			Allergys instance = (Allergys) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Allergys", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Allergys instance) {
		log.debug("finding Allergys instance by example");
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
		log.debug("finding Allergys instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Allergys as model where model."
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

	public List findByDiagnosedBy(Object diagnosedBy) {
		return findByProperty(DIAGNOSED_BY, diagnosedBy);
	}

	public List findByAllergenType(Object allergenType) {
		return findByProperty(ALLERGEN_TYPE, allergenType);
	}

	public List findByAllergenTypeType(Object allergenTypeType) {
		return findByProperty(ALLERGEN_TYPE_TYPE, allergenTypeType);
	}

	public List findByAllergenTypeValue(Object allergenTypeValue) {
		return findByProperty(ALLERGEN_TYPE_VALUE, allergenTypeValue);
	}

	public List findByAllergenTypeAbbrev(Object allergenTypeAbbrev) {
		return findByProperty(ALLERGEN_TYPE_ABBREV, allergenTypeAbbrev);
	}

	public List findByAllergenName(Object allergenName) {
		return findByProperty(ALLERGEN_NAME, allergenName);
	}

	public List findByAllergenNameType(Object allergenNameType) {
		return findByProperty(ALLERGEN_NAME_TYPE, allergenNameType);
	}

	public List findByAllergenNameValue(Object allergenNameValue) {
		return findByProperty(ALLERGEN_NAME_VALUE, allergenNameValue);
	}

	public List findByAllergenNameAbbrev(Object allergenNameAbbrev) {
		return findByProperty(ALLERGEN_NAME_ABBREV, allergenNameAbbrev);
	}

	public List findByReaction(Object reaction) {
		return findByProperty(REACTION, reaction);
	}

	public List findBySpecifics(Object specifics) {
		return findByProperty(SPECIFICS, specifics);
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
		log.debug("finding all Allergys instances");
		try {
			String queryString = "from Allergys";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Allergys merge(Allergys detachedInstance) {
		log.debug("merging Allergys instance");
		try {
			Allergys result = (Allergys) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Allergys instance) {
		log.debug("attaching dirty Allergys instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Allergys instance) {
		log.debug("attaching clean Allergys instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AllergysDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AllergysDAO) ctx.getBean("AllergysDAO");
	}
}