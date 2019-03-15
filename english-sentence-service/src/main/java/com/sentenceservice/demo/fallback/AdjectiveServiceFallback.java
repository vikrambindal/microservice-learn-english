package com.sentenceservice.demo.fallback;

import org.springframework.stereotype.Component;

import com.sentenceservice.demo.declarativeclients.AdjectiveServiceProxy;

@Component
public class AdjectiveServiceFallback implements AdjectiveServiceProxy {

	@Override
	public String getWord() {
		return "GLAMOROUS:N/A";
	}
}
