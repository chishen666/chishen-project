package com.xc.study.framework.spring.inaction.service.impl;

import org.springframework.stereotype.Component;

import com.xc.study.framework.spring.inaction.service.CarService;

@Component
public class CarServiceImpl implements CarService {

	private String name = "BMW";

	private String color = "black";

	@Override
	public void drive() {
		System.out.println("Driving " + name + " color " + color);
	}

}
