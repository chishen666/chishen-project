package com.xc.study.framework.spring.di.dao.impl;

import org.springframework.stereotype.Repository;

import com.xc.study.framework.spring.di.dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao{

	public TestDaoImpl() {
		System.out.println("TestDaoImpl Constructor method run...");
	}

	@Override
	public int test(int num) {
		System.out.println(3);
		return num * num;
	}

}
