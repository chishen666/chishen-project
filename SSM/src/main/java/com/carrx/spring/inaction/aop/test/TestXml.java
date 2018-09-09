package com.carrx.spring.inaction.aop.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carrx.spring.inaction.aop.service.Performance;

public class TestXml {

	@Test
	public void testXml() {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext(
				"classpath:study/spring/inaction/inActionApplicationContext.xml");
		Performance p = cpxac.getBean("performance", Performance.class);
		try {
			p.perform();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (cpxac != null) {
				cpxac.close();
			}
		}

	}
}
