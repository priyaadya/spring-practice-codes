package Hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.Jsp.SecondProject.TestProject2.Student;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class sqlExample {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session = factory.openSession();
		String q1="select * from Student";
		NativeQuery nq = session.createSQLQuery(q1);
		List<Object[]> list=nq.list();
		
		for(Object[] st:list)
		{
			System.out.println(Arrays.toString(st));
		}
		session.close();
		factory.close();
		
	}

}
