package org.springframework.mytest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

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

	@Test
	public void xmlBeanFactoryTest2(){
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring.xml"));
		SimpleBean bean = (SimpleBean) bf.getBean("org.springframework.mytest.AutowireBean");
		bean.send();
	}

	@Test
	public void xmlBeanFactoryTest3(){
		XmlBeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring.xml"));
		String[] names = bf.getBeanDefinitionNames();
		for(String name:names){
			BeanDefinition beanDefinition = bf.getBeanDefinition(name);
			System.out.println(beanDefinition);
		}
	}

	@Test
	public void xmlParsingTest() throws IOException, ParserConfigurationException, SAXException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream("spring.xml");
		InputSource inputSource = new InputSource(inputStream);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		// Enforce namespace aware for XSD...
		factory.setNamespaceAware(true);

		DocumentBuilder docBuilder = factory.newDocumentBuilder();
		// 可选，设置实体解析器    自定义去哪里加载xsd/dtd文件
//		docBuilder.setEntityResolver(new EntityResolver());

		docBuilder.setErrorHandler(null);
		//解析xml文件，获取到Document，代表了整个文件
		Document document = docBuilder.parse(inputSource);
		Element root = document.getDocumentElement();

		System.out.println("root is" + root);

		NodeList nodeList = root.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node instanceof Element) {
				Element ele = (Element) node;
				System.out.println("ele:" + ele);
			}
		}
	}
}
