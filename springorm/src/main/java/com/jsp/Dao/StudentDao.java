package com.jsp.Dao;

import java.io.Serializable;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.Entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public int insert(Student student)
	{
		//insert
		
		int i = (Integer) this.hibernatetemplate.save(student);
		return i;
		
	}
	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	

	
}
