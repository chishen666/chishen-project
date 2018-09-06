package com.xc.study.framework.spring.inaction.advancedwired.service.impl;

import com.xc.study.framework.spring.inaction.advancedwired.service.DataSourceService;

public class TestDataSourceServiceImpl implements DataSourceService {

	@Override
	public void dataSource() {
		System.out.println("test env db...");
	}

}
