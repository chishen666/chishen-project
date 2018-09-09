package com.carrx.spring.inaction.advancedwired.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.carrx.spring.inaction.advancedwired.service.Dessert;

@Component
@Primary
public class Cookie implements Dessert {

	@Override
	public void eat() {
		System.out.println("cookie is yummy");
	}

}
