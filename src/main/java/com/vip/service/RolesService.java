package com.vip.service;

import java.util.List;

import com.vip.entities.Roles;

public interface RolesService {

List<Roles> getAllRoles();
	
	void addRole(Roles role);
	void updateRole(Roles role);
	void deleteRole(int roleId);
	
	Roles getRoleById(int roleId);
}
