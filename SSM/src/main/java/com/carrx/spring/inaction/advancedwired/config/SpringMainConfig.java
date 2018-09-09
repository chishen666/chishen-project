package com.carrx.spring.inaction.advancedwired.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ DevDSConfig.class, TestDSConfig.class, ConditionalBeanConfig.class })
public class SpringMainConfig {

}
