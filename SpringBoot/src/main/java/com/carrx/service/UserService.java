package com.carrx.service;

import java.util.List;

import com.carrx.bean.po.User;

public interface UserService {

	void saveUser(User user);

	void removeUser(int id);

	void updateUser(User user);

	User getUserById(int id);

	List<User> listUsers(int pageNum, int pageSize);
}
