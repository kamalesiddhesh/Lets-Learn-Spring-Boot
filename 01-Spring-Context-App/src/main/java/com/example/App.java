package com.example;

import java.util.function.Supplier;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.beans.Parrot;
import com.example.config.ProjectConfig;

/**
 * Hello world!
 *
 */

public class App{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        System.out.println(context.getClass().getName());
        
        
//        Parrot p = context.getBean(Parrot.class);
//        Parrot p = context.getBean("parrot3",Parrot.class);
//        p.setName("Miki");
//        System.out.println(p);
//        System.out.println(p.getName());
        
        String s = context.getBean(String.class);
        System.out.println(s);
        
        Integer i = context.getBean(Integer.class);
        System.out.println(i);
        
//        Programmatically adding beans to the Spring context
        Parrot x = new Parrot();
        x.setName("Cerci");
        
        Supplier<Parrot> parrotSupplier = () -> x;
        
        context.registerBean("parrot1",Parrot.class,parrotSupplier,bc -> bc.setScope(BeanDefinition.SCOPE_PROTOTYPE));
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);
        Parrot parrot1 = context.getBean(Parrot.class);
        System.out.println(parrot1);
        System.out.println(parrot.getName());
        System.out.println(parrot1.getName());
    }
}
