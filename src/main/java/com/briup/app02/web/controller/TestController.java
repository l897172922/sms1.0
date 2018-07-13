package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//路由的命名空间
@RestController
@RequestMapping("/test")
public class TestController {
	/*http://localhost:8080/test/hello*/
	@GetMapping("zero")
	public String zero(){
		return "hhhhhhhhhhhhhello";
	}
	@GetMapping("one")
	public  String one(){
		return "0.0.0.0.0";
	}
}
