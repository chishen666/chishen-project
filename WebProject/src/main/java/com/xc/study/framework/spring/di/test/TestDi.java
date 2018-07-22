package com.xc.study.framework.spring.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xc.study.framework.spring.di.controller.TestController;

public class TestDi {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("study/applicationContext.xml");
		TestController tc = (TestController) ac.getBean("testController");
		System.out.println(tc.test(8));
	}
}
