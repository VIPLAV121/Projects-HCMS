package com.vip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.Dao.RolesDAO;
import com.vip.entities.Roles;

@Service
public class RolesServiceImpl implements RolesService{
	
	@Autowired
	private RolesDAO roleDAO;

	@Override
	public List<Roles> getAllRoles() {
		// TODO Auto-generated method stub
		return roleDAO.getAllRoles();
	}

	@Override
	public void addRole(Roles role) {
		// TODO Auto-generated method stub
		roleDAO.addRole(role);
		
	}

	@Override
	public void updateRole(Roles ole) {
		// TODO Auto-generated method stub
		
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
