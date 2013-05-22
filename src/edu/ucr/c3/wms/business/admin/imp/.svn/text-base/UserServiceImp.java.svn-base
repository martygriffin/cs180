package edu.ucr.c3.wms.business.admin.imp;

import java.util.ArrayList;
import java.util.List;

import edu.ucr.c3.phr.dao.ActorsDAO;
import edu.ucr.c3.phr.dao.LoginDAO;
import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.phr.domain.Login;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.SBRService;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.dao.hibernate.AdminDAO;
import edu.ucr.c3.wms.dao.hibernate.ManagerDAO;
import edu.ucr.c3.wms.dao.hibernate.StudentDAO;
import edu.ucr.c3.wms.domain.Admin;
import edu.ucr.c3.wms.domain.Manager;
import edu.ucr.c3.wms.domain.Student;


public class UserServiceImp extends SBRService implements UserService {

	private LoginDAO LoginDAO;
	private ActorsDAO ActorsDAO;
	private AdminDAO AdminDAO;
	private StudentDAO StudentDAO;
	private ManagerDAO ManagerDAO;
	@SuppressWarnings("unchecked")
	public List<Login> retrieveAllUsers() throws SBRException {
		return LoginDAO.findAll();
	}

	public List<Login> retrieveAllActiveUsers() throws SBRException {
		List<Login> temp = new ArrayList();
		List<Login> temp2 = LoginDAO.findAll();
		for (Login e : temp2) {
			if (e.getActive() == 1)
				temp.add(e);
		}
		if (temp.size() > 0)
			return temp;
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Login retrieveUserByLogin(String username, String password)
			throws SBRException {
		List<Login> temp = LoginDAO.findByUsername(username);
		Login user = temp.get(0);
		if (user.getPassword().equals(password))
			return user;
		else
			return null;
	}

	public Login retrieveUserByID(int id) throws SBRException {
		return LoginDAO.findById(id);
	}
	
	public Login retrieveUserByUsername(String username)throws SBRException{
		List temp = LoginDAO.findByUsername(username);
		return temp.size() > 0 ? (Login)temp.get(0) : null;		
	}
	public Login retrieveUserByEmail(String email)throws SBRException{
		List temp = LoginDAO.findByEmail(email);	
		return temp.size() > 0 ? (Login)temp.get(0) : null;
	}

	public void saveUser(Login user) throws SBRException {
		LoginDAO.save(user);
	}

	// actors methods
	@SuppressWarnings("unchecked")
	public List<Actors> retrieveAllActors() throws SBRException {
		return ActorsDAO.findAll();
	}
	@SuppressWarnings("unchecked")
	public List<Actors> retrieveAllActiveActors() throws SBRException {
		@SuppressWarnings("rawtypes")
		List<Actors> temp = new ArrayList();
		ActorsDAO.findAll().size();
		if(ActorsDAO.findAll().size()==0)
			System.out.print("error");
		List<Actors> temp2 = ActorsDAO.findAll();
		for (Actors e : temp2) {
			if (e.getActive() == 1)
				temp.add(e);
		}
		if (temp.size() > 0)
			return temp;
		else
			return null;
	}
	public Actors retrieveActorByID(int id)throws SBRException
	{
		return ActorsDAO.findById(id);
	}
	public List<Actors> retreiveActorsByMainID(int id)
	{
		//Remove inactive
		List<Actors> retrieved = ActorsDAO.findByMainId(id);
		for(int i = 0;i<retrieved.size();i++){
			if(retrieved.get(i).getActive() == 0){
				retrieved.remove(i);		
				i--;
			}
		}
		return retrieved;
	}
	public void saveActor(Actors actor)throws SBRException
	{
		ActorsDAO.save(actor);
	}

	 //admin methods
	 @SuppressWarnings("unchecked")
	 public List<Admin> retrieveAllAdmins() throws SBRException {
	 return AdminDAO.findAll();
	 }
	 public Admin retrieveAdminByUsername(String username)
	 throws SBRException {
	 return AdminDAO.findById(username);
	 }
	
	 //manager methods
	 @SuppressWarnings("unchecked")
	 public List<Manager> retrieveAllManagers() throws SBRException {
	 return ManagerDAO.findByActive((short)1);
	 }
	 public Manager retrieveManager(int id) throws SBRException {
	 Manager man = (ManagerDAO.findById(id) != null) ?
	 ManagerDAO.findById(id):null;
	 if(man != null && man.getActive()==1)
	 return man;
	 else
	 return null;
	 }
	 public Manager retrieveManagerByUsername(String username)
	 throws SBRException {
	 if(ManagerDAO.findByUserName(username).size()>0){
	 if(((Manager)ManagerDAO.findByUserName(username).get(0)).getActive()==1)
	 return (Manager)ManagerDAO.findByUserName(username).get(0);
	 else
	 return null;
	 }
	 else
	 return null;
	 }
	
	 public Manager retrieveManagerByUsernameRaw(String username)
	 throws SBRException {
	 if (ManagerDAO.findByUserName(username).size() > 0) {
	 return (Manager) ManagerDAO.findByUserName(username).get(0);
	 } else
	 return null;
	 }
	 public void saveManager(Manager man) throws SBRException {
	 ManagerDAO.save(man);
	 }
	
	 //student methods
	 @SuppressWarnings("unchecked")
	 public List<Student> retrieveAllStudents() throws SBRException {
	 return StudentDAO.findAll();
	 }
	 public Student retrieveStudent(int id) throws SBRException {
	 return StudentDAO.findById(id);
	 }
	 public Student retrieveStudentBySID(String id) throws SBRException {
	 if(StudentDAO.findBySid(id).size()>0)
	 return (Student)StudentDAO.findBySid(id).get(0);
	 else
	 return null;
	 }
	 public Student retrieveStudentByNetID(String id) throws SBRException {
	 if(StudentDAO.findByNetid(id).size()>0)
	 return (Student)StudentDAO.findByNetid(id).get(0);
	 else
	 return null;
	 }
	 public void saveStudent(Student stud) throws SBRException {
	 StudentDAO.save(stud);
	 }
	
	 //DAO setters
	 public void setAdminDAO(AdminDAO dao) {
	 this.AdminDAO = dao;
	 }
	 public void setManagerDAO(ManagerDAO dao) {
	 this.ManagerDAO = dao;
	 }
	 public void setStudentDAO(StudentDAO dao) {
	 this.StudentDAO = dao;
	 }
	// DAO Setters
	public void setLoginDAO(LoginDAO loginDAO) {
		LoginDAO = loginDAO;
	}

	public LoginDAO getLoginDAO() {
		return LoginDAO;
	}

	public ActorsDAO getActorsDAO() {
		return ActorsDAO;
	}

	public void setActorsDAO(ActorsDAO actorsDAO) {
		ActorsDAO = actorsDAO;
	}
}
