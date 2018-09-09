package com.carrx.spring.inaction.beanwired.test.xmlconfig;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carrx.spring.inaction.advancedwired.service.impl.BlankDisc;

public class TestXmlConfig {

	@Test
	public void testKnight() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				"study/spring/inaction/inActionApplicationContext.xml");

		// KnightService ks = ac.getBean("knightService", KnightService.class);
		// ks.embarkOneQuest();
		//
		// CDPlayerService cdps = ac.getBean("cdPlayerService", CDPlayerService.class);
		// cdps.play();
		// cdps.drive();

		BlankDisc bd = ac.getBean("blankDisc", BlankDisc.class);
		bd.printf();
		ac.close();

	}
}
