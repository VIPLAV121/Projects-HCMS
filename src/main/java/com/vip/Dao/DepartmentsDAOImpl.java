package com.vip.Dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vip.entities.Departments;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class DepartmentsDAOImpl implements DepartmentsDAO {
	
	@Autowired
	private EntityManager entitymanager;

	@Override
	public List<Departments> getAllDepartments() {
		// TODO Auto-generated method stub
		return entitymanager.unwrap(Session.class).createQuery("from Departments",Departments.class).getResultList();
	}

	@Override
	public void addDepartment(Departments department) {
		entitymanager.unwrap(Session.class).saveOrUpdate(department);
		
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
	public Departments getdepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
