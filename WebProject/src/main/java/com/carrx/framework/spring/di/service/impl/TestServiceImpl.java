package com.xc.study.framework.spring.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.study.framework.spring.di.dao.TestDao;
import com.xc.study.framework.spring.di.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	public TestServiceImpl() {
		System.out.println("TestServiceImpl Constructor method run...");
	}

	@Override
	public int test(int num) {
		System.out.println(2);
		return testDao.test(num);
	}

	/*
	 * public TestDao getTestDao() {
	 * System.out.println("TestServiceImpl getter method run..."); return testDao; }
	 * 
	 * public void setTestDao(TestDao testDao) {
	 * System.out.println("TestServiceImpl setter method run..."); this.testDao =
	 * testDao; }
	 */

}
