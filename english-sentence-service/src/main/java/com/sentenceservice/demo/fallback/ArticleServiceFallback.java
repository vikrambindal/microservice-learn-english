package com.sentenceservice.demo.fallback;

import org.springframework.stereotype.Component;

import com.sentenceservice.demo.declarativeclients.ArticleServiceProxy;

@Component
public class ArticleServiceFallback implements ArticleServiceProxy {

	@Override
	public String getWord() {
		return "ORANGE:N/A";
	}

}
