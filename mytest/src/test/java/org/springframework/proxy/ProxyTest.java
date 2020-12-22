package org.springframework.proxy;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-22 下午5:00
 */
public class ProxyTest {
	@Test
	public void jdkTest(){
		Person person = new WorkingPerson();
		PersonJdkProxy jdkProxy = new PersonJdkProxy(person);
		Person proxyPerson = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), jdkProxy);
		proxyPerson.doThings();
	}

	@Test
	public void cglibTest(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EatingPerson.class);
		enhancer.setCallback(new CglibInterceptor());
		EatingPerson person = (EatingPerson) enhancer.create();
		person.doThings();
	}
}
