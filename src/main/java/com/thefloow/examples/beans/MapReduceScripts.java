package com.thefloow.examples.beans;

public class MapReduceScripts {
	
	private String mapFunction;
	private String reduceFunction;
	private String theFloowSchema;
	
	public String getTheFloowSchema() {
		return theFloowSchema;
	}
	public void setTheFloowSchema(String theFloowSchema) {
		this.theFloowSchema = theFloowSchema;
	}
	public String getMapFunction() {
		return mapFunction;
	}
	public void setMapFunction(String mapFunction) {
		this.mapFunction = mapFunction;
	}
	public String getReduceFunction() {
		return reduceFunction;
	}
	public void setReduceFunction(String reduceFunction) {
		this.reduceFunction = reduceFunction;
	}
	

}
