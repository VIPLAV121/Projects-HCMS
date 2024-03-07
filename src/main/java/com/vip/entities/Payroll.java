package com.vip.entities;

import java.math.BigDecimal;
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
@Table(name="Payroll")
public class Payroll {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PayrollID")
	private int payrollId;
	
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employee;
	
	@Column(name="SalaryMonth")
	private String salaryMonth;
	
	@Column(name="SalaryYear")
	private int salaryYear;
	
	@Column(name="BasicSalary")
	private BigDecimal basicSalary;
	
	@Column(name="Allowance")
	private BigDecimal allowance;
	
	@Column(name="Deduction")
	private BigDecimal deduction;
	
	@Column(name="NetSalary")
	private BigDecimal netSalary;
	
	@Column(name="PaymentDate")
	private LocalDate paymentDate;
	
	//constructor getters and setters
	
	public Payroll() {
		// TODO Auto-generated constructor stub
	}

	public Payroll(int payrollId, Employees employee, String salaryMonth, int salaryYear, BigDecimal basicSalary,
			BigDecimal allowance, BigDecimal deduction, BigDecimal netSalary, LocalDate paymentDate) {
		super();
		this.payrollId = payrollId;
		this.employee = employee;
		this.salaryMonth = salaryMonth;
		this.salaryYear = salaryYear;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.deduction = deduction;
		this.netSalary = netSalary;
		this.paymentDate = paymentDate;
	}

	public int getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(int payrollId) {
		this.payrollId = payrollId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public String getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(String salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public int getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(int salaryYear) {
		this.salaryYear = salaryYear;
	}

	public BigDecimal getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(BigDecimal basicSalary) {
		this.basicSalary = basicSalary;
	}

	public BigDecimal getAllowance() {
		return allowance;
	}

	public void setAllowance(BigDecimal allowance) {
		this.allowance = allowance;
	}

	public BigDecimal getDeduction() {
		return deduction;
	}

	public void setDeduction(BigDecimal deduction) {
		this.deduction = deduction;
	}

	public BigDecimal getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(BigDecimal netSalary) {
		this.netSalary = netSalary;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payroll [payrollId=" + payrollId + ", employee=" + employee + ", salaryMonth=" + salaryMonth
				+ ", salaryYear=" + salaryYear + ", basicSalary=" + basicSalary + ", allowance=" + allowance
				+ ", deduction=" + deduction + ", netSalary=" + netSalary + ", paymentDate=" + paymentDate + "]";
	}
	
	
}
