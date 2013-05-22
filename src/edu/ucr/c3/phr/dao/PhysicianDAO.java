package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Physician;

/**
 * A data access object (DAO) providing persistence and search support for
 * Physician entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Physician
 * @author MyEclipse Persistence Tools
 */

public class PhysicianDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(PhysicianDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PHONE = "phone";
	public static final String OFFICE_ADDRESS = "officeAddress";
	public static final String EMAIL = "email";
	public static final String PRIMARY_SPECIALTY = "primarySpecialty";
	public static final String SECONDARY_SPECIALTY = "secondarySpecialty";
	public static final String CLINIC_NAME = "clinicName";
	public static final String IS_PRIMARY = "isPrimary";
	public static final String FAX = "fax";
	public static final String NOTES_ID = "notesId";
	public static final String HOSPITAL_ID = "hospitalId";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Physician transientInstance) {
		log.debug("saving Physician instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Physician persistentInstance) {
		log.debug("deleting Physician instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Physician findById(java.lang.Integer id) {
		log.debug("getting Physician instance with id: " + id);
		try {
			Physician instance = (Physician) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Physician", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Physician instance) {
		log.debug("finding Physician instance by example");
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
		log.debug("finding Physician instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Physician as model where model."
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

	public List findByFirstName(Object firstName) {
		return findByProperty(FIRST_NAME, firstName);
	}

	public List findByLastName(Object lastName) {
		return findByProperty(LAST_NAME, lastName);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByOfficeAddress(Object officeAddress) {
		return findByProperty(OFFICE_ADDRESS, officeAddress);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByPrimarySpecialty(Object primarySpecialty) {
		return findByProperty(PRIMARY_SPECIALTY, primarySpecialty);
	}

	public List findBySecondarySpecialty(Object secondarySpecialty) {
		return findByProperty(SECONDARY_SPECIALTY, secondarySpecialty);
	}

	public List findByClinicName(Object clinicName) {
		return findByProperty(CLINIC_NAME, clinicName);
	}

	public List findByIsPrimary(Object isPrimary) {
		return findByProperty(IS_PRIMARY, isPrimary);
	}

	public List findByFax(Object fax) {
		return findByProperty(FAX, fax);
	}

	public List findByNotesId(Object notesId) {
		return findByProperty(NOTES_ID, notesId);
	}

	public List findByHospitalId(Object hospitalId) {
		return findByProperty(HOSPITAL_ID, hospitalId);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Physician instances");
		try {
			String queryString = "from Physician";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Physician merge(Physician detachedInstance) {
		log.debug("merging Physician instance");
		try {
			Physician result = (Physician) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Physician instance) {
		log.debug("attaching dirty Physician instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Physician instance) {
		log.debug("attaching clean Physician instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PhysicianDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PhysicianDAO) ctx.getBean("PhysicianDAO");
	}
}