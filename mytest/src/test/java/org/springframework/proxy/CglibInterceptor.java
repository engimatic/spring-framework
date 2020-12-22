package org.springframework.proxy;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-22 下午5:11
 */
public class CglibInterceptor implements MethodInterceptor {


	// 调用invoke方法之前执行
	private void before() {
		System.out.println(String.format("log start time [%s] ", new Date()));
	}
	// 调用invoke方法之后执行
	private void after() {
		System.out.println(String.format("log end time [%s] ", new Date()));
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		before();
		Object result = methodProxy.invokeSuper(obj, args);
		after();
		return result;
	}
}
