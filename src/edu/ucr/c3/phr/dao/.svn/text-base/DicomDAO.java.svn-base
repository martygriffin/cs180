package edu.ucr.c3.phr.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ucr.c3.phr.domain.Dicom;

/**
 * A data access object (DAO) providing persistence and search support for Dicom
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see edu.ucr.c3.wms.dao.Dicom
 * @author MyEclipse Persistence Tools
 */

public class DicomDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DicomDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String FILE_LOCATION = "fileLocation";
	public static final String HOSPITAL_ID = "hospitalId";
	public static final String NOTES_ID = "notesId";
	public static final String NAME = "name";
	public static final String SIZE = "size";
	public static final String MANUFACTURER = "manufacturer";
	public static final String MODALITY_ID = "modalityId";
	public static final String BODY_PART_EXAMINED = "bodyPartExamined";
	public static final String PLATE_TYPE = "plateType";
	public static final String PHOSPHOR_TYPE = "phosphorType";
	public static final String IS_CURRENT = "isCurrent";
	public static final String ACTIVE = "active";

	protected void initDao() {
		// do nothing
	}

	public void save(Dicom transientInstance) {
		log.debug("saving Dicom instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dicom persistentInstance) {
		log.debug("deleting Dicom instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dicom findById(java.lang.Integer id) {
		log.debug("getting Dicom instance with id: " + id);
		try {
			Dicom instance = (Dicom) getHibernateTemplate().get(
					"edu.ucr.c3.phr.domain.Dicom", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dicom instance) {
		log.debug("finding Dicom instance by example");
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
		log.debug("finding Dicom instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dicom as model where model."
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

	public List findByFileLocation(Object fileLocation) {
		return findByProperty(FILE_LOCATION, fileLocation);
	}

	public List findByHospitalId(Object hospitalId) {
		return findByProperty(HOSPITAL_ID, hospitalId);
	}

	public List findByNotesId(Object notesId) {
		return findByProperty(NOTES_ID, notesId);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findBySize(Object size) {
		return findByProperty(SIZE, size);
	}

	public List findByManufacturer(Object manufacturer) {
		return findByProperty(MANUFACTURER, manufacturer);
	}

	public List findByModalityId(Object modalityId) {
		return findByProperty(MODALITY_ID, modalityId);
	}

	public List findByBodyPartExamined(Object bodyPartExamined) {
		return findByProperty(BODY_PART_EXAMINED, bodyPartExamined);
	}

	public List findByPlateType(Object plateType) {
		return findByProperty(PLATE_TYPE, plateType);
	}

	public List findByPhosphorType(Object phosphorType) {
		return findByProperty(PHOSPHOR_TYPE, phosphorType);
	}

	public List findByIsCurrent(Object isCurrent) {
		return findByProperty(IS_CURRENT, isCurrent);
	}

	public List findByActive(Object active) {
		return findByProperty(ACTIVE, active);
	}

	public List findAll() {
		log.debug("finding all Dicom instances");
		try {
			String queryString = "from Dicom";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dicom merge(Dicom detachedInstance) {
		log.debug("merging Dicom instance");
		try {
			Dicom result = (Dicom) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dicom instance) {
		log.debug("attaching dirty Dicom instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dicom instance) {
		log.debug("attaching clean Dicom instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DicomDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DicomDAO) ctx.getBean("DicomDAO");
	}
}