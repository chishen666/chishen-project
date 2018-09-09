package com.carrx.spring.inaction.beanwired.service.impl;

import org.springframework.stereotype.Component;

import com.carrx.spring.inaction.beanwired.service.CDService;

@Component
public class CDServiceImpl implements CDService {

	private String title = "再不疯狂我们就老了";

	private String artist = "春哥";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
