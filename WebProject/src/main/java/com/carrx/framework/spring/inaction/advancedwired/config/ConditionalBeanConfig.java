package com.xc.study.framework.spring.inaction.advancedwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.xc.study.framework.spring.inaction.advancedwired.condition.BeanCondition;
import com.xc.study.framework.spring.inaction.advancedwired.service.impl.ConditionalBean;

@Configuration
@Profile("dev")
public class ConditionalBeanConfig {

	@Bean
	@Conditional(BeanCondition.class)
	public ConditionalBean conditionalBean() {
		return new ConditionalBean();
	}
}
