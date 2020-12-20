package org.springframework.mytest;


/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-09 下午4:10
 */
public class ConfigBean2 {
	private ConfigBean1 configBean1;

	public void setConfigBean1(ConfigBean1 configBean1) {
		this.configBean1 = configBean1;
	}

	public void send() {
		configBean1.send();
		System.out.println("I am send method from ConfigBean2!");
	}
}
