package org.springframework.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-11-30 下午3:09
 */
public class MyXmlBeanFactoryTest {
	@Test
	public void xmlBeanFactoryTest(){
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring.xml"));
		SimpleBean bean = (SimpleBean) bf.getBean("org.springframework.mytest.SimpleBean");
		bean.send();
	}
}
