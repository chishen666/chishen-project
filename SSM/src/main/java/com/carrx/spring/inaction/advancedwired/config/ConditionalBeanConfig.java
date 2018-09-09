package com.carrx.spring.inaction.advancedwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.carrx.spring.inaction.advancedwired.condition.BeanCondition;
import com.carrx.spring.inaction.advancedwired.service.impl.ConditionalBean;


@Configuration
@Profile("dev")
public class ConditionalBeanConfig {

	@Bean
	@Conditional(BeanCondition.class)
	public ConditionalBean conditionalBean() {
		return new ConditionalBean();
	}
}
