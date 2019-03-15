package com.sentenceservice.demo.declarativeclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sentenceservice.demo.fallback.SubjectServceiFallback;

@FeignClient(name = "subject", fallback = SubjectServceiFallback.class)
public interface SubjectServiceProxy {
	
	@GetMapping("/word")
	String getWord();
}
