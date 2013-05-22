package edu.ucr.c3.wms.business.reservation;

import java.util.List;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.MailSender;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.dao.hibernate.SessionDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationRecordDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopLogDAO;
import edu.ucr.c3.wms.domain.Session;
import edu.ucr.c3.wms.domain.Workshop;
import edu.ucr.c3.wms.domain.WorkshopLog;
import edu.ucr.c3.wms.domain.WorkshopReservation;
import edu.ucr.c3.wms.domain.WorkshopReservationRecord;

public interface WorkshopService {

	public void saveWorkshop(Workshop workshop) throws SBRException;
	public Workshop retrieveWorkshop(int id) throws SBRException;
	public List<Workshop> retrieveAllWorkshops() throws SBRException;
    
	public void saveSession(Session sess) throws SBRException;
	public Session retrieveSession(int id) throws SBRException;
	public List<Session> retrieveAllSessions() throws SBRException;
	public List<Session> retrieveSessionsByWorkshop(int id) throws SBRException;
	
	public void saveWorkshopLog(WorkshopLog log) throws SBRException;
	
	public void saveWorkshopReservation(WorkshopReservation res) throws SBRException;
	public WorkshopReservation retrieveWorkshopReservation(int id) throws SBRException;
	public List<WorkshopReservation> retrieveAllWorkshopReservations() throws SBRException;
	public List<WorkshopReservation> retrieveAllWorkshopReservations_active_inactive()throws SBRException;
	public List<WorkshopReservation> retrieveWorkshopReservationsBySession(int id) throws SBRException;
	public List<WorkshopReservation> retrieveWorkshopReservationsByStudent(int id) throws SBRException;
	public List<WorkshopReservation> retrieveWorkshopReservationsByConfirmationNumber(String conf) throws SBRException;
	
	public void saveWorkshopReservationRecord(WorkshopReservationRecord rec) throws SBRException;
	
	public void setWorkshopDAO(WorkshopDAO dao);
	public void setWorkshopLogDAO(WorkshopLogDAO dao);
	public void setWorkshopReservationDAO(WorkshopReservationDAO dao);
	public void setWorkshopReservationRecordDAO(WorkshopReservationRecordDAO dao);
	public void setSessionDAO(SessionDAO dao);
	
	public void sendConfirmationEmail(WorkshopReservation res) throws SBRException;
	public void sendChangeEmail(WorkshopReservation res) throws SBRException;
	
	public void setVelocityEngine(VelocityEngine velocity);
    public void setMailSender(MailSender sender);
	
}
