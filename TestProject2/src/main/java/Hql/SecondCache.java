package Hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Jsp.SecondProject.TestProject2.Student;



public class SecondCache {

	public static void main(String[] args) {
		
	
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session s1=factory.openSession();
		Student student1 = s1.get(Student.class, 10);
		System.out.println(student1);
		s1.close();
		Session s2=factory.openSession();
		Student student2 = s1.get(Student.class, 20);
		System.out.println(student2);
		
		s2.close();
		
	
	}

}
