package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.veera.consumer.EmployeeConsumer;

@SpringBootApplication
@EnableEurekaClient
public class EmpConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmpConsumerApplication.class, args);
		EmployeeConsumer empConsumer = (EmployeeConsumer)context.getBean(EmployeeConsumer.class);
		empConsumer.testEmployeeConsumer();
	}
}