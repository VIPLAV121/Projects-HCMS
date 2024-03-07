package com.vip.Dao;

import java.util.List;

import com.vip.entities.Departments;

public interface DepartmentsDAO {
List<Departments> getAllDepartments();
	
	void addDepartment(Departments department);
	void updateDepartment(Departments department);
	void deleteDepartment(int departmentId);
	
	Departments getdepartmentById(int departmentId);
}
