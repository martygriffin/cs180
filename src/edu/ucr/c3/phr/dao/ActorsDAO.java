package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Actors;

/**
 * A data access object (DAO) providing persistence and search support for
 * Actors entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Actors
 * @author MyEclipse Persistence Tools
 */

public class ActorsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ActorsDAO.class);
	// property constants
	public static final String MAIN_ID = "mainId";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String EMAIL = "email";
	public static final String WEIGHT = "weight";
	public static final String HEIGHT = "height";
	public static final String GENDER = "gender";
	public static final String RACE = "race";
	public static final String BLOOD_TYPE = "bloodType";
	public static final String TITLE = "title";
	public static final String IS_PREGNANT = "isPregnant";
	public static final String TELEPHONE = "telephone";
	public static final String ADDRESS = "address";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Actors transientInstance) {
		log.debug("saving Actors instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Actors persistentInstance) {
		log.debug("deleting Actors instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Actors findById(java.lang.Integer id) {
		log.debug("getting Actors instance with id: " + id);
		try {
			Actors instance = (Actors) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Actors", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Actors instance) {
		log.debug("finding Actors instance by example");
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
		log.debug("finding Actors instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Actors as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMainId(Object mainId) {
		return findByProperty(MAIN_ID, mainId);
	}

	public List findByFirstName(Object firstName) {
		return findByProperty(FIRST_NAME, firstName);
	}

	public List findByLastName(Object lastName) {
		return findByProperty(LAST_NAME, lastName);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByWeight(Object weight) {
		return findByProperty(WEIGHT, weight);
	}

	public List findByHeight(Object height) {
		return findByProperty(HEIGHT, height);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByRace(Object race) {
		return findByProperty(RACE, race);
	}

	public List findByBloodType(Object bloodType) {
		return findByProperty(BLOOD_TYPE, bloodType);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByIsPregnant(Object isPregnant) {
		return findByProperty(IS_PREGNANT, isPregnant);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Actors instances");
		try {
			String queryString = "from Actors";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Actors merge(Actors detachedInstance) {
		log.debug("merging Actors instance");
		try {
			Actors result = (Actors) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Actors instance) {
		log.debug("attaching dirty Actors instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Actors instance) {
		log.debug("attaching clean Actors instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ActorsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ActorsDAO) ctx.getBean("ActorsDAO");
	}
}