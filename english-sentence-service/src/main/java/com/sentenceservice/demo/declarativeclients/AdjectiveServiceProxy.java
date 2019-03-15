package com.sentenceservice.demo.declarativeclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sentenceservice.demo.fallback.AdjectiveServiceFallback;

@FeignClient(name = "adjective", fallback = AdjectiveServiceFallback.class)
public interface AdjectiveServiceProxy {

	@GetMapping("/word")
	String getWord();
}
