package com.xc.study.framework.spring.aop.service.impl;

import com.xc.study.framework.spring.aop.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("userService add method!");
		System.out.println(1 / 0);
	}

}
