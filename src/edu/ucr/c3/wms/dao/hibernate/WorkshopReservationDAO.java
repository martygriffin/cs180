package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.WorkshopReservation;

/**
 * A data access object (DAO) providing persistence and search support for
 * WorkshopReservation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.WorkshopReservation
 * @author MyEclipse Persistence Tools
 */

public class WorkshopReservationDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(WorkshopReservationDAO.class);
	// property constants
	public static final String CONFIRMATION_NUMBER = "confirmationNumber";
	public static final String RESERVATION_IP = "reservationIp";
	public static final String ATTENDED = "attended";

	protected void initDao() {
		// do nothing
	}

	public void save(WorkshopReservation transientInstance) {
		log.debug("saving WorkshopReservation instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WorkshopReservation persistentInstance) {
		log.debug("deleting WorkshopReservation instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WorkshopReservation findById(java.lang.Integer id) {
		log.debug("getting WorkshopReservation instance with id: " + id);
		try {
			WorkshopReservation instance = (WorkshopReservation) getHibernateTemplate()
					.get("edu.ucr.c3.wms.domain.WorkshopReservation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WorkshopReservation instance) {
		log.debug("finding WorkshopReservation instance by example");
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
		log.debug("finding WorkshopReservation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from WorkshopReservation as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAttendance(Object attended) {
		return findByProperty(ATTENDED, attended);
	}
	
	public List findByConfirmationNumber(Object confirmationNumber) {
		return findByProperty(CONFIRMATION_NUMBER, confirmationNumber);
	}

	public List findByReservationIp(Object reservationIp) {
		return findByProperty(RESERVATION_IP, reservationIp);
	}

	public List findAll() {
		log.debug("finding all WorkshopReservation instances");
		try {
			String queryString = "from WorkshopReservation";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WorkshopReservation merge(WorkshopReservation detachedInstance) {
		log.debug("merging WorkshopReservation instance");
		try {
			WorkshopReservation result = (WorkshopReservation) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WorkshopReservation instance) {
		log.debug("attaching dirty WorkshopReservation instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WorkshopReservation instance) {
		log.debug("attaching clean WorkshopReservation instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WorkshopReservationDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (WorkshopReservationDAO) ctx.getBean("WorkshopReservationDAO");
	}
}