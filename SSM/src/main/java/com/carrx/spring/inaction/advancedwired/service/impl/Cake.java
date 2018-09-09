package com.carrx.spring.inaction.advancedwired.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.carrx.spring.inaction.advancedwired.service.Dessert;

@Component
@Qualifier("cakecake")
public class Cake implements Dessert {

	@Override
	public void eat() {
		System.out.println("cake is delicious.");
	}

}
