package com.sentenceservice.demo.fallback;

import org.springframework.stereotype.Component;

import com.sentenceservice.demo.declarativeclients.SubjectServiceProxy;

@Component
public class SubjectServceiFallback implements SubjectServiceProxy {

	@Override
	public String getWord() {
		return "THEY:N/A";
	}

}
