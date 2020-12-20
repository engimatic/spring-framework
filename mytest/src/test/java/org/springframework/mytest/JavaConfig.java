package org.springframework.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2020-12-20 20:34:17
 */
@Configuration
@ComponentScan("org.springframework.scantest")
public class JavaConfig {

	@Bean
	public ConfigBean1 configBean1(){
		return new ConfigBean1();
	}

	@Bean
	public ConfigBean2 configBean2(){
		ConfigBean2 configBean2 =  new ConfigBean2();
		configBean2.setConfigBean1(configBean1());
		return configBean2;
	}
}
