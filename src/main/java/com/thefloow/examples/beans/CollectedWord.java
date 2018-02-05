package com.thefloow.examples.beans;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "com.thefloow.examples.beans.CollectedWord")
@CompoundIndexes({ @CompoundIndex(name = "word_1", def = "{'word': 1}")})
public class CollectedWord {

    @Indexed(direction = IndexDirection.ASCENDING)
	private String word;
	private Integer hits;
	private Double offset;

    @PersistenceConstructor
	public CollectedWord(String word, Integer hits, Double offset) {
		super();
		this.word = word;
		this.hits = hits;
		this.offset = offset;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Double getOffset() {
		return offset;
	}

	public void setOffset(Double offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "CollectedWord [word=" + word + ", hits=" + hits + "]";
	}
}
