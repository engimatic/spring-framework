package org.springframework.mytest;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-09 下午4:10
 */
@Component
public class CompoBean1 {
	public void send() {
		System.out.println("I am send method from CompoBean1!");
	}
}
