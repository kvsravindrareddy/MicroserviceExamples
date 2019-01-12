package com.ravindra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@GetMapping(value="/test")
	public String hello()
	{
		return "Hello Oauth2";
	}
}