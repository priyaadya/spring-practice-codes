package com.jsp.mod1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/mod1/Config1.xml");
       Student a=context.getBean("s1", Student.class);
        System.out.println(a.hashCode());
        Student b=context.getBean("s1", Student.class);
        System.out.println(b.hashCode());
        Student c=context.getBean("s1", Student.class);
        System.out.println(c.hashCode());

        System.out.println( "Project completed" );
    }
}
