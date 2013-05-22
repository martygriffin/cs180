package edu.ucr.c3.wms.business.reservation;

import java.util.List;

import edu.ucr.c3.wms.dao.hibernate.AcademicTermDAO;
import edu.ucr.c3.wms.dao.hibernate.ReservationStatusDAO;
import edu.ucr.c3.wms.domain.AcademicTerm;
import edu.ucr.c3.wms.domain.ReservationStatus;

public interface LookupService {
	
	public ReservationStatus retrieveReservationStatus(int id);
	public List<ReservationStatus> getAllReservationStates();
	
	public AcademicTerm retrieveAcademicTerm(short id);
	public List<AcademicTerm> getAllAcademicTerms();
	
	public void setReservationStatusDAO(ReservationStatusDAO dao);
	public void setAcademicTermDAO(AcademicTermDAO dao);
	
}
