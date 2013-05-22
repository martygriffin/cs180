package edu.ucr.c3.wms.dao.hibernate;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.WeeklySchedule;

/**
 * A data access object (DAO) providing persistence and search support for
 * WeeklySchedule entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.WeeklySchedule
 * @author MyEclipse Persistence Tools
 */

public class WeeklyScheduleDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(WeeklyScheduleDAO.class);
	// property constants
	public static final String WEEKLYDAY = "weeklyday";
	public static final String TIME_DURATION = "timeDuration";
	public static final String COMMENTS = "comments";

	protected void initDao() {
		// do nothing
	}

	public void save(WeeklySchedule transientInstance) {
		log.debug("saving WeeklySchedule instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WeeklySchedule persistentInstance) {
		log.debug("deleting WeeklySchedule instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WeeklySchedule findById(java.lang.Integer id) {
		log.debug("getting WeeklySchedule instance with id: " + id);
		try {
			WeeklySchedule instance = (WeeklySchedule) getHibernateTemplate()
					.get("edu.ucr.c3.wms.domain.WeeklySchedule", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WeeklySchedule instance) {
		log.debug("finding WeeklySchedule instance by example");
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
		log.debug("finding WeeklySchedule instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from WeeklySchedule as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWeeklyday(Object weeklyday) {
		return findByProperty(WEEKLYDAY, weeklyday);
	}

	public List findByTimeDuration(Object timeDuration) {
		return findByProperty(TIME_DURATION, timeDuration);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all WeeklySchedule instances");
		try {
			String queryString = "from WeeklySchedule";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WeeklySchedule merge(WeeklySchedule detachedInstance) {
		log.debug("merging WeeklySchedule instance");
		try {
			WeeklySchedule result = (WeeklySchedule) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WeeklySchedule instance) {
		log.debug("attaching dirty WeeklySchedule instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WeeklySchedule instance) {
		log.debug("attaching clean WeeklySchedule instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WeeklyScheduleDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (WeeklyScheduleDAO) ctx.getBean("WeeklyScheduleDAO");
	}
}