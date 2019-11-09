package com.bridgelabz.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation")
public class CollegeConfig {

	@Bean
	public Principal principleBean() {
		return new Principal();
	}

	@Bean
	public College collegeBean() {
		College college = new College(principleBean());
		return college;
	}
}
