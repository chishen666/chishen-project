package com.carrx.spring.inaction.beanwired.service.impl;

import java.io.PrintStream;

import com.carrx.spring.inaction.beanwired.service.RequestService;

public class SlayDragonRequestServiceImpl implements RequestService {

	private PrintStream printStream;

	public SlayDragonRequestServiceImpl(PrintStream printStream) {
		this.printStream = printStream;
	}

	@Override
	public void embark() {
		printStream.println("Embarking on quest to slay the dragon!");
	}
}
