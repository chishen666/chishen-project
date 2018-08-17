package com.xc.study.framework.spring.inaction.beanwired.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xc.study.framework.spring.inaction.beanwired.service.CDPlayerService;
import com.xc.study.framework.spring.inaction.beanwired.service.CDService;
import com.xc.study.framework.spring.inaction.beanwired.service.CarService;

@Component
public class CDPlayerServiceImpl implements CDPlayerService {

	@Autowired
	private CDService cdService;

	@Autowired
	private CarService carService;

	public CDPlayerServiceImpl() {
	}

	public CDPlayerServiceImpl(CDService cdService, CarService carService) {
		this.cdService = cdService;
		this.carService = carService;
	}

	@Override
	public void play() {
		cdService.play();
	}

	@Override
	public void drive() {
		carService.drive();
	}

}
