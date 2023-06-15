package com.SpringWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program started");
    	ApplicationContext con=new AnnotationConfigApplicationContext(PizzaConfig.class);
    	Pizza p=con.getBean("b", Pizza.class);
    	p.deliver();
    	System.out.println(p);
        System.out.println("program ended");
    }
}
