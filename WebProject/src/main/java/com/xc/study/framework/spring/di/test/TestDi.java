package com.xc.study.framework.spring.di.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xc.study.framework.spring.inaction.beanwired.service.KnightService;

public class TestDi {

	@Test
	public void testDi() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("study/diApplicationContext.xml");

		// TestController tc = (TestController) ac.getBean("testController");
		// System.out.println(tc.test(8));

		KnightService ks = ac.getBean("knightService", KnightService.class);
		ks.embarkOneQuest();
		ac.close();

	}
}
