package com.vip.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LeaveTypes")
public class LeaveTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LeaveID")
	private int leaveId;
	
	@Column(name="LeaveName")
	private String leaveName;
	
	@Column(name="Description")
	private String description;
	
	//constructor getters and setters
	
	public LeaveTypes() {
		// TODO Auto-generated constructor stub
	}

	public LeaveTypes(int leaveId, String leaveName, String description) {
		super();
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.description = description;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getLeaveName() {
		return leaveName;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LeaveTypes [leaveId=" + leaveId + ", leaveName=" + leaveName + ", description=" + description + "]";
	}
	
	

}
