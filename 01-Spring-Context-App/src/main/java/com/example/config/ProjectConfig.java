package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Parrot;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ProjectConfig {
	
//	@Bean
//	Parrot parrot() {
//		var p = new Parrot();
//		p.setName("Koko");
//		return p;
//	}
	
//	@Bean
//	Parrot parrot1() {
//		var p = new Parrot();
//		p.setName("Miki");
//		return p;
//	}
	
//	@Bean
//	@Primary
//	Parrot parrot2() {
//		var p = new Parrot();
//		p.setName("Riki");
//		return p;
//	}
	
//	@Bean
//	Parrot parrot3() {
//		var p = new Parrot();
//		p.setName("Kiki");
//		return p;
//	}
	
	@Bean
	String hello() {
		return "Hello";
	}	
	
	@Bean
	Integer ten() {
		return 10;
	}

}
