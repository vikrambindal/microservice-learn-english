package com.entityservice.demo.controller;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

	@Value("${words}") private String words;
	@Value("${server.port}") private String port;
	
	@GetMapping("/words")
	public String getWords() {
		return "words: " + words + ", port: " + port;
	}
	
	@GetMapping("/word")
	public String getWord() {
		
		String[] totalWords = words.split(",");
		Random rand = new Random();
		int randomNumber = rand.nextInt(totalWords.length);
		return words.split(",")[randomNumber] + ":" + port;
	}
}
