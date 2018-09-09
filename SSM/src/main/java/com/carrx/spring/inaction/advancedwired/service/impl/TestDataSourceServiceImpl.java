package com.carrx.spring.inaction.advancedwired.service.impl;

import com.carrx.spring.inaction.advancedwired.service.DataSourceService;

public class TestDataSourceServiceImpl implements DataSourceService {

	@Override
	public void dataSource() {
		System.out.println("test env db...");
	}

}
