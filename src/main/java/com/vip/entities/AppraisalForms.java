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
@Table(name="AppraisalForms")
public class AppraisalForms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FormID")
	private int formid;
	
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employee;
	
	@Column(name="SubmissionDate")
	private LocalDate submissionDate;
	
	//other fields
	
	@ManyToOne
	@JoinColumn(name="ReviewerID")
	private Employees reviewer;
	
	//constructor getters and setters
	
	 public AppraisalForms() {
		// TODO Auto-generated constructor stub
	}

	public AppraisalForms(int formid, Employees employee, LocalDate submissionDate, Employees reviewer) {
		super();
		this.formid = formid;
		this.employee = employee;
		this.submissionDate = submissionDate;
		this.reviewer = reviewer;
	}

	public int getFormid() {
		return formid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Employees getReviewer() {
		return reviewer;
	}

	public void setReviewer(Employees reviewer) {
		this.reviewer = reviewer;
	}

	@Override
	public String toString() {
		return "AppraisalForms [formid=" + formid + ", employee=" + employee + ", submissionDate=" + submissionDate
				+ ", reviewer=" + reviewer + "]";
	}
	 
	 
}
