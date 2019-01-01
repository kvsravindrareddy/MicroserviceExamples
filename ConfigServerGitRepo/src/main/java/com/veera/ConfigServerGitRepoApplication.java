package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerGitRepoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGitRepoApplication.class, args);
	}
}