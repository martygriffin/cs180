package edu.ucr.c3.wms.business.reservation.imp;

import java.util.List;

import edu.ucr.c3.wms.business.SBRService;
import edu.ucr.c3.wms.business.reservation.LookupService;
import edu.ucr.c3.wms.dao.hibernate.AcademicTermDAO;
import edu.ucr.c3.wms.dao.hibernate.ReservationStatusDAO;
import edu.ucr.c3.wms.domain.AcademicTerm;
import edu.ucr.c3.wms.domain.ReservationStatus;

public class LookupServiceImp extends SBRService implements LookupService {

	AcademicTermDAO AcademicTermDAO;
	ReservationStatusDAO ReservationStatusDAO;
	
	public AcademicTerm retrieveAcademicTerm(short id) {
		return AcademicTermDAO.findById(id);
	}
	@SuppressWarnings("unchecked")
	public List<AcademicTerm> getAllAcademicTerms() {
		return AcademicTermDAO.findAll();
	}
	
	public ReservationStatus retrieveReservationStatus(int id) {
		return ReservationStatusDAO.findById(id);
	}
	@SuppressWarnings("unchecked")
	public List<ReservationStatus> getAllReservationStates() {
		return ReservationStatusDAO.findAll();
	}

	//DAO setters
	public void setAcademicTermDAO(AcademicTermDAO dao) {
		this.AcademicTermDAO = dao;
	}
	public void setReservationStatusDAO(ReservationStatusDAO dao) {
		this.ReservationStatusDAO = dao;
	}

}
