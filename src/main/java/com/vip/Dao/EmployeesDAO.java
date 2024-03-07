package com.vip.Dao;

import java.util.List;

import com.vip.entities.Employees;

public interface EmployeesDAO {

	List<Employees> getAllEmployees();
	
	void addEmployee(Employees employee);
	void updateEmployee(Employees employee);
<<<<<<< HEAD
	void deleteEmployee(int employeeId);
	
	Employees getEmployeeById(int employeeId);
	
=======
	void deleteEmployee(Employees obj);
	
	Employees getEmployeeById(int employeeId);
>>>>>>> b113552 (Complete CRUD Operation)
}
