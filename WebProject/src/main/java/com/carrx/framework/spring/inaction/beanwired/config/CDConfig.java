package com.xc.study.framework.spring.inaction.beanwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xc.study.framework.spring.inaction.beanwired.service.CDService;
import com.xc.study.framework.spring.inaction.beanwired.service.impl.CDServiceImpl;

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
