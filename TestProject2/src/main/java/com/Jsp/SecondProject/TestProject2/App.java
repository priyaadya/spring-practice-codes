package com.Jsp.SecondProject.TestProject2;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	
    	Student st=new Student();
    	st.setUsn(10);
    	st.setName("priya");
    	st.setMarks(99.99);
     
   
    	Certificate ct=new Certificate();
    	ct.setCourse("java");
    	ct.setDuration("2 month");
    	st.setCertificate(ct);
    	//transient state    	
    	Session session = factory.openSession();
    	Transaction  tx = session.beginTransaction();
    	session.save(st);
    	st.setName("harini");
    //	Persistent: it is associated with session and database
    	
    	tx.commit();
    	session.close();
    	
    	//Detached state
    	st.setName("adya");
    	System.out.println(st);
    	factory.close();
    	
    	
    }
    
    
    
}