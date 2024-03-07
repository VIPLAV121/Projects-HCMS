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
@Table(name="Employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmployeeID")
	private int employee_Id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Gender")	
	private String gender;
	
	@Column(name="DateOfBirth")
	private LocalDate DateofBirth;  
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone")
	private String phone;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="NationalID")
	private String nationalId;
	
	@Column(name="MaritalStatus")
	private String maritalStatus;
	
	@Column(name="EmergencyContactName")
	private String EmergencyContactName;
	
	@Column(name="EmergencyContactPhone")
	private String EmergencyContactPhone;
	
	@ManyToOne
<<<<<<< HEAD
	@Column(name="DepartmentID")
=======
	@JoinColumn(name="DepartmentID")
>>>>>>> b113552 (Complete CRUD Operation)
	private Departments DepartmentId;
	
	@Column(name="Position")
	private String position;
	
	@Column(name="SkillSet")
	private String skillSet;
	
	@Column(name="EmploymentStartDate")
	private LocalDate EmploymentStartDate;
	
	@Column(name="EmploymentEndDate")
	private LocalDate EmploymentEndDate;
	
	@Column(name="Salary")
	private BigDecimal salary;
	
	@Column(name="EmploymentStatus")
	private String EmploymentStatus;
	
	@Column(name="BankAccountNumber")
	private String BankAccountNumber;
	
	@ManyToOne
	@JoinColumn(name="ManagerID")
<<<<<<< HEAD
	private Employees Manager;
	
	@ManyToOne
	@JoinColumn(name="RoleID")
	private Roles  RoleId;
=======
	private Employees manager;
	
	@ManyToOne
	@JoinColumn(name="RoleID")
	private Roles roleId;
>>>>>>> b113552 (Complete CRUD Operation)
	
	//Constructor and Getters Setters
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int employee_Id, String firstName, String lastName, String gender, LocalDate dateofBirth,
			String email, String phone, String address, String nationalId, String maritalStatus,
			String emergencyContactName, String emergencyContactPhone, Departments departmentId, String position,
			String skillSet, LocalDate employmentStartDate, LocalDate employmentEndDate, BigDecimal salary,
			String employmentStatus, String bankAccountNumber, Employees manager, Roles roleId) {
		super();
		this.employee_Id = employee_Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
<<<<<<< HEAD
		DateofBirth = dateofBirth;
		this.email = email;
		this.phone = phone;
		Address = address;
		this.nationalId = nationalId;
		this.maritalStatus = maritalStatus;
		EmergencyContactName = emergencyContactName;
		EmergencyContactPhone = emergencyContactPhone;
		DepartmentId = departmentId;
		this.position = position;
		this.skillSet = skillSet;
		EmploymentStartDate = employmentStartDate;
		EmploymentEndDate = employmentEndDate;
		this.salary = salary;
		EmploymentStatus = employmentStatus;
		BankAccountNumber = bankAccountNumber;
		Manager = manager;
		RoleId = roleId;
	}

=======
		this.DateofBirth = dateofBirth;
		this.email = email;
		this.phone = phone;
		this.Address = address;
		this.nationalId = nationalId;
		this.maritalStatus = maritalStatus;
		this.EmergencyContactName = emergencyContactName;
		this.EmergencyContactPhone = emergencyContactPhone;
		this.DepartmentId = departmentId;
		this.position = position;
		this.skillSet = skillSet;
		this.EmploymentStartDate = employmentStartDate;
		this.EmploymentEndDate = employmentEndDate;
		this.salary = salary;
		this.EmploymentStatus = employmentStatus;
		this.BankAccountNumber = bankAccountNumber;
		this.manager = manager;
		this.roleId = roleId;
	}

	
	
>>>>>>> b113552 (Complete CRUD Operation)
	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
<<<<<<< HEAD
		DateofBirth = dateofBirth;
=======
		this.DateofBirth = dateofBirth;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
<<<<<<< HEAD
		Address = address;
=======
		this.Address = address;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmergencyContactName() {
		return EmergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
<<<<<<< HEAD
		EmergencyContactName = emergencyContactName;
=======
		this.EmergencyContactName = emergencyContactName;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public String getEmergencyContactPhone() {
		return EmergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
<<<<<<< HEAD
		EmergencyContactPhone = emergencyContactPhone;
=======
		this.EmergencyContactPhone = emergencyContactPhone;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public Departments getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(Departments departmentId) {
<<<<<<< HEAD
		DepartmentId = departmentId;
=======
		this.DepartmentId = departmentId;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public LocalDate getEmploymentStartDate() {
		return EmploymentStartDate;
	}

	public void setEmploymentStartDate(LocalDate employmentStartDate) {
<<<<<<< HEAD
		EmploymentStartDate = employmentStartDate;
=======
		this.EmploymentStartDate = employmentStartDate;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public LocalDate getEmploymentEndDate() {
		return EmploymentEndDate;
	}

	public void setEmploymentEndDate(LocalDate employmentEndDate) {
<<<<<<< HEAD
		EmploymentEndDate = employmentEndDate;
=======
		this.EmploymentEndDate = employmentEndDate;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getEmploymentStatus() {
		return EmploymentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
<<<<<<< HEAD
		EmploymentStatus = employmentStatus;
=======
		this.EmploymentStatus = employmentStatus;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	public String getBankAccountNumber() {
		return BankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
<<<<<<< HEAD
		BankAccountNumber = bankAccountNumber;
	}

	public Employees getManager() {
		return Manager;
	}

	public void setManager(Employees manager) {
		Manager = manager;
	}

	public Roles getRoleId() {
		return RoleId;
	}

	public void setRoleId(Roles roleId) {
		RoleId = roleId;
=======
		this.BankAccountNumber = bankAccountNumber;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public Roles getRoleId() {
		return roleId;
	}

	public void setRoleId(Roles roleId) {
		this.roleId = roleId;
>>>>>>> b113552 (Complete CRUD Operation)
	}

	@Override
	public String toString() {
		return "Employees [employee_Id=" + employee_Id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", DateofBirth=" + DateofBirth + ", email=" + email + ", phone=" + phone
				+ ", Address=" + Address + ", nationalId=" + nationalId + ", maritalStatus=" + maritalStatus
				+ ", EmergencyContactName=" + EmergencyContactName + ", EmergencyContactPhone=" + EmergencyContactPhone
				+ ", DepartmentId=" + DepartmentId + ", position=" + position + ", skillSet=" + skillSet
				+ ", EmploymentStartDate=" + EmploymentStartDate + ", EmploymentEndDate=" + EmploymentEndDate
				+ ", salary=" + salary + ", EmploymentStatus=" + EmploymentStatus + ", BankAccountNumber="
<<<<<<< HEAD
				+ BankAccountNumber + ", Manager=" + Manager + ", RoleId=" + RoleId + "]";
	}

	

=======
				+ BankAccountNumber + ", Manager=" + manager + ", roleId=" + roleId + "]";
	}
	
	
	
	
>>>>>>> b113552 (Complete CRUD Operation)
	
	
	
	
	
}
