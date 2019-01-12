package com.ravindra.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncoderConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    public static void main(String[] args) {
    	BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
    	System.out.println(encode.matches("kvsrr", "$2a$10$2ZfHMLNAQKKsk7Rd9i.ZpOMJfF4jsicOE1u2iSSZiTesHxNy6Tazq"));
    	//System.out.println(encode.encode("kvsrr"));
	}
}