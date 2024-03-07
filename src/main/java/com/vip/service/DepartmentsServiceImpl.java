package com.vip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.Dao.DepartmentsDAO;
import com.vip.entities.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	
	@Autowired
	private DepartmentsDAO departmentDAO;

	@Override
	public List<Departments> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentDAO.getAllDepartments();
	}

	@Override
	public void addDepartment(Departments department) {
		// TODO Auto-generated method stub
		departmentDAO.addDepartment(department);
	}

	@Override
	public void updateDepartment(Departments department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDepartment(int departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departments getDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
