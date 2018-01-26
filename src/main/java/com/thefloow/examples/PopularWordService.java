package com.thefloow.examples;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.thefloow.examples.beans.PopularWord;

public interface PopularWordService extends MongoRepository<PopularWord, String> {

    public PopularWord findByWord(String word);
	
}
