package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration conf=new  Configuration();
    	conf.configure("hibernate.cfg.xml");
    	SessionFactory factory = conf.buildSessionFactory();
    	
    	
//    	Question q1=new Question();
//    	q1.setQuestionId(1);
//    	q1.setQuestion("what is java?");
//    	
//    	
//    	Answer answer=new Answer();
//    	answer.setAnswerId(2);
//    	answer.setAnswer("Java is prg lang");
//    	answer.setQuestion(q1);
//    	
//    	Answer answer1=new Answer();
//    	answer1.setAnswerId(3);
//    	answer1.setAnswer("is a framework");
//    	answer1.setQuestion(q1);
//    	
//    	Answer answer2=new Answer();
//    	answer2.setAnswerId(4);
//    	answer2.setAnswer("java has different features");
//    	answer2.setQuestion(q1);
//    	
//    	
//    	List<Answer>list=new ArrayList<Answer>();
//    	list.add(answer);
//    	list.add(answer1);
//    	list.add(answer2);
//    	
//    	q1.setAnswer(list);
    	
		/*
		 * Emp e1=new Emp(); Emp e2=new Emp();
		 * 
		 * e1.setEid(10); e1.setName("prita");
		 * 
		 * e2.setEid(20); e2.setName("sandya");
		 * 
		 * Project p1=new Project(); Project p2=new Project();
		 * 
		 * p1.setPid(30); p1.setProjectName("mediacl & health");
		 * 
		 * 
		 * p2.setPid(40); p2.setProjectName("education");
		 * 
		 * 
		 * List<Emp> list1=new ArrayList<Emp>(); List<Project> list2=new
		 * ArrayList<Project>();
		 * 
		 * list1.add(e1); list1.add(e2);
		 * 
		 * 
		 * list2.add(p1); list2.add(p2);
		 * 
		 * e1.setProjects(list2); p2.setEmps(list1);
		 */
//    	
 
    	
    	Session session = factory.openSession();
    	//Transaction tx=session.beginTransaction();
    	
    	Transaction tx=session.beginTransaction();
  
    	
		/*
		 * session.save(q1); session.save(answer); session.save(answer1);
		 * session.save(answer2);
		 */
    	
    	Question q=(Question)session.get(Question.class,1 );
    	System.out.println(q.getQuestionId());
    	System.out.println(q.getQuestion());
    	System.out.println(q.getAnswer().size());
    	
    	tx.commit();
    	session.close();
    	System.out.println("Done:");

	}

}
