package com.jsp.StadaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/StadaloneCollection/Config4.xml");
      Emp e=context.getBean("emp1",Emp.class);
      System.out.println(e.getVehicle());
      
 
       
       

        System.out.println( "Project completed" );
    }
}
