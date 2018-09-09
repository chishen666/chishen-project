package com.carrx.spring.inaction.beanwired.test.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.carrx.spring.inaction.advancedwired.config.ExpressionConfig;
import com.carrx.spring.inaction.advancedwired.service.impl.BlankDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressionConfig.class)
public class TestExpressionConfig {

	@Autowired
	private BlankDisc blankDisc;

	@Test
	public void testExpressionConfig() {
		blankDisc.printf();
	}
}
