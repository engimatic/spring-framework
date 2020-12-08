package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-04 下午1:47
 */
public class AutowireBean {

	@Autowired
	private SimpleBean simpleBean;

	public void send() {
		System.out.println("I am send method from SimpleBean!");
		simpleBean.send();
	}
}
