package com.xc.study.framework.spring.inaction.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * spring的主java显示配置
 * @author SEELE
 *
 */
@Configuration
@Import({ CDConfig.class, CDPlayerConfig.class })
public class SpringMainConfig {

}
