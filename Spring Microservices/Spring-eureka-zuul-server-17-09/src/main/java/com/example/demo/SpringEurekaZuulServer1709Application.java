package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringEurekaZuulServer1709Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaZuulServer1709Application.class, args);
	}

}
