package org.springframework.mytest;


/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-04 下午1:47
 */
public class SimpleBean2 {

	private SimpleBean simpleBean;

	public void send() {
		simpleBean.send();
		System.out.println("I am send method from SimpleBean2!");
	}

	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}
}
