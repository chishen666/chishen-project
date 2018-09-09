package com.carrx.spring.inaction.advancedwired.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.carrx.spring.inaction.advancedwired.config.SpringMainConfig;
import com.carrx.spring.inaction.advancedwired.service.DataSourceService;
import com.carrx.spring.inaction.advancedwired.service.impl.ConditionalBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMainConfig.class)
@ActiveProfiles("dev")
public class TestDS {

	@Autowired
	private DataSourceService dataSourceService;

	@Autowired
	private ConditionalBean conditionalBean;

	@Test
	public void testDS() {
		dataSourceService.dataSource();
		conditionalBean.test();
	}

}
