package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name = "Ella";

//------------------------  Field Injection ---------------------------------------
//	@Autowired    
//	private Parrot parrot;
	
//------------------------ Constructor Injection -------------------------------
// We can now make the field final to ensure its
// value cannot be changed after initialization
	
	private /* final */ Parrot parrot;
	
	@Autowired
	public Person(Parrot parrot) {
		this.parrot = parrot;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Parrot getParrot() {
		return parrot;
	}
	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
	
	

}
