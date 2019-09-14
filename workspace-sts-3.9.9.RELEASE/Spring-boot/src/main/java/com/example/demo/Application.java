package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan(basePackages = "com.example.demo")
@EnableAutoConfiguration
@EnableTransactionManagement

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
