package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

	private Random random = new Random();
	
	@Value("${words}")
	String[] words;
	
	@GetMapping("/")
	public Word getword() {
		return new Word(words[random.nextInt(words.length)]);
	}
	
}
