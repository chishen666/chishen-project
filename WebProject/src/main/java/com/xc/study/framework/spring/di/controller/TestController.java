package com.xc.study.framework.spring.di.controller;

import com.xc.study.framework.spring.di.service.TestService;

public class TestController {

	private TestService testService;

	public TestController() {
		System.out.println("TestController constructor method run...");
	}

	public int test(int num) {
		return testService.test(num);
	}

	public TestService getTestService() {
		System.out.println("TestController getter method run...");
		return testService;
	}

	public void setTestService(TestService testService) {
		System.out.println("TestController setter method run...");
		this.testService = testService;
	}

}
