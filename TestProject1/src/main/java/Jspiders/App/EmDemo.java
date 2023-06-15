package Jspiders.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Student st=new Student();
		st.setUsn(10);
		st.setName("adya");
		st.setMarks(99.99);
		
		
		Certificate certificate=new Certificate();
		certificate.setCourse("java");
		certificate.setDuration("2 month");
		st.setCerti(certificate);
		
		Configuration conf=new  Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(st);
    	tx.commit();
    	session.close();
    	System.out.println("Done:");

	}

}
