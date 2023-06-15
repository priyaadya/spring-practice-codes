package Jspiders.App;

import javax.persistence.Entity;
import javax.persistence.Id;


//Pojo class java bean class

@Entity
public class Student {
	
	@Id
	private int usn;
	private String name;
	private double marks;
	
	private Certificate certi;
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + ", certi=" + certi + "]";
	}
	
	
	
	
	

}
