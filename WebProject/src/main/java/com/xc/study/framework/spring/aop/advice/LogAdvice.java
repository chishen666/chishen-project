package com.xc.study.framework.spring.aop.advice;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *	日志通知
 */
public class LogAdvice {

	public void logBefore(JoinPoint jp) {
		System.out.println(new Date() + " ----> before");
	}

	public void logAfter(JoinPoint jp) {
		System.out.println(new Date() + " ----> after");
	}

	public void logReturning(JoinPoint jp) {
		System.out.println(new Date() + " ----> returning");
	}

	public void logThrowing(JoinPoint jp) {
		System.out.println(new Date() + " ----> throwing");
	}

	public void logAround(ProceedingJoinPoint pjp) {
		System.out.println(new Date() + " ----> around1");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new Date() + " ----> around2");
	}
}
