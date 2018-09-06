package com.xc.study.framework.spring.inaction.advancedwired.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.xc.study.framework.spring.inaction.advancedwired.service.impl.BlankDisc;

@Configuration
@PropertySource("classpath:/study/spring/inaction/expression-config.properties")
public class ExpressionConfig {

	@Autowired
	private Environment env;

	@Bean
	public BlankDisc blankDisc() {
		return new BlankDisc(env.getProperty("title"), env.getProperty("artist"));

	}
}
