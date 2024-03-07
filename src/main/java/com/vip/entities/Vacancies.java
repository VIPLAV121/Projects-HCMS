package com.vip.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Vacancies")
public class Vacancies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VacancyID")
	private int vacancyId;
	
	@ManyToOne
	@JoinColumn(name="DeprtmentID")
	private Departments department;
	
	@Column(name="Position")
	private String position;
	
	@Column(name="RequiredSkillSet")
	private String requiredSkillSet;
	
	@Column(name="NumberOfOpenings")
	private int numberofOpenings;

	//constructor getters and setters
	
	public Vacancies() {
		// TODO Auto-generated constructor stub
	}

	public Vacancies(int vacancyId, Departments department, String position, String requiredSkillSet,
			int numberofOpenings) {
		super();
		this.vacancyId = vacancyId;
		this.department = department;
		this.position = position;
		this.requiredSkillSet = requiredSkillSet;
		this.numberofOpenings = numberofOpenings;
	}

	public int getVacancyId() {
		return vacancyId;
	}

	public void setVacancyId(int vacancyId) {
		this.vacancyId = vacancyId;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRequiredSkillSet() {
		return requiredSkillSet;
	}

	public void setRequiredSkillSet(String requiredSkillSet) {
		this.requiredSkillSet = requiredSkillSet;
	}

	public int getNumberofOpenings() {
		return numberofOpenings;
	}

	public void setNumberofOpenings(int numberofOpenings) {
		this.numberofOpenings = numberofOpenings;
	}

	@Override
	public String toString() {
		return "Vacancies [vacancyId=" + vacancyId + ", department=" + department + ", position=" + position
				+ ", requiredSkillSet=" + requiredSkillSet + ", numberofOpenings=" + numberofOpenings + "]";
	}
	
	 	

}
