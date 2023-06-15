package com.jsp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	private int usn;
	private String name;
	private String city;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", city=" + city + "]";
	}
	public Student(int usn, String name, String city) {
		super();
		this.usn = usn;
		this.name = name;
		this.city = city;
	}
	public Student() {
		
	}
	
	

}
