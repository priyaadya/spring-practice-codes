package com.jsp.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/stereotype/Config4.xml");
       Ipl a=context.getBean("ipl", Ipl.class);
       System.out.println(a.hashCode());
       Ipl b=context.getBean("ipl", Ipl.class);
       System.out.println(b.hashCode());
        System.out.println( "Project completed" );
    }
}
