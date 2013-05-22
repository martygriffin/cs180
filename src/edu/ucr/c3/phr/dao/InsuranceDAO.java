package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Insurance;

/**
 * A data access object (DAO) providing persistence and search support for
 * Insurance entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Insurance
 * @author MyEclipse Persistence Tools
 */

public class InsuranceDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(InsuranceDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String COMPANY_NAME = "companyName";
	public static final String TYPE_ID = "typeId";
	public static final String PLAN_NAME = "planName";
	public static final String PLAN_ID = "planId";
	public static final String GROUP_NUMBER = "groupNumber";
	public static final String MEMBER_ID = "memberId";
	public static final String POLICY_ID = "policyId";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String NOTES_ID = "notesId";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Insurance transientInstance) {
		log.debug("saving Insurance instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Insurance persistentInstance) {
		log.debug("deleting Insurance instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Insurance findById(java.lang.Integer id) {
		log.debug("getting Insurance instance with id: " + id);
		try {
			Insurance instance = (Insurance) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Insurance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Insurance instance) {
		log.debug("finding Insurance instance by example");
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
		log.debug("finding Insurance instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Insurance as model where model."
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

	public List findByCompanyName(Object companyName) {
		return findByProperty(COMPANY_NAME, companyName);
	}

	public List findByTypeId(Object typeId) {
		return findByProperty(TYPE_ID, typeId);
	}

	public List findByPlanName(Object planName) {
		return findByProperty(PLAN_NAME, planName);
	}

	public List findByPlanId(Object planId) {
		return findByProperty(PLAN_ID, planId);
	}

	public List findByGroupNumber(Object groupNumber) {
		return findByProperty(GROUP_NUMBER, groupNumber);
	}

	public List findByMemberId(Object memberId) {
		return findByProperty(MEMBER_ID, memberId);
	}

	public List findByPolicyId(Object policyId) {
		return findByProperty(POLICY_ID, policyId);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByFax(Object fax) {
		return findByProperty(FAX, fax);
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
		log.debug("finding all Insurance instances");
		try {
			String queryString = "from Insurance";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Insurance merge(Insurance detachedInstance) {
		log.debug("merging Insurance instance");
		try {
			Insurance result = (Insurance) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Insurance instance) {
		log.debug("attaching dirty Insurance instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Insurance instance) {
		log.debug("attaching clean Insurance instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static InsuranceDAO getFromApplicationContext(ApplicationContext ctx) {
		return (InsuranceDAO) ctx.getBean("InsuranceDAO");
	}
}