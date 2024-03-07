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
@Table(name="LeaveApprovals")
public class LeaveApprovals {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="LeaveID")
	private int leaveId;
	
	@ManyToOne
	@JoinColumn(name="LeaveRequestID")
	private LeaveRequests leaveRequest;
	
	@ManyToOne
	@JoinColumn(name="ApproverID")
	private Employees approver;
	
	@Column(name="ApprovalDate")
	private LocalDate approvalDate;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="Comments")
	private String comments;
	
	//constructor getters and setters
	
	public LeaveApprovals() {
		// TODO Auto-generated constructor stub
	}

	
	public LeaveApprovals(int leaveId, LeaveRequests leaveRequest, Employees approver, LocalDate approvalDate,
			String status, String comments) {
		super();
		this.leaveId = leaveId;
		this.leaveRequest = leaveRequest;
		this.approver = approver;
		this.approvalDate = approvalDate;
		this.status = status;
		this.comments = comments;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public LeaveRequests getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequests leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public Employees getApprover() {
		return approver;
	}

	public void setApprover(Employees approver) {
		this.approver = approver;
	}

	public LocalDate getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(LocalDate approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "LeaveApprovals [leaveId=" + leaveId + ", leaveRequest=" + leaveRequest + ", approver=" + approver
				+ ", approvalDate=" + approvalDate + ", status=" + status + ", comments=" + comments + "]";
	}
	
	

}
