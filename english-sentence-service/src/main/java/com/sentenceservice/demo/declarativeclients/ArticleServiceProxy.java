package com.sentenceservice.demo.declarativeclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sentenceservice.demo.fallback.ArticleServiceFallback;

@FeignClient(name = "article", fallback = ArticleServiceFallback.class)
public interface ArticleServiceProxy {

	@GetMapping("/word")
	String getWord();
}
