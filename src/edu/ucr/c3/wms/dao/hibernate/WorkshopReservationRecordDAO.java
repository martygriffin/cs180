package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.WorkshopReservationRecord;

/**
 * A data access object (DAO) providing persistence and search support for
 * WorkshopReservationRecord entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.WorkshopReservationRecord
 * @author MyEclipse Persistence Tools
 */

public class WorkshopReservationRecordDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(WorkshopReservationRecordDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(WorkshopReservationRecord transientInstance) {
		log.debug("saving WorkshopReservationRecord instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WorkshopReservationRecord persistentInstance) {
		log.debug("deleting WorkshopReservationRecord instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WorkshopReservationRecord findById(java.lang.Integer id) {
		log.debug("getting WorkshopReservationRecord instance with id: " + id);
		try {
			WorkshopReservationRecord instance = (WorkshopReservationRecord) getHibernateTemplate()
					.get(
							"edu.ucr.c3.wms.domain.WorkshopReservationRecord",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WorkshopReservationRecord instance) {
		log.debug("finding WorkshopReservationRecord instance by example");
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
		log.debug("finding WorkshopReservationRecord instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from WorkshopReservationRecord as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WorkshopReservationRecord instances");
		try {
			String queryString = "from WorkshopReservationRecord";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WorkshopReservationRecord merge(
			WorkshopReservationRecord detachedInstance) {
		log.debug("merging WorkshopReservationRecord instance");
		try {
			WorkshopReservationRecord result = (WorkshopReservationRecord) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WorkshopReservationRecord instance) {
		log.debug("attaching dirty WorkshopReservationRecord instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WorkshopReservationRecord instance) {
		log.debug("attaching clean WorkshopReservationRecord instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WorkshopReservationRecordDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (WorkshopReservationRecordDAO) ctx
				.getBean("WorkshopReservationRecordDAO");
	}
}