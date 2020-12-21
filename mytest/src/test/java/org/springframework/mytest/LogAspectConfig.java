package org.springframework.mytest;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-21 20:53:10
 */
@Component
public class LogAspectConfig {

	public void before(){
		System.out.println("LogAspectConfig before!");
	}

	public void around(){
		System.out.println("LogAspectConfig around!");
	}

	public void after(){
		System.out.println("LogAspectConfig atfer!");
	}

}
