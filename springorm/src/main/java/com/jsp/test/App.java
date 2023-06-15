package com.jsp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.jsp.Dao.StudentDao;
import com.jsp.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
   
    {
    	
        System.out.println( "Execution started" );
      
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao stu=context.getBean("studentDao", StudentDao.class);
        Student student=new Student(123, "priya", "bng");
       int r= stu.insert(student);
       System.out.println(r);
       
        System.out.println("execution ended");
    }
   
}
