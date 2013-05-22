package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.CodingSystemsValue;

/**
 * A data access object (DAO) providing persistence and search support for
 * CodingSystemsValue entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.CodingSystemsValue
 * @author MyEclipse Persistence Tools
 */

public class CodingSystemsValueDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CodingSystemsValueDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String CODE = "code";
	public static final String ABBREVIATION = "abbreviation";
	public static final String PHYSICIAN_VALUE = "physicianValue";
	public static final String CONSUMER_VALUE = "consumerValue";
	public static final String UMLS_CODE = "umlsCode";
	public static final String ADDITIONAL_FIELDS = "additionalFields";
	public static final String SYSTEM_ID = "systemId";

	protected void initDao() {
		// do nothing
	}

	public void save(CodingSystemsValue transientInstance) {
		log.debug("saving CodingSystemsValue instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CodingSystemsValue persistentInstance) {
		log.debug("deleting CodingSystemsValue instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CodingSystemsValue findById(java.lang.Integer id) {
		log.debug("getting CodingSystemsValue instance with id: " + id);
		try {
			CodingSystemsValue instance = (CodingSystemsValue) getHibernateTemplate()
					.get("edu.ucr.c3.phr.domain.CodingSystemsValue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CodingSystemsValue instance) {
		log.debug("finding CodingSystemsValue instance by example");
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
		log.debug("finding CodingSystemsValue instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from CodingSystemsValue as model where model."
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

	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	public List findByAbbreviation(Object abbreviation) {
		return findByProperty(ABBREVIATION, abbreviation);
	}

	public List findByPhysicianValue(Object physicianValue) {
		return findByProperty(PHYSICIAN_VALUE, physicianValue);
	}

	public List findByConsumerValue(Object consumerValue) {
		return findByProperty(CONSUMER_VALUE, consumerValue);
	}

	public List findByUmlsCode(Object umlsCode) {
		return findByProperty(UMLS_CODE, umlsCode);
	}

	public List findByAdditionalFields(Object additionalFields) {
		return findByProperty(ADDITIONAL_FIELDS, additionalFields);
	}

	public List findBySystemId(Object systemId) {
		return findByProperty(SYSTEM_ID, systemId);
	}

	public List findAll() {
		log.debug("finding all CodingSystemsValue instances");
		try {
			String queryString = "from CodingSystemsValue";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CodingSystemsValue merge(CodingSystemsValue detachedInstance) {
		log.debug("merging CodingSystemsValue instance");
		try {
			CodingSystemsValue result = (CodingSystemsValue) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CodingSystemsValue instance) {
		log.debug("attaching dirty CodingSystemsValue instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CodingSystemsValue instance) {
		log.debug("attaching clean CodingSystemsValue instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CodingSystemsValueDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CodingSystemsValueDAO) ctx.getBean("CodingSystemsValueDAO");
	}
}