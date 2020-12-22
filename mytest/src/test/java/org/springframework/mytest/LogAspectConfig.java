package org.springframework.mytest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-21 20:53:10
 */
@Component
public class LogAspectConfig {

	public void before(JoinPoint joinPoint){
		System.out.println("LogAspectConfig before!");
	}

	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		joinPoint.proceed();
		System.out.println("LogAspectConfig around!Cost " + (System.currentTimeMillis() - start));
	}

	public void after(){
		System.out.println("LogAspectConfig after!");
	}

}
