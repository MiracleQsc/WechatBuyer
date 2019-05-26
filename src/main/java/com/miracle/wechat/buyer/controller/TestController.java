package com.miracle.wechat.buyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Test")
public class TestController {

	
	@RequestMapping("/Hello")
	public String TestHello(){
		return "test/hello";
	}
}
