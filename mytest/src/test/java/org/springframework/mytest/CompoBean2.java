package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-09 下午4:10
 */
@Service
public class CompoBean2 {

	@Autowired
	private CompoBean1 compoBean1;

	public void send() {
		compoBean1.send();
		System.out.println("I am send method from CompoBean2!");
	}
}
