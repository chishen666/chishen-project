package com.xc.study.framework.designpattern.singleton;

public class SingletonHungry {

	private static final SingletonHungry instance = new SingletonHungry();

	private SingletonHungry() {
	}

	public static SingletonHungry getInstance() {
		return instance;
	}
}
