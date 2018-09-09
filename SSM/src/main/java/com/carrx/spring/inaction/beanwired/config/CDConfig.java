package com.carrx.spring.inaction.beanwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carrx.spring.inaction.beanwired.service.CDService;
import com.carrx.spring.inaction.beanwired.service.impl.CDServiceImpl;

/**
 * CD的java显示配置
 * @author SEELE
 *
 */
@Configuration
public class CDConfig {

	@Bean
	public CDService compactDiscService() {
		return new CDServiceImpl();
	}
}
