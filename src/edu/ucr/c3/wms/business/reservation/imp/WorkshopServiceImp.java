package edu.ucr.c3.wms.business.reservation.imp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.ui.velocity.VelocityEngineUtils;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.SBRService;
import edu.ucr.c3.wms.business.reservation.WorkshopService;
import edu.ucr.c3.wms.business.utils.SBRUtils;
import edu.ucr.c3.wms.dao.hibernate.SessionDAO;
import edu.ucr.c3.wms.dao.hibernate.StudentDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopLogDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.WorkshopReservationRecordDAO;
import edu.ucr.c3.wms.domain.Department;
import edu.ucr.c3.wms.domain.LabclassReservation;
import edu.ucr.c3.wms.domain.Session;
import edu.ucr.c3.wms.domain.Workshop;
import edu.ucr.c3.wms.domain.WorkshopLog;
import edu.ucr.c3.wms.domain.WorkshopReservation;
import edu.ucr.c3.wms.domain.WorkshopReservationRecord;

public class WorkshopServiceImp extends SBRService implements WorkshopService {

	WorkshopDAO WorkshopDAO;
	WorkshopLogDAO WorkshopLogDAO;
	SessionDAO SessionDAO;
	WorkshopReservationDAO WorkshopReservationDAO;
	WorkshopReservationRecordDAO WorkshopReservationRecordDAO;
	StudentDAO StudentDAO;
	private VelocityEngine velocityEngine;
	private MailSender mailSender;
	
	//Workshop methods
	@SuppressWarnings("unchecked")
	public List<Workshop> retrieveAllWorkshops() throws SBRException {
		return WorkshopDAO.findByActive((short)1);
	}
	
	public Workshop retrieveWorkshop(int id) throws SBRException {
		Workshop ws = WorkshopDAO.findById(id);
		if(ws != null && ws.getActive()==1)
			return ws;
		else
			return null;
	}
	public void saveWorkshop(Workshop workshop) throws SBRException {
		WorkshopDAO.save(workshop);
	}
	
	//WorkshopLog methods
	public void saveWorkshopLog(WorkshopLog log) throws SBRException {
		WorkshopLogDAO.save(log);
	}
	
	//Session methods
	@SuppressWarnings("unchecked")
	public List<Session> retrieveAllSessions() throws SBRException {
		return SessionDAO.findByActive((short)1);
	}
	public Session retrieveSession(int id) throws SBRException {
		Session sess = SessionDAO.findById(id);
		if(sess != null && sess.getActive()==1)
			return sess;
		else
			return null;
	}
	public void saveSession(Session sess) throws SBRException {
		SessionDAO.save(sess);
	}
	@SuppressWarnings("unchecked")
	public List<Session> retrieveSessionsByWorkshop(int id) throws SBRException {
		Set sSet = WorkshopDAO.findById(id).getSessions();
		List sList = new ArrayList();
		for(Object s: sSet){
			if(((Session)s).getActive()==1)
				sList.add(s);
		}
		return sList;
	}
	//WorkshopReservation methods
	@SuppressWarnings("unchecked")
	public List<WorkshopReservation> retrieveAllWorkshopReservations()
			throws SBRException {
		return WorkshopReservationDAO.findByProperty("reservationStatus.id", 0);
	}
	public List<WorkshopReservation> retrieveAllWorkshopReservations_active_inactive()
	throws SBRException {
		return WorkshopReservationDAO.findAll();
}
	public WorkshopReservation retrieveWorkshopReservation(int id)
			throws SBRException {
		WorkshopReservation res = WorkshopReservationDAO.findById(id);
		if(res != null && res.getReservationStatus().getId()==0)
			return res;
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<WorkshopReservation> retrieveWorkshopReservationsBySession(
			int id) throws SBRException {
		Set rSet = SessionDAO.findById(id).getWorkshopReservations();
		List rList = new ArrayList();
		for(Object r: rSet){
			if(((WorkshopReservation)r).getReservationStatus().getId()==0)
				rList.add(r);
		}
		return rList;
	}
	@SuppressWarnings("unchecked")
	public List<WorkshopReservation> retrieveWorkshopReservationsByStudent(
			int id) throws SBRException {
		Set rSet = StudentDAO.findById(id).getWorkshopReservations();
		List rList = new ArrayList();
		for(Object r: rSet){
			if(((WorkshopReservation)r).getReservationStatus().getId()==0)
				rList.add(r);
		}
		return rList;
	}
	@SuppressWarnings("unchecked")
	public List<WorkshopReservation> retrieveWorkshopReservationsByConfirmationNumber(String conf) throws SBRException{
		return WorkshopReservationDAO.findByConfirmationNumber(conf);
	}
	public void saveWorkshopReservation(WorkshopReservation res)
			throws SBRException {
		WorkshopReservationDAO.save(res);
	}
	
	//WorkshopReservationRecord methods
	public void saveWorkshopReservationRecord(WorkshopReservationRecord rec)
			throws SBRException {
		WorkshopReservationRecordDAO.save(rec);
	}
	
	//DAO setters
	public void setWorkshopDAO(WorkshopDAO dao) {
		this.WorkshopDAO = dao;
	}
	public void setWorkshopReservationDAO(WorkshopReservationDAO dao) {
		this.WorkshopReservationDAO = dao;
	}
	public void setSessionDAO(SessionDAO dao) {
		this.SessionDAO = dao;
	}
	public void setWorkshopLogDAO(WorkshopLogDAO dao) {
		this.WorkshopLogDAO = dao;
	}
	public void setWorkshopReservationRecordDAO(WorkshopReservationRecordDAO dao) {
		this.WorkshopReservationRecordDAO = dao;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		StudentDAO = studentDAO;
	}
	
	//emailing
	private void sendMsg(String subject, String msgString, String toMail, String fromMail, String[] ccMail) throws SBRException {
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(toMail);
			if ( ccMail != null) {
				msg.setCc(ccMail);
			}
			msg.setSubject(subject);
			msg.setFrom("NoReply@wms.ucr.edu");
			msg.setSentDate(Calendar.getInstance().getTime());
			msg.setText(new String(msgString));
			mailSender.send(msg);
		} catch (MailException me) {
			logger.error(me);
		}
	}
	
	public void sendChangeEmail(WorkshopReservation res) throws SBRException {
		String msg = "";
		Map<String,String> model = new HashMap<String,String>();
		
		model.put("student", res.getStudent().getFirstName());
		model.put("session", res.getSession().getName());
		model.put("workshop", res.getSession().getName());
		model.put("when", res.getSession().getTime());
		model.put("location", res.getSession().getLocation());
		
		try {
			msg = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, SBRUtils.getMailTemplatePath("workshopResChange.vm"),model);	
					} catch (VelocityException ve) {
			throw new SBRException(ve.getMessage());
		}		
		
		sendMsg("Workshop Reservation Information Changed",msg,res.getStudent().getEmail(),"",null);
	}
	public void sendConfirmationEmail(WorkshopReservation res)
			throws SBRException {
		String msg = "";
		Map<String,String> model = new HashMap<String,String>();
		
		model.put("student", res.getStudent().getFirstName());
		model.put("session", res.getSession().getName());
		model.put("workshop", res.getSession().getName());
		model.put("when", res.getSession().getTime());
		model.put("location", res.getSession().getLocation());
		model.put("conf", res.getConfirmationNumber());
		
		try {
			msg = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, SBRUtils.getMailTemplatePath("workshopResConfirm.vm"),model);	
					} catch (VelocityException ve) {
			throw new SBRException(ve.getMessage());
		}		
		
		sendMsg("Workshop Reservation Added",msg,res.getStudent().getEmail(),"",null);
	}
	
	//email setters
	public void setMailSender(MailSender sender) {
		this.mailSender = sender;
	}
	public void setVelocityEngine(VelocityEngine velocity) {
		this.velocityEngine = velocity;
	}
	
}
