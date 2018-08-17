package com.xc.study.framework.spring.inaction.beanwired.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配扫描配置
 * @author SEELE
 *
 */
@Configuration
@ComponentScan("com.xc.study.framework.spring.inaction.beanwired.service")
public class AutoWiredConfig {

}
