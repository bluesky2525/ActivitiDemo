package com.hongToo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ActiviDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiviDemoApplication.class, args);
	}
}
