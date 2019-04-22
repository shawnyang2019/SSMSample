package com.yx.ssmsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/welcome") // welcome要访问的url地址
	public String hello() {
		System.out.println("hello,springmvc");
		return "hello"; // hello是逻辑视图名,和后缀名组合一起构成视图名 /web-inf/jsp/hello.jsp
	}

	@RequestMapping(value = "/welcome2") // welcome要访问的url地址
	public String hello2(@RequestParam(value = "username", required = false) String uname) {
		// 此时方法参数value="username"与传来参数名称一致,required=false不传参uname为null
		// required=false不传参出错
		System.out.println("hello,springmvc" + uname);
		return "hello"; // hello是逻辑视图名,和后缀名组合一起构成视图名 /web-inf/jsp/hello.jsp
	}

}
