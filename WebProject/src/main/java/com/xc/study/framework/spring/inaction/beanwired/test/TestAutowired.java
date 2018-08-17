package com.xc.study.framework.spring.inaction.beanwired.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.study.framework.spring.inaction.beanwired.config.AutoWiredConfig;
import com.xc.study.framework.spring.inaction.beanwired.service.CDPlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoWiredConfig.class)
public class TestAutowired {

	@Autowired
	private CDPlayerService cdps;

	@Test
	public void testCompactDisc() {
		cdps.play();
		cdps.drive();
	}
}