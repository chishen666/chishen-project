package com.carrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.carrx.bean.po.Role;
import com.carrx.dao.RoleDao;
import com.carrx.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public void saveRole(@RequestBody Role role) {
		roleDao.save(role);
	}

	@Override
	public void removeRole(int id) {
		roleDao.deleteById(Integer.valueOf(id));
	}

	@Override
	public void updateRole(Role role) {
		roleDao.save(role);

	}

	@Override
	public Role getRoleById(int id) {
		return roleDao.findById(Integer.valueOf(id)).get();
	}

	@Override
	public List<Role> listRoles(int pageNum, int pageSize) {
		return null;
	}

}
