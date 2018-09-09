package com.carrx.spring.inaction.beanwired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.carrx.spring.inaction.beanwired.service.CDPlayerService;
import com.carrx.spring.inaction.beanwired.service.CDService;
import com.carrx.spring.inaction.beanwired.service.CarService;
import com.carrx.spring.inaction.beanwired.service.impl.CDPlayerServiceImpl;

/**
 * CD Player的java显示配置
 * @author SEELE
 *
 */
@Configuration
@ImportResource("classpath:study/spring/inaction/car-config.xml")
public class CDPlayerConfig {

	@Bean
	public CDPlayerService cdPlayerService(CDService cdService, CarService carService) {
		return new CDPlayerServiceImpl(cdService, carService);
	}
}
