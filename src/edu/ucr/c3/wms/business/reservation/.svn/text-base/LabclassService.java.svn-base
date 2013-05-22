package edu.ucr.c3.wms.business.reservation;

import java.util.List;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.MailSender;

import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.dao.hibernate.SectionDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationRecordDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassReservationDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassDAO;
import edu.ucr.c3.wms.dao.hibernate.LabclassLogDAO;
import edu.ucr.c3.wms.dao.hibernate.WeeklyScheduleDAO;
import edu.ucr.c3.wms.domain.Section;
import edu.ucr.c3.wms.domain.Labclass;
import edu.ucr.c3.wms.domain.LabclassLog;
import edu.ucr.c3.wms.domain.LabclassReservation;
import edu.ucr.c3.wms.domain.LabclassReservationRecord;
import edu.ucr.c3.wms.domain.WeeklySchedule;
import edu.ucr.c3.wms.domain.WorkshopReservation;

public interface LabclassService {

	public void saveLabclass(Labclass workshop) throws SBRException;
	public Labclass retrieveLabclass(int id) throws SBRException;
	public List<Labclass> retrieveAllLabclasss() throws SBRException;
    
	public void saveSection(Section sess) throws SBRException;
	public Section retrieveSection(int id) throws SBRException;
	public List<Section> retrieveAllSections() throws SBRException;
	public List<Section> retrieveSectionsByLabclass(int id) throws SBRException;
	
	public void saveLabclassLog(LabclassLog log) throws SBRException;
	
	public void saveLabclassReservation(LabclassReservation res) throws SBRException;
	public LabclassReservation retrieveLabclassReservation(int id) throws SBRException;
	public List<LabclassReservation> retrieveAllLabclassReservations() throws SBRException;
	public List<LabclassReservation> retrieveAllLabclassReservations_active_inactive() throws SBRException;
	public List<LabclassReservation> retrieveLabclassReservationsBySection(int id) throws SBRException;
	public List<LabclassReservation> retrieveLabclassReservationsByStudent(int id) throws SBRException;
	public List<LabclassReservation> retrieveLabclassReservationsByConfirmationNumber(String conf) throws SBRException;
	
	public void saveLabclassReservationRecord(LabclassReservationRecord rec) throws SBRException;
	
	public void saveWeeklySchedule(WeeklySchedule sched) throws SBRException;
	public List<WeeklySchedule> retrieveWeeklySchedulesBySection(int id) throws SBRException;
	public void deleteWeeklySchedule(WeeklySchedule sched) throws SBRException;
	
	public void setLabclassDAO(LabclassDAO dao);
	public void setLabclassLogDAO(LabclassLogDAO dao);
	public void setLabclassReservationDAO(LabclassReservationDAO dao);
	public void setLabclassReservationRecordDAO(LabclassReservationRecordDAO dao);
	public void setSectionDAO(SectionDAO dao);
	public void setWeeklyScheduleDAO(WeeklyScheduleDAO dao);
	
	public void sendConfirmationEmail(LabclassReservation res) throws SBRException;
	public void sendChangeEmail(LabclassReservation res) throws SBRException;
	
	public void setVelocityEngine(VelocityEngine velocity);
    public void setMailSender(MailSender sender);
	
}
