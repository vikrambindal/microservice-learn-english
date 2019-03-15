package com.entityservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EnglishEntityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishEntityServiceApplication.class, args);
	}

}

