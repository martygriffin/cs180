package com.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Reservation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hibernate.Reservation
 * @author MyEclipse Persistence Tools
 */

public class ReservationDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ReservationDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String TABLE_NUMBER = "tableNumber";
	public static final String DURATION = "duration";
	public static final String GROUP_SIZE = "groupSize";
	public static final String SPECIAL_REQUESTS = "specialRequests";
	public static final String IS_ACTIVE = "isActive";

	protected void initDao() {
		// do nothing
	}

	public void save(Reservation transientInstance) {
		log.debug("saving Reservation instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Reservation persistentInstance) {
		log.debug("deleting Reservation instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Reservation findById(java.lang.Integer id) {
		log.debug("getting Reservation instance with id: " + id);
		try {
			Reservation instance = (Reservation) getHibernateTemplate().get(
					"com.hibernate.Reservation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Reservation instance) {
		log.debug("finding Reservation instance by example");
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
		log.debug("finding Reservation instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Reservation as model where model."
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

	public List findByTableNumber(Object tableNumber) {
		return findByProperty(TABLE_NUMBER, tableNumber);
	}

	public List findByDuration(Object duration) {
		return findByProperty(DURATION, duration);
	}

	public List findByGroupSize(Object groupSize) {
		return findByProperty(GROUP_SIZE, groupSize);
	}

	public List findBySpecialRequests(Object specialRequests) {
		return findByProperty(SPECIAL_REQUESTS, specialRequests);
	}

	public List findByIsActive(Object isActive) {
		return findByProperty(IS_ACTIVE, isActive);
	}

	public List findAll() {
		log.debug("finding all Reservation instances");
		try {
			String queryString = "from Reservation";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Reservation merge(Reservation detachedInstance) {
		log.debug("merging Reservation instance");
		try {
			Reservation result = (Reservation) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Reservation instance) {
		log.debug("attaching dirty Reservation instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Reservation instance) {
		log.debug("attaching clean Reservation instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ReservationDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ReservationDAO) ctx.getBean("ReservationDAO");
	}
}