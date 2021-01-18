package org.springframework.mytest;

import org.junit.Test;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.support.XmlWebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2021-01-18 21:46:13
 */
public class WebXmlTest {

	@Test
	public void webXmlTest() throws Exception {
		MockServletContext mockServletContext = new MockServletContext();
		mockServletContext.setMajorVersion(2);
		mockServletContext.setMinorVersion(4);
		mockServletContext.setContextPath("");
		XmlWebApplicationContext wac = new XmlWebApplicationContext();
//		wac.setServletContext(mockServletContext);
		wac.setConfigLocation("classpath*:spring3.xml");

		wac.refresh();
		MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		mockMvc.perform(get("/api/hello"))
				.andExpect(status().isOk())
				.andDo(print());

	}
}
