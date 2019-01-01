package com.veera.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
@Component
public class EmployeeConsumer {
	@Autowired
	private LoadBalancerClient loadBalancerClient;	

	public void testEmployeeConsumer()
	{
		ServiceInstance instance = loadBalancerClient.choose("EmpProducer");
		String uri = instance.getUri().toString();
		uri = uri+"/EmpProducer/producerwithms/getservice";
		System.out.println(uri);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		response = restTemplate.exchange(uri, HttpMethod.GET, getHeaders(), String.class);
		System.out.println(response.getBody());
	}
	
	private static HttpEntity<?> getHeaders()
	{
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}