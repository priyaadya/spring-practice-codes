package com.Jsp.SecondProject.TestProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	Person p=new Person(10,"adya","bangalore","9945593423");
    	
    	Session s = factory.openSession();
    	Transaction tx = s.beginTransaction();
    	s.save(p);
    	tx.commit();
    	s.close();
    	
    	factory.close();
    	

	}

}
