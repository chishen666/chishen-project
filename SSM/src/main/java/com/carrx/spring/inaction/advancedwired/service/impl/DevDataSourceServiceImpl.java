package com.carrx.spring.inaction.advancedwired.service.impl;

import com.carrx.spring.inaction.advancedwired.service.DataSourceService;

public class DevDataSourceServiceImpl implements DataSourceService {

	@Override
	public void dataSource() {
		System.out.println("dev env db...");
	}

}
