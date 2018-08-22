package com.xc.study.framework.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.xc.study.framework.spring.di.service.TestService;

public class TestController {

	@Autowired
	private TestService testService;

	private int test;

	public TestController() {
		System.out.println("TestController constructor method run...");
	}

	public int test(int num) {
		System.out.println(1);
		return testService.test(num);
	}

	/*
	 * public TestService getTestService() {
	 * System.out.println("TestController getter method run..."); return
	 * testService; }
	 * 
	 * public void setTestService(TestService testService) {
	 * System.out.println("TestController setter method run..."); this.testService =
	 * testService; }
	 */

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

}
