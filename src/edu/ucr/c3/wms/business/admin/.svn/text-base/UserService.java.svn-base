package edu.ucr.c3.wms.business.admin;

import java.util.List;

import edu.ucr.c3.phr.domain.Login;
import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.dao.hibernate.AdminDAO;
import edu.ucr.c3.wms.dao.hibernate.ManagerDAO;
import edu.ucr.c3.wms.dao.hibernate.StudentDAO;
import edu.ucr.c3.wms.domain.Admin;
import edu.ucr.c3.wms.domain.Manager;
import edu.ucr.c3.wms.domain.Student;


public interface UserService {
	//Admin
	public List<Admin> retrieveAllAdmins() throws SBRException;
	public Admin retrieveAdminByUsername(String username) throws SBRException;
	
	//Manager
	public void saveManager(Manager man) throws SBRException;
	public Manager retrieveManager(int id) throws SBRException;
	public List<Manager> retrieveAllManagers() throws SBRException;
	public Manager retrieveManagerByUsername(String username) throws SBRException;
	public Manager retrieveManagerByUsernameRaw(String username) throws SBRException;
	
	//Student
	public void saveStudent(Student stud) throws SBRException;
	public Student retrieveStudent(int id) throws SBRException;
	public List<Student> retrieveAllStudents() throws SBRException;
	public Student retrieveStudentBySID(String id) throws SBRException;
	public Student retrieveStudentByNetID(String id) throws SBRException;
	
	public void setAdminDAO(AdminDAO dao);
	public void setManagerDAO(ManagerDAO dao);
	public void setStudentDAO(StudentDAO dao);
	//login User
	public List<Login>retrieveAllUsers()throws SBRException;
	public List<Login>retrieveAllActiveUsers()throws SBRException;
	public Login retrieveUserByLogin(String username, String password)throws SBRException;
	public Login retrieveUserByID(int id)throws SBRException;
	public Login retrieveUserByUsername(String username)throws SBRException;
	public Login retrieveUserByEmail(String email)throws SBRException;
	public void saveUser(Login user) throws SBRException;
	//actors
	public List<Actors>retrieveAllActors()throws SBRException;
	public List<Actors> retrieveAllActiveActors() throws SBRException;
	public Actors retrieveActorByID(int id)throws SBRException;
	public void saveActor(Actors actor)throws SBRException;
	public List<Actors> retreiveActorsByMainID(int id);
}
