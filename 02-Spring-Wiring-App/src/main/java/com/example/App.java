package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Parrot;
import com.example.bean.Person;
import com.example.config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
//        Gets a reference to the Person bean from the Spring context
        Person person = context.getBean(Person.class);
        
//        Gets a reference to the Parrot bean from the Spring context
        Parrot parrot = context.getBean(Parrot.class);
        
        System.out.println(
        		 "Person's name: " + person.getName());
        
        System.out.println(
        		 "Parrot's name: " + parrot.getName()); 
        
//        Prints the person’s parrot to prove that there’s not yet a relationship between the instances 
        System.out.println(
        		 "Person's parrot: " + person.getParrot());

    }
}
