package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeanLifeCycle/Config4.xml");
       ChickenFry c=context.getBean("c1", ChickenFry.class);
       System.out.println(c);
       context.registerShutdownHook();

        System.out.println( "Project completed" );
    }
}
