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
@Table(name="LeaveRequest")
public class LeaveRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LeaveRequest")
	private int leaveRequestId;
	
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name="LeaveTypeID")
	private LeaveTypes leavetypeId;
	
	@Column(name="StartDate")
	private LocalDate startDate;
	
	@Column(name="EndDate")
	private LocalDate endDate;
	
	@Column(name="LeaveReason")
	private String leaveReason;
	
	@Column(name="Status")
<<<<<<< HEAD
	private String Status;
=======
	private String status;
>>>>>>> b113552 (Complete CRUD Operation)
	
	//constructor getters and setters
	
	public LeaveRequests() {
		// TODO Auto-generated constructor stub
	}

	public LeaveRequests(int leaveRequestId, Employees employee, LeaveTypes leavetypeId, LocalDate startDate,
			LocalDate endDate, String leaveReason, String status) {
		super();
		this.leaveRequestId = leaveRequestId;
		this.employee = employee;
		this.leavetypeId = leavetypeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveReason = leaveReason;
<<<<<<< HEAD
		Status = status;
=======
		this.status = status;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public int getLeaveRequestId() {
		return leaveRequestId;
	}

	public void setLeaveRequestId(int leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public LeaveTypes getLeavetypeId() {
		return leavetypeId;
	}

	public void setLeavetypeId(LeaveTypes leavetypeId) {
		this.leavetypeId = leavetypeId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getStatus() {
<<<<<<< HEAD
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
=======
		return status;
	}

	public void setStatus(String status) {
		status = status;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	@Override
	public String toString() {
		return "LeaveRequests [leaveRequestId=" + leaveRequestId + ", employee=" + employee + ", leavetypeId="
				+ leavetypeId + ", startDate=" + startDate + ", endDate=" + endDate + ", leaveReason=" + leaveReason
<<<<<<< HEAD
				+ ", Status=" + Status + "]";
=======
				+ ", Status=" + status + "]";
>>>>>>> b113552 (Complete CRUD Operation)
	}
	
	
	
	
}
