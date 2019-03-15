package com.sentenceservice.demo.fallback;

import org.springframework.stereotype.Component;

import com.sentenceservice.demo.declarativeclients.VerbServiceProxy;

@Component
public class VerbServiceFallback implements VerbServiceProxy {

	@Override
	public String getWord() {
		return "HEAR:N/A";
	}

}
