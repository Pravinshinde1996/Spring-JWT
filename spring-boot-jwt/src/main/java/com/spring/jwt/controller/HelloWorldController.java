package com.spring.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String helloPage() {
		return "Hello World";
	}
	
	
}
