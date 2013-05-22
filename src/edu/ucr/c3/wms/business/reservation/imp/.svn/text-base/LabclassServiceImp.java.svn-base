package edu.ucr.c3.wms.business.reservation.imp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
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
import edu.ucr.c3.wms.business.reservation.LabclassService;
import edu.ucr.c3.wms.business.utils.SBRUtils;
import edu.ucr.c3.wms.dao.hibernate.SectionDAO;
import edu.ucr.c3.wms.dao.hibernate.StudentDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassLogDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationRecordDAO;
import edu.ucr.c3.wms.dao.hibernate.WeeklyScheduleDAO;
import edu.ucr.c3.wms.domain.Department;
import edu.ucr.c3.wms.domain.Section;
import edu.ucr.c3.wms.domain.Labclass;
import edu.ucr.c3.wms.domain.LabclassLog;
import edu.ucr.c3.wms.domain.LabclassReservation;
import edu.ucr.c3.wms.domain.LabclassReservationRecord;
import edu.ucr.c3.wms.domain.WeeklySchedule;
import edu.ucr.c3.wms.domain.WorkshopReservation;

public class LabclassServiceImp extends SBRService implements LabclassService {

	LabclassDAO LabclassDAO;
	LabclassLogDAO LabclassLogDAO;
	SectionDAO SectionDAO;
	LabclassReservationDAO LabclassReservationDAO;
	LabclassReservationRecordDAO LabclassReservationRecordDAO;
	StudentDAO StudentDAO;
	WeeklyScheduleDAO WeeklyScheduleDAO;
	private VelocityEngine velocityEngine;
	private MailSender mailSender;
	
	//Labclass methods
	public void deleteLabclass(Labclass workshop) throws SBRException {
		LabclassDAO.delete(workshop);
	}
	@SuppressWarnings("unchecked")
	public List<Labclass> retrieveAllLabclasss() throws SBRException {
		return LabclassDAO.findByActive((short)1);
	}
	public Labclass retrieveLabclass(int id) throws SBRException {
		Labclass lc = LabclassDAO.findById(id);
		if(lc != null && lc.getActive()==1)
			return lc;
		else
			return null;
	}
	public void saveLabclass(Labclass workshop) throws SBRException {
		LabclassDAO.save(workshop);
	}
	
	//LabclassLog methods
	public void saveLabclassLog(LabclassLog log) throws SBRException {
		LabclassLogDAO.save(log);
	}
	
	//Section methods
	@SuppressWarnings("unchecked")
	public List<Section> retrieveAllSections() throws SBRException {
		return SectionDAO.findByActive((short)1);
	}
	public Section retrieveSection(int id) throws SBRException {
		Section sect = SectionDAO.findById(id);
		if(sect != null && sect.getActive()==1)
			return sect;
		else
			return null;
	}
	public void saveSection(Section sess) throws SBRException {
		SectionDAO.save(sess);
	}
	@SuppressWarnings("unchecked")
	public List<Section> retrieveSectionsByLabclass(int id) throws SBRException {
		Set sSet = LabclassDAO.findById(id).getSections();
		List sList = new ArrayList();
		for(Object s: sSet){
			if(((Section)s).getActive()==1)
				sList.add(s);
		}
		return sList;
	}
	//LabclassReservation methods
	@SuppressWarnings("unchecked")
	public List<LabclassReservation> retrieveAllLabclassReservations()
			throws SBRException {
		return LabclassReservationDAO.findByProperty("reservationStatus.id", 0);
	}
	public List<LabclassReservation> retrieveAllLabclassReservations_active_inactive() throws SBRException
	{
		return   LabclassReservationDAO.findAll();
	}
	public LabclassReservation retrieveLabclassReservation(int id)
			throws SBRException {
		LabclassReservation res = LabclassReservationDAO.findById(id);
		if(res != null && res.getReservationStatus().getId()==0)
			return res;
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<LabclassReservation> retrieveLabclassReservationsBySection(
			int id) throws SBRException {
		Set rSet = SectionDAO.findById(id).getLabclassReservations();
		List rList = new ArrayList();
		for(Object r: rSet){
			if(((LabclassReservation)r).getReservationStatus().getId()==0)
				rList.add(r);
		}
		return rList;
	}
	@SuppressWarnings("unchecked")
	public List<LabclassReservation> retrieveLabclassReservationsByStudent(
			int id) throws SBRException {
		Set rSet = StudentDAO.findById(id).getLabclassReservations();
		List rList = new ArrayList();
		for(Object r: rSet){
			if(((LabclassReservation)r).getReservationStatus().getId()==0)
				rList.add(r);
		}
		return rList;
	}
	@SuppressWarnings("unchecked")
	public List<LabclassReservation> retrieveLabclassReservationsByConfirmationNumber(String conf) throws SBRException{
		return LabclassReservationDAO.findByConfirmationNumber(conf);
	}
	public void saveLabclassReservation(LabclassReservation res)
			throws SBRException {
		LabclassReservationDAO.save(res);
	}
	
	//LabclassReservationRecord methods
	public void saveLabclassReservationRecord(LabclassReservationRecord rec)
			throws SBRException {
		LabclassReservationRecordDAO.save(rec);
	}
	
	//WeeklyScheduleDAO methods
	@SuppressWarnings("unchecked")
	public List<WeeklySchedule> retrieveWeeklySchedulesBySection(int id)
			throws SBRException {
		Set sSet = SectionDAO.findById(id).getWeeklySchedules();
		List sList = new ArrayList();
		for(Object s: sSet){
			sList.add(s);
		}
		return sList;
	}
	public void saveWeeklySchedule(WeeklySchedule sched) throws SBRException {
		WeeklyScheduleDAO.save(sched);
	}
	public void deleteWeeklySchedule(WeeklySchedule sched) throws SBRException {
		WeeklyScheduleDAO.delete(sched);
	}
	
	//DAO setters
	public void setLabclassDAO(LabclassDAO dao) {
		this.LabclassDAO = dao;
	}
	public void setLabclassReservationDAO(LabclassReservationDAO dao) {
		this.LabclassReservationDAO = dao;
	}
	public void setSectionDAO(SectionDAO dao) {
		this.SectionDAO = dao;
	}
	public void setLabclassLogDAO(LabclassLogDAO dao) {
		this.LabclassLogDAO = dao;
	}
	public void setLabclassReservationRecordDAO(LabclassReservationRecordDAO dao) {
		this.LabclassReservationRecordDAO = dao;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		StudentDAO = studentDAO;
	}
	public void setWeeklyScheduleDAO(WeeklyScheduleDAO dao) {
		this.WeeklyScheduleDAO = dao;
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
	
	public void sendChangeEmail(LabclassReservation res) throws SBRException {
		String msg = "";
		Map<String,String> model = new HashMap<String,String>();
		
		model.put("student", res.getStudent().getFirstName());
		model.put("section", res.getSection().getName());
		model.put("labclass", res.getSection().getName());
		model.put("when", res.getSection().getTime());
		model.put("location", res.getSection().getLocation());
		
		try {
			msg = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, SBRUtils.getMailTemplatePath("labclassResChange.vm"),model);	
					} catch (VelocityException ve) {
			throw new SBRException(ve.getMessage());
		}		
		
		sendMsg("Labclass Reservation Information Changed",msg,res.getStudent().getEmail(),"",null);
	}
	public void sendConfirmationEmail(LabclassReservation res)
			throws SBRException {
		String msg = "";
		String times= "";
		Set <WeeklySchedule> a= res.getSection().getWeeklySchedules();
		for(WeeklySchedule b : a)
		{
			times +=" and " +b.getWeeklyday()+" at "+b.getTimeDuration()+" \n ";
		}
	
		Map<String,String> model = new HashMap<String,String>();
		model.put("student", res.getStudent().getFirstName());
		model.put("section", res.getSection().getName());
		model.put("labclass", res.getSection().getName());
		model.put("when", res.getSection().getTime() +" "+ times);
		model.put("location", res.getSection().getLocation());
		model.put("conf", res.getConfirmationNumber());
		
		try {
			msg = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, SBRUtils.getMailTemplatePath("labclassResConfirm.vm"),model);	
					} catch (VelocityException ve) {
			throw new SBRException(ve.getMessage());
		}		
		
		sendMsg("Labclass Reservation Added",msg,res.getStudent().getEmail(),"",null);
	}
	
	//email setters
	public void setMailSender(MailSender sender) {
		this.mailSender = sender;
	}
	public void setVelocityEngine(VelocityEngine velocity) {
		this.velocityEngine = velocity;
	}
	
}
