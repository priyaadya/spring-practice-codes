package Hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Jsp.SecondProject.TestProject2.Student;

public class hqlExample {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	SessionFactory factory = conf.buildSessionFactory();
	Session s=factory.openSession();
	Transaction tx = s.beginTransaction();
	
	
	//Hql syntax
	String query="from Student where Name=:x";
	Query q = s.createQuery(query);
	q.setParameter("x", "divya");
	
	//single(unique)
	//multiple-list
	
	List<Student>list=q.list();
	for(Student stu:list)
	{
		System.out.println(stu.getName()+":"+stu.getMarks());
		
	}
	System.out.println("-----------------------");
	//Query q2=s.createQuery("delete from Student where Name=:c");
	//q2.setParameter("c", "rishi");
	//int r = q2.executeUpdate();
	//System.out.println("Deleted:");
	//System.out.println(r);
	Query q3 = s.createQuery("update Student set Name=:c where usn=:d");
	q3.setParameter("c", "kiran");
	q3.setParameter("d", 10);
	int r = q3.executeUpdate();
	System.out.println(r+"updated");
	
	tx.commit();
	Query q4=s.createQuery("select q.question,q.question_id,a.answer from Question INNER JOIN q.answer");
	List<Object []> list4 = q4.getResultList();
	s.close();
	
	factory.close();
	
}
}
