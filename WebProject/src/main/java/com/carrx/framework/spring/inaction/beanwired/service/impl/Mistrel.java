package com.xc.study.framework.spring.inaction.beanwired.service.impl;

import java.io.PrintStream;

public class Mistrel {

	private PrintStream printStream;

	public Mistrel(PrintStream printStream) {
		this.printStream = printStream;
	}

	public void singBeforeQuest() {
		printStream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		printStream.println("Tee hee hee, the knight did embark on a quest!");
	}
}
