package com.carrx.spring.inaction.beanwired.test.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.carrx.spring.inaction.advancedwired.service.impl.BlankDisc;
import com.carrx.spring.inaction.beanwired.config.AutoWiredConfig;
import com.carrx.spring.inaction.beanwired.service.CDPlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoWiredConfig.class)
public class TestAutowired {

	@Autowired
	private CDPlayerService cdps;

	@Autowired
	private BlankDisc bd;

	@Test
	public void testCompactDisc() {
		cdps.play();
		cdps.drive();

		bd.printf();
	}
}
