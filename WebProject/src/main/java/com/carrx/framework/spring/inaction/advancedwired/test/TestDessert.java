package com.xc.study.framework.spring.inaction.advancedwired.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.study.framework.spring.inaction.advancedwired.config.DessertConfig;
import com.xc.study.framework.spring.inaction.advancedwired.service.Dessert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class TestDessert {

	@Qualifier("cakecake")
	@Autowired
	private Dessert dessert;

	@Test
	public void testDessert() {
		dessert.eat();
	}

}
