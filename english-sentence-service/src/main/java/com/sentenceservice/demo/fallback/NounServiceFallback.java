package com.sentenceservice.demo.fallback;

import org.springframework.stereotype.Component;

import com.sentenceservice.demo.declarativeclients.NounServiceProxy;

@Component
public class NounServiceFallback implements NounServiceProxy {

	@Override
	public String getWord() {
		return "BALL:N/A";
	}

}
