package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.Parrot;
import com.example.bean.Person;

@Configuration
public class ProjectConfig {
	
	@Bean
	Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
// -----------------------------------------------------------------------------------------
//	@Bean
//	Person person() {
//		Person p = new Person();
//		p.setName("Ella");
//		// Wiring the beans using a direct method call between the @Bean methods
//		p.setParrot(parrot());
//		return p;
//	}
	
// ---------------------------------------------------------------------------------------------------------
//	Injecting bean dependencies by using parameters of the methods

	@Bean
	Person person(Parrot parrot) {
		Person p = new Person();
		p.setName("Ella");		
		p.setParrot(parrot);
		return p;
	}

}
