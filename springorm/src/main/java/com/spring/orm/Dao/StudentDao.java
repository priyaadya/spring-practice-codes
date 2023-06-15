package com.spring.orm.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	//save student
	@Transactional
	public int insert(Student student) {
		
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
		
	}
	
	//get the single data
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
		
	}
	
	//get all student(all rows)
	public List<Student> getAllStudent(){
		List<Student> student= this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	//deleting the date
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
//updating the data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.delete(student);
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
