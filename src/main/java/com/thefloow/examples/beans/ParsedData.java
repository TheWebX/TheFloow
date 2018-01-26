package com.thefloow.examples.beans;

import java.util.List;

public class ParsedData {

	private List<CollectedWord> words;

	public ParsedData() {
		super();
	}

	public ParsedData(List<CollectedWord> words) {
		super();
		this.words = words;
	}

	public List<CollectedWord> getWords() {
		return words;
	}

	public void setWords(List<CollectedWord> words) {
		this.words = words;
	}
	
}
