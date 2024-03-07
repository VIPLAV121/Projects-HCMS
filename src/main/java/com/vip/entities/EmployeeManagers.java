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
@Table(name="EmployeeManagers")
public class EmployeeManagers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RelationshipID")
	private int relationshipsId;
	
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name="ManagerID")
	private Employees manager;
	
	@Column(name="RelationshipType")
	private String relationshipType;
	
	//constructor getters ad setters
	
	public EmployeeManagers() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeManagers(int relationshipsId, Employees employee, Employees manager, String relationshipType) {
		super();
		this.relationshipsId = relationshipsId;
		this.employee = employee;
		this.manager = manager;
		this.relationshipType = relationshipType;
	}

	public int getRelationshipsId() {
		return relationshipsId;
	}

	public void setRelationshipsId(int relationshipsId) {
		this.relationshipsId = relationshipsId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	@Override
	public String toString() {
		return "EmployeeManagers [relationshipsId=" + relationshipsId + ", employee=" + employee + ", manager="
				+ manager + ", relationshipType=" + relationshipType + "]";
	}	
	
	
}
