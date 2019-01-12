package com.ravindra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerRestController {
	
	@GetMapping(value="/producer")
	public String hello()
	{
		return "Hello Producer";
	}
}