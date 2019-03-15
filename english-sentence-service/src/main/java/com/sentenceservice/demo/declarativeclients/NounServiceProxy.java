package com.sentenceservice.demo.declarativeclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sentenceservice.demo.fallback.NounServiceFallback;

@FeignClient(name = "noun", fallback = NounServiceFallback.class)
public interface NounServiceProxy {

	@GetMapping("/word")
	String getWord();
}
