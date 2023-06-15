package com.jsp.mod1;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext con=new ClassPathXmlApplicationContext("com/jsp/mod1/Config2.xml");
        SpelExp s = con.getBean("bean1", SpelExp.class);
        System.out.println(s);
        System.out.println("program ended");
    }
}
