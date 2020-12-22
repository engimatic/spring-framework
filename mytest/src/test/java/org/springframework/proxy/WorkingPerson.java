package org.springframework.proxy;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-22 下午4:50
 */
public class WorkingPerson implements Person {
	@Override
	public void doThings() {
		System.out.println("打工人！");
	}
}
