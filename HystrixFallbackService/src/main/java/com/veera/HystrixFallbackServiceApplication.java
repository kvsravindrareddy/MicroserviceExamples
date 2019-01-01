package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixFallbackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixFallbackServiceApplication.class, args);
	}
}