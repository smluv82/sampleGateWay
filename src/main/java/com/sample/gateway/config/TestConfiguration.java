package com.sample.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class TestConfiguration {
	private final Environment env;

	@Bean
	public void test() {
		System.out.println("1111111111");
		System.out.println(env.getProperty("who.am.i"));
	}
}
