package com.carrx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrx.bean.po.Role;
import com.carrx.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping(value = "/{id}")
	public Role queryRole(@PathVariable int id) {
		return roleService.getRoleById(id);
	}

	@PostMapping
	public void saveRole(@RequestBody Role role) {
		roleService.saveRole(role);
	}

	@DeleteMapping(value = "/{id}")
	public void removeRole(@PathVariable int id) {
		roleService.removeRole(id);
	}

	@PutMapping(value = "/{id}")
	public void modifyRole(@RequestBody Role role) {
		roleService.updateRole(role);
	}

}
