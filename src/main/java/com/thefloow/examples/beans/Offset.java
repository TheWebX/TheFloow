package com.thefloow.examples.beans;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "com.thefloow.examples.beans.Offset")
@CompoundIndexes({ @CompoundIndex(name = "value_1", def = "{'value': 1}")})
public class Offset {

    @Indexed(direction = IndexDirection.ASCENDING)
	private String fileName;
	private Double value;
	
    @PersistenceConstructor
	public Offset(String fileName, Double value) {
		super();
		this.fileName = fileName;
		this.value = value;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
