package com.xc.study.framework.spring.inaction.beanwired.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.study.framework.spring.inaction.beanwired.config.SpringMainConfig;
import com.xc.study.framework.spring.inaction.beanwired.service.CDPlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMainConfig.class)
public class TestJavaConfig {

	@Autowired
	private CDPlayerService cdps;

	@Test
	public void testCompactDisc() {
		cdps.play();
		cdps.drive();
	}
}
