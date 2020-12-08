package org.springframework.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

	@Test
	public void classPathXml2(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		SimpleBean bean = (SimpleBean) bf.getBean("org.springframework.mytest.AutowireBean");
		bean.send();
	}

	@Test
	public void xmlBeanFactoryTest3(){
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		String[] names = bf.getBeanDefinitionNames();
		for(String name:names){
			BeanDefinition beanDefinition = bf.getBeanFactory().getBeanDefinition(name);
			System.out.println(beanDefinition);
		}
	}

}
