package com.vip;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vip.entities.Departments;
import com.vip.entities.Employees;
import com.vip.entities.Roles;
import com.vip.service.DepartmentsService;
import com.vip.service.EmployeesService;
import com.vip.service.RolesService;

@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	private RolesService roleService;
	
	@Autowired
	private DepartmentsService departmentService;
	
	@Autowired
	private EmployeesService employeeService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Roles role1=new Roles();
//		role1.setRoleName("Manager");
//		role1.setDescription("Manager role Descr");
//		roleService.addRole(role1);
//		
//		Roles role2= new Roles();
//		role2.setRoleName("Developer");
//		role2.setDescription("Developer role Descr");
//		roleService.addRole(role2);
//		
//		Departments d1=new Departments();
//		d1.setDepartmentName("IT");
//		d1.setDescription("IT Descr");
//		departmentService.addDepartment(d1);
//		
//		Departments d2= new Departments();
//		d2.setDepartmentName("HR");
//		d2.setDescription("HR Descr");
//		departmentService.addDepartment(d2);
//		
//		Employees manager=new Employees();
//		manager.setFirstName("Virat");
//		manager.setLastName("Kohli");
//		manager.setGender("M");
//		manager.setDateofBirth(LocalDate.of(1988, 9, 5));
//		manager.setEmail("viratKohli@gmail.com");
//		manager.setPhone("9232348433");
//		manager.setAddress("Mumbai");
//		manager.setNationalId("423423");
//		manager.setMaritalStatus("Married");
//		manager.setEmergencyContactName("Anushka");
//		manager.setEmergencyContactPhone("9322188334");
//		manager.setPosition("Senior Software Manager");
//		manager.setSkillSet("Java, AWS, Python, SpringBoot, Microservices");
//		manager.setEmploymentStartDate(LocalDate.of(2020, 1, 1));
//		manager.setEmploymentEndDate(null);
//		manager.setSalary(new BigDecimal(170000));
//		manager.setEmploymentStatus("Active");
//		manager.setBankAccountNumber("423240890383");
//		manager.setManager(null);
//		manager.setDepartmentId(d2);
//		manager.setRoleId(role2);
//		
//		Employees emp1=new Employees();
//		emp1.setFirstName("Viplav");
//		emp1.setLastName("Deshmukh");
//		emp1.setGender("M");
//		emp1.setDateofBirth(LocalDate.of(2000, 10, 18));
//		emp1.setEmail("viplavdeshmukh62@gmail.com");
//		emp1.setPhone("9232348977");
//		emp1.setAddress("Pune");
//		emp1.setNationalId("23098");
//		emp1.setMaritalStatus("Single");
//		emp1.setEmergencyContactName("Sahil");
//		emp1.setEmergencyContactPhone("9232290333");
//		emp1.setPosition("Software Developer");
//		emp1.setSkillSet("Java, AWS, PYthon");
//		emp1.setEmploymentStartDate(LocalDate.of(2022, 1, 1));
//		emp1.setEmploymentEndDate(null);
//		emp1.setSalary(new BigDecimal(90000));
//		emp1.setEmploymentStatus("Active");
//		emp1.setBankAccountNumber("390990890383");
//		emp1.setManager(manager);
//		emp1.setDepartmentId(d1);
//		emp1.setRoleId(role1);
//		
//		employeeService.addEmployee(manager);
//		employeeService.addEmployee(emp1);
//		
	}

}
