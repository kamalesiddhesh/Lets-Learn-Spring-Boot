package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
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
        
        Person p =  context.getBean(Person.class);
        System.out.println(p.getName());
        System.out.println(p.getParrot());
    }
}
