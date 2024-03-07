package com.vip.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Departemnt")
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DepartmentID")
	private int DepartmentId;
	
	@Column(name="DepartmentName")
	private String DepartmentName;
	
	@Column(name="Description")
	private String Description;
	
	
	//constructor getters and setters
	
	public Departments() {
		// TODO Auto-generated constructor stub
	}


	public Departments(int departmentId, String departmentName, String description) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		Description = description;
	}


	public int getDepartmentId() {
		return DepartmentId;
	}


	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}


	public String getDepartmentName() {
		return DepartmentName;
	}


	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	@Override
	public String toString() {
		return "Departments [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", Description="
				+ Description + "]";
	}
	
	
	
}
