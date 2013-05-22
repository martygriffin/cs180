package edu.ucr.c3.wms.business.admin;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.MailSender;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.dao.hibernate.CollegeDAO;
import edu.ucr.c3.wms.dao.hibernate.DepartmentDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassLogDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationRecordDAO;
import edu.ucr.c3.wms.dao.hibernate.ManagerDAO;
import edu.ucr.c3.wms.dao.hibernate.ReservationStatusDAO;
import edu.ucr.c3.wms.dao.hibernate.SectionDAO;
import edu.ucr.c3.wms.dao.hibernate.SessionDAO;
import edu.ucr.c3.wms.dao.hibernate.StudentDAO;
import edu.ucr.c3.wms.dao.hibernate.UniversityDAO;
import edu.ucr.c3.wms.dao.hibernate.WeeklyScheduleDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopLogDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationRecordDAO;
import edu.ucr.c3.wms.domain.College;
import edu.ucr.c3.wms.domain.Department;
import edu.ucr.c3.wms.domain.Labclass;
import edu.ucr.c3.wms.domain.LabclassLog;
import edu.ucr.c3.wms.domain.LabclassReservation;
import edu.ucr.c3.wms.domain.LabclassReservationRecord;
import edu.ucr.c3.wms.domain.Manager;
import edu.ucr.c3.wms.domain.Section;
import edu.ucr.c3.wms.domain.Session;
import edu.ucr.c3.wms.domain.Student;
import edu.ucr.c3.wms.domain.University;
import edu.ucr.c3.wms.domain.WeeklySchedule;
import edu.ucr.c3.wms.domain.Workshop;
import edu.ucr.c3.wms.domain.WorkshopLog;
import edu.ucr.c3.wms.domain.WorkshopReservation;
import edu.ucr.c3.wms.domain.WorkshopReservationRecord;

public interface InactivationService {
	
	//explanation of userType:
	//This is used so that the appropriate ReservationStatus can be used
	//to describe why/by whom a reservation was canceled.
	//It is hardcoded an admin delete when the cancellation method
	//is a chain reaction from deleting a university or manager (which only
	//admins can do). Otherwise, the caller has to specify whether it is a
	//student or manager deletion.
	//Codes (These correspond to ReservationStatus table records):
	//1: student-caused
	//2: manager-caused
	//3: admin-caused
	
	public void deleteUniversity(University univ) throws SBRException;    
	public void deleteCollege(College col) throws SBRException;	
	public void deleteDepartment(Department dept) throws SBRException;	
	public void deleteManager(Manager man) throws SBRException;	
	public void deleteLabclass(Labclass workshop, short userType) throws SBRException;
	public void deleteSection(Section sess, short userType) throws SBRException;
	public void deleteLabclassReservation(LabclassReservation res, short userType) throws SBRException;
	public void deleteWorkshop(Workshop workshop, short userType) throws SBRException;
	public void deleteSession(Session sess, short userType) throws SBRException;
	public void deleteWorkshopReservation(WorkshopReservation res, short userType) throws SBRException;

	//Setters for DAO objects
    public void setUniversityDAO(UniversityDAO dao);
    public void setCollegeDAO(CollegeDAO dao);
    public void setDepartmentDAO(DepartmentDAO dao);
    public void setManagerDAO(ManagerDAO dao);
    public void setLabclassDAO(LabclassDAO dao);
	public void setLabclassLogDAO(LabclassLogDAO dao);
	public void setLabclassReservationDAO(LabclassReservationDAO dao);
	public void setLabclassReservationRecordDAO(LabclassReservationRecordDAO dao);
	public void setSectionDAO(SectionDAO dao);
	public void setWorkshopDAO(WorkshopDAO dao);
	public void setWorkshopLogDAO(WorkshopLogDAO dao);
	public void setWorkshopReservationDAO(WorkshopReservationDAO dao);
	public void setWorkshopReservationRecordDAO(WorkshopReservationRecordDAO dao);
	public void setSessionDAO(SessionDAO dao);
	public void setReservationStatusDAO(ReservationStatusDAO dao);
	
	public void sendCancelEmail(LabclassReservation res) throws SBRException;
	public void setVelocityEngine(VelocityEngine velocity);
    public void setMailSender(MailSender sender);
}
