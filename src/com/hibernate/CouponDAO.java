package com.hibernate;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Coupon entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hibernate.Coupon
 * @author MyEclipse Persistence Tools
 */

public class CouponDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(CouponDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String COUPON_CODE = "couponCode";
	public static final String NUM_USES_ALLOWED = "numUsesAllowed";
	public static final String DISCOUNT_TYPE = "discountType";
	public static final String DISCOUNT_VALUE = "discountValue";
	public static final String IS_ACTIVE = "isActive";
	public static final String REQUIRMENT_TEXT = "requirmentText";
	public static final String REQUIRMENT_VALUE = "requirmentValue";

	protected void initDao() {
		// do nothing
	}

	public void save(Coupon transientInstance) {
		log.debug("saving Coupon instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Coupon persistentInstance) {
		log.debug("deleting Coupon instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Coupon findById(java.lang.Integer id) {
		log.debug("getting Coupon instance with id: " + id);
		try {
			Coupon instance = (Coupon) getHibernateTemplate().get(
					"com.hibernate.Coupon", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Coupon instance) {
		log.debug("finding Coupon instance by example");
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
		log.debug("finding Coupon instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Coupon as model where model."
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

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByCouponCode(Object couponCode) {
		return findByProperty(COUPON_CODE, couponCode);
	}

	public List findByNumUsesAllowed(Object numUsesAllowed) {
		return findByProperty(NUM_USES_ALLOWED, numUsesAllowed);
	}

	public List findByDiscountType(Object discountType) {
		return findByProperty(DISCOUNT_TYPE, discountType);
	}

	public List findByDiscountValue(Object discountValue) {
		return findByProperty(DISCOUNT_VALUE, discountValue);
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findByRequirmentText(Object requirmentText) {
		return findByProperty(REQUIRMENT_TEXT, requirmentText);
	}

	public List findByRequirmentValue(Object requirmentValue) {
		return findByProperty(REQUIRMENT_VALUE, requirmentValue);
	}

	public List findAll() {
		log.debug("finding all Coupon instances");
		try {
			String queryString = "from Coupon";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Coupon merge(Coupon detachedInstance) {
		log.debug("merging Coupon instance");
		try {
			Coupon result = (Coupon) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Coupon instance) {
		log.debug("attaching dirty Coupon instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Coupon instance) {
		log.debug("attaching clean Coupon instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CouponDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CouponDAO) ctx.getBean("CouponDAO");
	}
}