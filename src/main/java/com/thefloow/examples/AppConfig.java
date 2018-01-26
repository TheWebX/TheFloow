package com.thefloow.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.gson.Gson;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("singleton")
	public Gson gson() {
		return new Gson();
	}
	
}
