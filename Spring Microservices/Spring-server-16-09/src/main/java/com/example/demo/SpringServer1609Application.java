package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringServer1609Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringServer1609Application.class, args);
	}

}
