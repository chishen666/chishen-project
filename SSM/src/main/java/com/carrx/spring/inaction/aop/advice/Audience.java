package com.carrx.spring.inaction.aop.advice;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	private Map<Integer, Integer> numMap = new HashMap<>();

	@Pointcut("execution(* com.xc.study.framework.spring.inaction.aop.service.Performance.perform(..))")
	public void audience() {

	}

	@Pointcut("execution(* com.xc.study.framework.spring.inaction.aop.service.Performance.play(int)) && args(num)")
	public void audience1(int num) {

	}

	// @Before("audience()")
	// public void before() {
	// System.out.println("before...");
	// }
	//
	// @After("audience()")
	// public void after() {
	// System.out.println("after...");
	// }
	//
	// @AfterReturning("audience()")
	// public void afterReturning() {
	// System.out.println("afterReturning...");
	// }
	//
	// @AfterThrowing("audience()")
	// public void afterThrowing() {
	// System.out.println("afterThrowing...");
	// }

	@Around("audience()")
	public void around(ProceedingJoinPoint pjp) {
		try {
			System.out.println("around before...");
			pjp.proceed();
			System.out.println("around after...");
		} catch (Throwable e) {
			System.out.println("around exception...");
			e.printStackTrace();
		}
	}

	@Before("audience1(num)")
	public void before1(int num) {
		int count = getCount(num);
		numMap.put(num, ++count);
	}

	public int getCount(int num) {
		return numMap.containsKey(num) ? numMap.get(num) : 0;
	}

}
