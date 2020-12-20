package org.springframework.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scantest.ConfigBean4;

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
		SimpleBean2 bean = (SimpleBean2) bf.getBean("org.springframework.mytest.SimpleBean2");
		bean.send();
	}

	@Test
	public void classPathXml3(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring1.xml");
		AutowireBean bean = (AutowireBean) bf.getBean("autowireBean");
		bean.send();
	}

	@Test
	public void classPathXml4(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring2.xml");
		CompoBean1 bean = (CompoBean1) bf.getBean("compoBean1");
		bean.send();
	}

	@Test
	public void classPathXml5(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring2.xml");
		CompoBean2 bean = (CompoBean2) bf.getBean("compoBean2");
		bean.send();
	}

	@Test
	public void classPathXml6(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		CompoBean1 bean = (CompoBean1) bf.getBean("compoBean1");
		bean.send();
	}

	@Test
	public void classPathXml7(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
		CompoBean2 bean = (CompoBean2) bf.getBean("compoBean2");
		bean.send();
	}

	@Test
	public void classPathXml8(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring2.xml");
		ConfigBean2 bean = (ConfigBean2) bf.getBean("configBean2");
		bean.send();
	}

	@Test
	public void classPathXml9(){
		BeanFactory bf = new ClassPathXmlApplicationContext("spring2.xml");
		ConfigBean4 bean = (ConfigBean4) bf.getBean("configBean4");
		bean.send();
	}

	@Test
	public void classPathXmlApplicationContextTest(){
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		String[] names = bf.getBeanDefinitionNames();
		for(String name:names){
			BeanDefinition beanDefinition = bf.getBeanFactory().getBeanDefinition(name);
			System.out.println(beanDefinition);
		}
	}

}
