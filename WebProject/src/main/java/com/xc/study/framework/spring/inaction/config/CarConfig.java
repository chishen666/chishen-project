package com.xc.study.framework.spring.inaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xc.study.framework.spring.inaction.service.CarService;
import com.xc.study.framework.spring.inaction.service.impl.CarServiceImpl;

/**
 * Car的java显示配置
 * @author SEELE
 *
 */
@Configuration
public class CarConfig {

	@Bean("carService")
	public CarService carService() {
		return new CarServiceImpl();
	}
}
