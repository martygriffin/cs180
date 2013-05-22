package edu.ucr.c3.wms.business.admin.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.SBRService;
import edu.ucr.c3.wms.business.admin.AdminLevelService;
import edu.ucr.c3.wms.dao.hibernate.CollegeDAO;
import edu.ucr.c3.wms.dao.hibernate.DepartmentDAO;
import edu.ucr.c3.wms.dao.hibernate.SystemSettingDAO;
import edu.ucr.c3.wms.dao.hibernate.UniversityDAO;
import edu.ucr.c3.wms.domain.College;
import edu.ucr.c3.wms.domain.Department;
import edu.ucr.c3.wms.domain.SystemSetting;
import edu.ucr.c3.wms.domain.University;

public class AdminLevelServiceImp extends SBRService implements
		AdminLevelService {

	private UniversityDAO UniversityDAO;
	private CollegeDAO CollegeDAO;
	private DepartmentDAO DepartmentDAO;
	private SystemSettingDAO SystemSettingDAO;

	//university methods
	public University retrieveUniversity(int id) throws SBRException {
		University univ = UniversityDAO.findById(id);
		if(univ != null && univ.getActive()==1) 
			return UniversityDAO.findById(id);
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<University> retrieveAllUniversities() throws SBRException {
		return UniversityDAO.findByActive((short)1);
	}
	public void saveUniversity(University univ) throws SBRException {
		UniversityDAO.save(univ);
	}
	
	//college methods
	public College retrieveCollege(int id) throws SBRException {
		College coll = CollegeDAO.findById(id);
		if(coll!=null && coll.getActive()==1) 
			return CollegeDAO.findById(id);
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<College> retrieveAllColleges() throws SBRException {
		return CollegeDAO.findByActive((short)1);
	}
	public void saveCollege(College col) throws SBRException {
		CollegeDAO.save(col);
	}
	@SuppressWarnings("unchecked")
	public List<College> retrieveCollegesByUniversity(int id) throws SBRException {
		Set colSet = UniversityDAO.findById(id).getColleges();
		List colList = new ArrayList();
		for(Object c: colSet){
			if(((College)c).getActive()==1)
				colList.add(c);
		}
		return colList;
	}
	
	//department methods
	public Department retrieveDepartment(int id) throws SBRException {
		Department dept = DepartmentDAO.findById(id);
		if(dept != null && dept.getActive()==1)
			return DepartmentDAO.findById(id);
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<Department> retrieveAllDepartments() throws SBRException {
		return DepartmentDAO.findByActive((short)1);
	}
	public void saveDepartment(Department dept) throws SBRException {
		DepartmentDAO.save(dept);
	}
	@SuppressWarnings("unchecked")
	public List<Department> retrieveDepartmentsByCollege(int id) throws SBRException {
		Set deptSet = CollegeDAO.findById(id).getDepartments();
		List deptList = new ArrayList();
		for(Object d: deptSet){
			if(((Department)d).getActive()==1)
				deptList.add(d);
		}
		return deptList;
	}
	
	//system setting methods
	public SystemSetting retrieveSystemSetting(int id) throws SBRException {
		return SystemSettingDAO.findById(id);
	}
	public SystemSetting retrieveSystemSettingByName(String name) throws SBRException{
		return (SystemSetting)SystemSettingDAO.findBySettingName(name).get(0);
	}
	@SuppressWarnings("unchecked")
	public List<SystemSetting> retrieveAllSystemSettings() throws SBRException {
		return SystemSettingDAO.findAll();
	}
	public void deleteSystemSetting(SystemSetting setting) throws SBRException {
		SystemSettingDAO.delete(setting);
	}
	public void saveSystemSetting(SystemSetting setting) throws SBRException {
		SystemSettingDAO.save(setting);
	}
	
	//DAO setters
	public void setUniversityDAO(UniversityDAO dao) {
		UniversityDAO = dao;
	}
	public void setCollegeDAO(CollegeDAO dao) {
		CollegeDAO = dao;
	}
	public void setDepartmentDAO(DepartmentDAO dao) {
		DepartmentDAO = dao;
	}
	public void setSystemSettingDAO(SystemSettingDAO dao) {
		SystemSettingDAO = dao;
	}
}
