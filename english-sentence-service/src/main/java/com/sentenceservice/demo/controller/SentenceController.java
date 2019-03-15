package com.sentenceservice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sentenceservice.demo.declarativeclients.AdjectiveServiceProxy;
import com.sentenceservice.demo.declarativeclients.ArticleServiceProxy;
import com.sentenceservice.demo.declarativeclients.NounServiceProxy;
import com.sentenceservice.demo.declarativeclients.SubjectServiceProxy;
import com.sentenceservice.demo.declarativeclients.VerbServiceProxy;

@RestController
public class SentenceController {

	@Autowired private VerbServiceProxy verbService;
	@Autowired private ArticleServiceProxy articleService;
	@Autowired private AdjectiveServiceProxy adjectiveService;
	@Autowired private SubjectServiceProxy subjectService;
	@Autowired private NounServiceProxy nounService;
	
	@GetMapping("/sentence")
	public String getSentence(@RequestParam(defaultValue="false", required=false) boolean serverInfo) {
		
		String[] verb = verbService.getWord().split(":");
		String[] adjective = adjectiveService.getWord().split(":");
		String[] noun = nounService.getWord().split(":");
		String[] subject = subjectService.getWord().split(":");
		String[] article = articleService.getWord().split(":");
		
		String sentence = subject[0] + " " + verb[0] + " " + article[0] + " " + adjective[0] + " " + noun[0];
		
		if (serverInfo) {
			sentence += "\n\n" +
				"Verb : " + verb[1] + "\n" + 
				"Adjective : " + adjective[1] + "\n" +
				"Subject : " + subject[1] + "\n" +
				"Noun : " + noun[1] + "\n" +
				"Article : " + article[1];
		}
		return sentence;
		
	}
}
