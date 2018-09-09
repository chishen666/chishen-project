package com.carrx.spring.inaction.aop.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.carrx.spring.inaction.aop.advice.Audience;
import com.carrx.spring.inaction.aop.config.SpringMainConfig;
import com.carrx.spring.inaction.aop.service.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMainConfig.class)
public class TestAutowired {

	@Autowired
	private Performance p;

	@Autowired
	private Audience a;

	@Test
	public void testCompactDisc() {
		// try {
		// p.perform();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		p.play(1);
		p.play(1);
		p.play(2);

		assertEquals(1, a.getCount(1));
	}
}
