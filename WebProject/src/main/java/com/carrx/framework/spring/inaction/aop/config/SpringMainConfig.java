package com.xc.study.framework.spring.inaction.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "com.xc.study.framework.spring.inaction.aop.advice",
		"com.xc.study.framework.spring.inaction.aop.service" })
@EnableAspectJAutoProxy
public class SpringMainConfig {

}
