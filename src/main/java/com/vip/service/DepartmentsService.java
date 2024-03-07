package com.vip.service;

import java.util.List;

import com.vip.entities.Departments;

public interface DepartmentsService {

List<Departments> getAllDepartments();
	
	void addDepartment(Departments department);
	void updateDepartment(Departments department);
	void deleteDepartment(int departmentId);
	
	Departments getDepartmentById(int departmentId);
}
