package com.vip.Dao;

import java.util.List;

import com.vip.entities.Roles;

public interface RolesDAO {
	
List<Roles> getAllRoles();
	
	void addRole(Roles role);
	void updateRole(Roles role);
	void deleteRole(int roleId);
	
	Roles getRoleById(int roleId);

}
