package com.xc.study.framework.spring.di.dao.impl;

import com.xc.study.framework.spring.di.dao.TestDao;

public class TestDaoImpl implements TestDao {

	public TestDaoImpl() {
		System.out.println("TestDaoImpl Constructor method run...");
	}

	@Override
	public int test(int num) {
		return num * num;
	}

}
