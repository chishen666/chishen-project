package com.xc.study.framework.spring.inaction.aop.service.impl;

import org.springframework.stereotype.Component;

import com.xc.study.framework.spring.inaction.aop.service.Performance;

@Component
public class Movie implements Performance {

	@Override
	public void perform() throws Exception {
		System.out.println("演一场电影...");
		throw new Exception();
	}

	@Override
	public void play(int num) {

	}

}
