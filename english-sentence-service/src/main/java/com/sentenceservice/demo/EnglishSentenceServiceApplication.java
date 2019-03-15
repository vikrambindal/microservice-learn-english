package com.sentenceservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class EnglishSentenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishSentenceServiceApplication.class, args);
	}
}

