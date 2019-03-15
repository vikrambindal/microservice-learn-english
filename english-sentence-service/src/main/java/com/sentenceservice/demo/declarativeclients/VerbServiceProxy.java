package com.sentenceservice.demo.declarativeclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sentenceservice.demo.fallback.VerbServiceFallback;

@FeignClient(name = "verb", fallback = VerbServiceFallback.class)
public interface VerbServiceProxy {

	@GetMapping("/word")
	String getWord();
}
