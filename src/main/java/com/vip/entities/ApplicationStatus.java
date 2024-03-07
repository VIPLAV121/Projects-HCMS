package com.vip.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ApplicationStatus")
public class ApplicationStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ApplicationID")
	private int applicationId;
	
	@ManyToOne
	@JoinColumn(name="CandidateID")
	private CandidateProfiles Candidate;
	
	@ManyToOne
	@JoinColumn(name="VacancyID")
	private Vacancies vacancies;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="ApplicationDate")
	private LocalDate applicationdate;
	
	@Column(name="ApplicationNotes")
	private String applicationNotes;
	
	//constructor getters and setters
	
	public ApplicationStatus() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationStatus(int applicationId, CandidateProfiles candidate, Vacancies vacancies, String status,
			LocalDate applicationdate, String applicationNotes) {
		super();
		this.applicationId = applicationId;
		Candidate = candidate;
		this.vacancies = vacancies;
		Status = status;
		this.applicationdate = applicationdate;
		this.applicationNotes = applicationNotes;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public CandidateProfiles getCandidate() {
		return Candidate;
	}

	public void setCandidate(CandidateProfiles candidate) {
		Candidate = candidate;
	}

	public Vacancies getVacancies() {
		return vacancies;
	}

	public void setVacancies(Vacancies vacancies) {
		this.vacancies = vacancies;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public LocalDate getApplicationdate() {
		return applicationdate;
	}

	public void setApplicationdate(LocalDate applicationdate) {
		this.applicationdate = applicationdate;
	}

	public String getApplicationNotes() {
		return applicationNotes;
	}

	public void setApplicationNotes(String applicationNotes) {
		this.applicationNotes = applicationNotes;
	}

	@Override
	public String toString() {
		return "ApplicationStatus [applicationId=" + applicationId + ", Candidate=" + Candidate + ", vacancies="
				+ vacancies + ", Status=" + Status + ", applicationdate=" + applicationdate + ", applicationNotes="
				+ applicationNotes + "]";
	}
	
	
}
