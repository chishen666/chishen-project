package com.xc.study.framework.spring.inaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配扫描配置
 * @author SEELE
 *
 */
@Configuration
@ComponentScan("com.xc.study.framework.spring.inaction.service")
public class AutoWiredConfig {

}
