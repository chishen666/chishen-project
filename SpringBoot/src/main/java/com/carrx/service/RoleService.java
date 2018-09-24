package com.carrx.service;

import java.util.List;

import com.carrx.bean.po.Role;

public interface RoleService {

	void saveRole(Role role);

	void removeRole(int id);

	void updateRole(Role role);

	Role getRoleById(int id);

	List<Role> listRoles(int pageNum, int pageSize);
}
