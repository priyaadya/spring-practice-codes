package com.jsp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String studentusn;
	private String studentname;
	private String studentcity;
	public String getStudentusn() {
		return studentusn;
	}
	public void setStudentusn(String studentusn) {
		this.studentusn = studentusn;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	public Student(String studentusn, String studentname, String studentcity) {
		super();
		this.studentusn = studentusn;
		this.studentname = studentname;
		this.studentcity = studentcity;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [studentusn=" + studentusn + ", studentname=" + studentname + ", studentcity=" + studentcity
				+ "]";
	}
	
	
	
	
	

}
