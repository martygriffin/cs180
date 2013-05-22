package edu.ucr.c3.phr.controller.user.forms;

import java.util.List;

import edu.ucr.c3.phr.domain.Allergys;
import edu.ucr.c3.phr.domain.Dicom;
import edu.ucr.c3.phr.domain.Files;
import edu.ucr.c3.phr.domain.Immunization;
import edu.ucr.c3.phr.domain.Insurance;
import edu.ucr.c3.phr.domain.Measurement;
import edu.ucr.c3.phr.domain.Medication;
import edu.ucr.c3.phr.domain.Notes;
import edu.ucr.c3.phr.domain.Problem;
import edu.ucr.c3.phr.domain.Procedures;
import edu.ucr.c3.phr.domain.Results;
import edu.ucr.c3.phr.domain.SimpleClinicalNote;
import edu.ucr.c3.phr.domain.Vitals;



public class DefaultForm {
	
//	private int colId = BaseValidator.NOT_SELECTED;
//	private int univId = BaseValidator.NOT_SELECTED;
//	private String name;
//	private String url;
//	private List<University> univs;
//	
	private List<Allergys> allergys;
	private List<Medication> medication;
	private List<Dicom> dicom;
	private List<Files>files;
	private List<Immunization> immunizations;
	private List<Measurement> measurements;
	private List<Notes> notes;
	private List<Problem>problems;
	private List<Procedures>procedures;
	private	List<Results>results;
	private List<SimpleClinicalNote>simpleClinicalNote;
	private List<Vitals>vitals;
	private List<Insurance>insurance;
	private String[] deletelist_allergys;
	private String[] deletelist_medication;
	private String[] deletelist_dicom;
	private String[] deletelist_files;
	private String[] deletelist_immunizations;
	private String[] deletelist_measurements;
	private String[] deletelist_problems;
	private String[] deletelist_procedures;
	private String[] deletelist_reults;
	private String[] deletelist_simpleClinicalNote;
	private String[] deletelist_vitals;
	private String[] deletelist_insurnace;
	
	
	
	
	
	
	
	public void setAllergys(List<Allergys> allergys) {
		this.allergys = allergys;
	}

	public List<Allergys> getAllergys() {
		return allergys;
	}

	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}

	public List<Medication> getMedication() {
		return medication;
	}

	public void setDicom(List<Dicom> dicom) {
		this.dicom = dicom;
	}

	public List<Dicom> getDicom() {
		return dicom;
	}

	public void setFiles(List<Files> files) {
		this.files = files;
	}

	public List<Files> getFiles() {
		return files;
	}

	public void setImmunizations(List<Immunization> immunizations) {
		this.immunizations = immunizations;
	}

	public List<Immunization> getImmunizations() {
		return immunizations;
	}

	public void setMeasurements(List<Measurement> measurements) {
		this.measurements = measurements;
	}

	public List<Measurement> getMeasurements() {
		return measurements;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	public List<Problem> getProblems() {
		return problems;
	}

	public void setProcedures(List<Procedures> Procedures) {
		procedures = Procedures;
	}

	public List<Procedures> getProcedures() {
		return procedures;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public List<Results> getResults() {
		return results;
	}

	public void setSimpleClinicalNote(List<SimpleClinicalNote> simpleClinicalNote) {
		this.simpleClinicalNote = simpleClinicalNote;
	}

	public List<SimpleClinicalNote> getSimpleClinicalNote() {
		return simpleClinicalNote;
	}

	public void setVitals(List<Vitals> vitals) {
		this.vitals = vitals;
	}

	public List<Vitals> getVitals() {
		return vitals;
	}

	public void setInsurance(List<Insurance> insurance) {
		this.insurance = insurance;
	}

	public List<Insurance> getInsurance() {
		return insurance;
	}

	public void setDeletelist_allergys(String[] deletelist_allergys) {
		this.deletelist_allergys = deletelist_allergys;
	}

	public String[] getDeletelist_allergys() {
		return deletelist_allergys;
	}

	public String[] getDeletelist_medication() {
		return deletelist_medication;
	}

	public void setDeletelist_medication(String[] deletelist_medication) {
		this.deletelist_medication = deletelist_medication;
	}

	public String[] getDeletelist_dicom() {
		return deletelist_dicom;
	}

	public void setDeletelist_dicom(String[] deletelist_dicom) {
		this.deletelist_dicom = deletelist_dicom;
	}

	public String[] getDeletelist_files() {
		return deletelist_files;
	}

	public void setDeletelist_files(String[] deletelist_files) {
		this.deletelist_files = deletelist_files;
	}

	public String[] getDeletelist_immunizations() {
		return deletelist_immunizations;
	}

	public void setDeletelist_immunizations(String[] deletelist_immunizations) {
		this.deletelist_immunizations = deletelist_immunizations;
	}

	public String[] getDeletelist_measurements() {
		return deletelist_measurements;
	}

	public void setDeletelist_measurements(String[] deletelist_measurements) {
		this.deletelist_measurements = deletelist_measurements;
	}

	public String[] getDeletelist_problems() {
		return deletelist_problems;
	}

	public void setDeletelist_problems(String[] deletelist_problems) {
		this.deletelist_problems = deletelist_problems;
	}
	public String[] getDeletelist_reults() {
		return deletelist_reults;
	}

	public void setDeletelist_reults(String[] deletelist_reults) {
		this.deletelist_reults = deletelist_reults;
	}

	public String[] getDeletelist_simpleClinicalNote() {
		return deletelist_simpleClinicalNote;
	}

	public void setDeletelist_simpleClinicalNote(
			String[] deletelist_simpleClinicalNote) {
		this.deletelist_simpleClinicalNote = deletelist_simpleClinicalNote;
	}

	public String[] getDeletelist_vitals() {
		return deletelist_vitals;
	}

	public void setDeletelist_vitals(String[] deletelist_vitals) {
		this.deletelist_vitals = deletelist_vitals;
	}

	public String[] getDeletelist_insurnace() {
		return deletelist_insurnace;
	}

	public void setDeletelist_insurnace(String[] deletelist_insurnace) {
		this.deletelist_insurnace = deletelist_insurnace;
	}

	public void setDeletelist_procedures(String[] deletelist_procedures) {
		this.deletelist_procedures = deletelist_procedures;
	}

	public String[] getDeletelist_procedures() {
		return deletelist_procedures;
	}

}
