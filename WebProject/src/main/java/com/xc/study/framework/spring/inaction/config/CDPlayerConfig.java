package com.xc.study.framework.spring.inaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.xc.study.framework.spring.inaction.service.CDPlayerService;
import com.xc.study.framework.spring.inaction.service.CDService;
import com.xc.study.framework.spring.inaction.service.CarService;
import com.xc.study.framework.spring.inaction.service.impl.CDPlayerServiceImpl;

/**
 * CD Player的java显示配置
 * @author SEELE
 *
 */
@Configuration
@ImportResource("classpath:study/car-config.xml")
public class CDPlayerConfig {

	@Bean
	public CDPlayerService cdPlayerService(CDService cdService, CarService carService) {
		return new CDPlayerServiceImpl(cdService, carService);
	}
}
