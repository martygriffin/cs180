package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.LabclassReservationRecord;

/**
 * A data access object (DAO) providing persistence and search support for
 * LabclassReservationRecord entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.LabclassReservationRecord
 * @author MyEclipse Persistence Tools
 */

public class LabclassReservationRecordDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(LabclassReservationRecordDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(LabclassReservationRecord transientInstance) {
		log.debug("saving LabclassReservationRecord instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LabclassReservationRecord persistentInstance) {
		log.debug("deleting LabclassReservationRecord instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LabclassReservationRecord findById(java.lang.Integer id) {
		log.debug("getting LabclassReservationRecord instance with id: " + id);
		try {
			LabclassReservationRecord instance = (LabclassReservationRecord) getHibernateTemplate()
					.get(
							"edu.ucr.c3.wms.domain.LabclassReservationRecord",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LabclassReservationRecord instance) {
		log.debug("finding LabclassReservationRecord instance by example");
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
		log.debug("finding LabclassReservationRecord instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from LabclassReservationRecord as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LabclassReservationRecord instances");
		try {
			String queryString = "from LabclassReservationRecord";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LabclassReservationRecord merge(
			LabclassReservationRecord detachedInstance) {
		log.debug("merging LabclassReservationRecord instance");
		try {
			LabclassReservationRecord result = (LabclassReservationRecord) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LabclassReservationRecord instance) {
		log.debug("attaching dirty LabclassReservationRecord instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LabclassReservationRecord instance) {
		log.debug("attaching clean LabclassReservationRecord instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LabclassReservationRecordDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (LabclassReservationRecordDAO) ctx
				.getBean("LabclassReservationRecordDAO");
	}
}