package org.springframework.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-11-30 22:38:41
 */
public class ClassPathXmlApplicationTest {

	@Test
	public void classPathXml(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		SimpleBean bean = (SimpleBean) bf.getBean("org.springframework.mytest.SimpleBean");
		bean.send();
	}
}
