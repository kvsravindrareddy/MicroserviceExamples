package com.veera.consumer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
@Component("restconsumer")
public class RestConsumer {
	
	public void consumeYahooFinance()
	{
		String uri = "https://enclout-yahoo-finance.p.mashape.com/show.json";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		response = restTemplate.exchange(uri, HttpMethod.GET, getHeaders(), String.class);
		System.out.println(response.getBody());
	}
	
	private static HttpEntity<?> getHeaders()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "re7DhVYUfrmshMSnBiDINR91oyy3p1gUXE7jsn2yOCZtovQ6Ck");
		headers.set("Accept", "application/json");
		return new HttpEntity<>(headers);
	}
}