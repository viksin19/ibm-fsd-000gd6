package com.example.demo.entity;

public class Word {

	public String word;

	public Word(String word) {
		super();
		this.word = word;
	}

	public Word() {
		super();
	}

	public String getWord() {
		return word;
	}
	public String getString() {
		return getWord();
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
}
