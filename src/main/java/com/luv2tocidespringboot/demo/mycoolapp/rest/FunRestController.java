package com.luv2tocidespringboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expose "/" Hello World
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!!";
	}
}