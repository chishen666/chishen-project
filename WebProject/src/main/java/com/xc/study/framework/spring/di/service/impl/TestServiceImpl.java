package com.xc.study.framework.spring.di.service.impl;

import com.xc.study.framework.spring.di.dao.TestDao;
import com.xc.study.framework.spring.di.service.TestService;

public class TestServiceImpl implements TestService {

	private TestDao testDao;

	public TestServiceImpl() {
		System.out.println("TestServiceImpl Constructor method run...");
	}

	@Override
	public int test(int num) {
		return testDao.test(num);
	}

	public TestDao getTestDao() {
		System.out.println("TestServiceImpl getter method run...");
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		System.out.println("TestServiceImpl setter method run...");
		this.testDao = testDao;
	}

}
