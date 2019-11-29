/*
 * Copyright (C), 2011-2019.
 */
package com.wung.springbootstarter.example;

import com.wung.springbootstarter.helloword.HellowordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wung 2019-11-28.
 */
@RestController
public class HellowordController {
	
	@Autowired
	private HellowordService hellowordService;
	
	
	@GetMapping("/")
	public String sayHello() {
		return hellowordService.sayHello();
	}
	
}
