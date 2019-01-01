package com.veera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("test")
public class RestControllerTest {
	@RequestMapping(value="serviceone",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="getFallBackMethod")
	public String testService() throws Exception
	{
		String str="";
		if(str.equals(""))
		{
			throw new Exception("");
		}
		return str;
	}
	
	public String getFallBackMethod()
	{
		return "Hystrix Fallback test...";
	}
}