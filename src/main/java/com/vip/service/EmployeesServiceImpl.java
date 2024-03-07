package com.vip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.Dao.EmployeesDAO;
import com.vip.entities.Employees;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	private EmployeesDAO employeeDAO;

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}

	@Override
	public void addEmployee(Employees employee) {
		// TODO Auto-generated method stub
		employeeDAO.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employees employee) {
		employeeDAO.updateEmployee(employee);          
		
	}

	@Override
	public void deleteEmployee(Employees employee) {
		employeeDAO.deleteEmployee(employee);
		
	}
	

	@Override
	public Employees getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

	
}
