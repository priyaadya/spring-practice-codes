package Hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Jsp.SecondProject.TestProject2.Student;

public class FirstCache {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();		
		Session s=factory.openSession();	
		Student student = s.get(Student.class, 10);
		System.out.println(student);
		System.out.println("Working Something");
		Student student1 = s.get(Student.class, 10);
		System.out.println(student);
		
		s.close();
		
		

	}

}
