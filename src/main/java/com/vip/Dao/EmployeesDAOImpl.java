package com.vip.Dao;

import java.util.List;

<<<<<<< HEAD
import com.vip.entities.Employees;

public class EmployeesDAOImpl implements EmployeesDAO{

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
=======
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vip.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeesDAOImpl implements EmployeesDAO {
	
	@Autowired
	private EntityManager entitymanager;

	@Override
	public List<Employees> getAllEmployees() {
//		Session session=entitymanager.unwrap(Session.class);
//		session.createQuery("from Employees",Employees.class).getResultList();
		return entitymanager.unwrap(Session.class).createQuery("from Employees",Employees.class).getResultList();
>>>>>>> b113552 (Complete CRUD Operation)
	}

	@Override
	public void addEmployee(Employees employee) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		
=======
		entitymanager.unwrap(Session.class).saveOrUpdate(employee);
			
>>>>>>> b113552 (Complete CRUD Operation)
	}

	@Override
	public void updateEmployee(Employees employee) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		//update is deprecated 
		entitymanager.unwrap(Session.class).merge(employee);
>>>>>>> b113552 (Complete CRUD Operation)
		
	}

	@Override
<<<<<<< HEAD
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
=======
	public void deleteEmployee(Employees emp) {
		entitymanager.unwrap(Session.class).remove(emp);
>>>>>>> b113552 (Complete CRUD Operation)
		
	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return null;
=======
		return entitymanager.unwrap(Session.class).get(Employees.class, employeeId);
>>>>>>> b113552 (Complete CRUD Operation)
	}

	

	
}
