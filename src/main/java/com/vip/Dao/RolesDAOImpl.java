package com.vip.Dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vip.entities.Roles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RolesDAOImpl implements RolesDAO {
	
	@Autowired
	private EntityManager entitymanager;

	@Override
	public List<Roles> getAllRoles() {
		// TODO Auto-generated method stub
 	return entitymanager.unwrap(Session.class).createQuery("from Roles",Roles.class).getResultList();

	}

	@Override
	public void addRole(Roles role) {
		entitymanager.unwrap(Session.class).saveOrUpdate(role);
		
	}

	@Override
	public void updateRole(Roles role) {
		entitymanager.unwrap(Session.class).update(role);
		
	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Roles getRoleById(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
