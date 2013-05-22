package edu.ucr.c3.wms.business.admin;

import java.util.List;
import java.util.Set;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.dao.hibernate.CollegeDAO;
import edu.ucr.c3.wms.dao.hibernate.DepartmentDAO;
import edu.ucr.c3.wms.dao.hibernate.SystemSettingDAO;
import edu.ucr.c3.wms.dao.hibernate.UniversityDAO;
import edu.ucr.c3.wms.domain.College;
import edu.ucr.c3.wms.domain.Department;
import edu.ucr.c3.wms.domain.SystemSetting;
import edu.ucr.c3.wms.domain.University;

public interface AdminLevelService {
	
	public void saveUniversity(University univ) throws SBRException;
	public University retrieveUniversity(int id) throws SBRException;
	public List<University> retrieveAllUniversities() throws SBRException;
    
	public void saveCollege(College col) throws SBRException;
	public College retrieveCollege(int id) throws SBRException;	
	public List<College> retrieveAllColleges() throws SBRException;	
	public List<College> retrieveCollegesByUniversity(int id) throws SBRException;

	public void saveDepartment(Department dept) throws SBRException;	
	public Department retrieveDepartment(int id) throws SBRException;	
	public List<Department> retrieveAllDepartments() throws SBRException;
	public List<Department> retrieveDepartmentsByCollege(int id) throws SBRException;

	public void saveSystemSetting(SystemSetting setting) throws SBRException;	
	public void deleteSystemSetting(SystemSetting setting) throws SBRException;	
	public SystemSetting retrieveSystemSetting(int id) throws SBRException;
	public SystemSetting retrieveSystemSettingByName(String name) throws SBRException;
	public List<SystemSetting> retrieveAllSystemSettings() throws SBRException;

	//Setters for DAO objects
    public void setUniversityDAO(UniversityDAO dao);
    public void setCollegeDAO(CollegeDAO dao);
    public void setDepartmentDAO(DepartmentDAO dao);
    public void setSystemSettingDAO(SystemSettingDAO dao);
	
}
