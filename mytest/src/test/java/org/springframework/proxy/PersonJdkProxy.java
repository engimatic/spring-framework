package org.springframework.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-22 下午4:51
 */
public class PersonJdkProxy implements InvocationHandler {
	private Object target;

	public PersonJdkProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}

	// 调用invoke方法之前执行
	private void before() {
		System.out.println(String.format("log start time [%s] ", new Date()));
	}
	// 调用invoke方法之后执行
	private void after() {
		System.out.println(String.format("log end time [%s] ", new Date()));
	}
}
