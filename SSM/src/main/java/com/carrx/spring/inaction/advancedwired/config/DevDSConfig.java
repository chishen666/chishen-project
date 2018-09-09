package com.carrx.spring.inaction.advancedwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.carrx.spring.inaction.advancedwired.service.DataSourceService;
import com.carrx.spring.inaction.advancedwired.service.impl.DevDataSourceServiceImpl;

@Configuration
@Profile("dev")
public class DevDSConfig {

	@Bean
	public DataSourceService dataSourceService() {
		return new DevDataSourceServiceImpl();
	}
}
