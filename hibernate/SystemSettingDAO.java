package edu.ucr.c3.wms.dao.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.wms.domain.SystemSetting;

/**
 * A data access object (DAO) providing persistence and search support for
 * SystemSetting entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.hibernate.SystemSetting
 * @author MyEclipse Persistence Tools
 */

public class SystemSettingDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(SystemSettingDAO.class);
	// property constants
	public static final String SETTING_NAME = "settingName";
	public static final String SETTING_TYPE = "settingType";
	public static final String SETTING_VALUE = "settingValue";
	public static final String COMMENTS = "comments";

	protected void initDao() {
		// do nothing
	}

	public void save(SystemSetting transientInstance) {
		log.debug("saving SystemSetting instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SystemSetting persistentInstance) {
		log.debug("deleting SystemSetting instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SystemSetting findById(java.lang.Integer id) {
		log.debug("getting SystemSetting instance with id: " + id);
		try {
			SystemSetting instance = (SystemSetting) getHibernateTemplate()
					.get("edu.ucr.c3.wms.domain.SystemSetting", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SystemSetting instance) {
		log.debug("finding SystemSetting instance by example");
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
		log.debug("finding SystemSetting instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from SystemSetting as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySettingName(Object settingName) {
		return findByProperty(SETTING_NAME, settingName);
	}

	public List findBySettingType(Object settingType) {
		return findByProperty(SETTING_TYPE, settingType);
	}

	public List findBySettingValue(Object settingValue) {
		return findByProperty(SETTING_VALUE, settingValue);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findAll() {
		log.debug("finding all SystemSetting instances");
		try {
			String queryString = "from SystemSetting";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SystemSetting merge(SystemSetting detachedInstance) {
		log.debug("merging SystemSetting instance");
		try {
			SystemSetting result = (SystemSetting) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SystemSetting instance) {
		log.debug("attaching dirty SystemSetting instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SystemSetting instance) {
		log.debug("attaching clean SystemSetting instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SystemSettingDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (SystemSettingDAO) ctx.getBean("SystemSettingDAO");
	}
}