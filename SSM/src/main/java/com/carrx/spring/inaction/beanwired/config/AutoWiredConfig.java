package com.carrx.spring.inaction.beanwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 自动装配扫描配置
 * @author SEELE
 *
 */
@Configuration
@ComponentScan({ "com.xc.study.framework.spring.inaction.beanwired.service",
		"com.xc.study.framework.spring.inaction.advancedwired.service" })
@PropertySource("classpath:/study/spring/inaction/expression-config.properties")
public class AutoWiredConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();

	}
}
