package org.springframework.mytest;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-10 21:28:48
 */
public class MyFactoryBean {
	public SimpleBean createSimpleBean(){
		return new SimpleBean();
	}
}
