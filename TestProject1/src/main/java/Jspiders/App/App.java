package Jspiders.App;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*DAO class(data access object)*/
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//Student st=new Student();
    	//st.setUsn(10);
    	//st.setName("adya");
    	//st.setMarks(99);
		/*
		 * Emp e=new Emp(); e.seteName("adya"); e.seteSal(10000.00); e.setX(10);
		 */
    	
    	
    	Address ad=new Address();
    	ad.setStreet("street1");
    	ad.setCity("bangalore");
    	ad.setOpen(true);
    	ad.setAddedDate(new Date());
    	ad.setX(1234);
    	
    	//Reading image
    	FileInputStream fis=new FileInputStream("src/main/java/female-hand-holding-cup-hot-tea-front-window-autumn-rain-114124512.jpg");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	
    	
    	Configuration conf=new  Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(ad);
    	tx.commit();
    	session.close();
    	System.out.println("Done:");
    	
    	
    	
		/* Session openSession = buildSessionFactory.openSession(); */
		/*
		 * Emp emp = openSession.get(Emp.class, 1); System.out.println(emp);
		 * 
		 * Emp emp1 = openSession.get(Emp.class, 2); System.out.println(emp1);
		 * 
		 * Emp emp2 = openSession.get(Emp.class, 2); System.out.println(emp2);
		 */
		/*
		 * Emp load = openSession.load(Emp.class, 4); System.out.println(load);
		 * 
		 * 
		 * 
		 * openSession.close(); buildSessionFactory.close();
		 */
    	
    	
    	
    }
}
