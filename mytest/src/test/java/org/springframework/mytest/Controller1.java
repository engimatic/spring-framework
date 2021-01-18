package org.springframework.mytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2021-01-18 22:10:42
 */
@RestController
@RequestMapping("/api")
public class Controller1 {
	@GetMapping("/hello")
	public String hello(){
		return "hello world";
	}
}
