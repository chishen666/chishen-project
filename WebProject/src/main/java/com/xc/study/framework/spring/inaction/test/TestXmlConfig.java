package com.xc.study.framework.spring.inaction.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xc.study.framework.spring.inaction.service.CDPlayerService;
import com.xc.study.framework.spring.inaction.service.KnightService;

public class TestXmlConfig {

	@Test
	public void testKnight() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("study/inActionApplicationContext.xml");

		KnightService ks = ac.getBean("knightService", KnightService.class);
		ks.embarkOneQuest();

		CDPlayerService cdps = ac.getBean("cdPlayerService", CDPlayerService.class);
		cdps.play();
		cdps.drive();
		ac.close();

	}
}
