package com.xc.study.framework.spring.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xc.study.framework.spring.aop.service.UserService;

public class TestAop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("study/applicationContext.xml");
		UserService us = (UserService) cpxac.getBean("userService");
		us.add();
		// BookService bs = (BookService) cpxac.getBean("bookService");
		// bs.update();
		cpxac.close();
	}
}
