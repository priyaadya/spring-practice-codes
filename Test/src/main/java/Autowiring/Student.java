package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Qualifier("certi1")
	@Autowired
	private Certificate certi;

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("setting the property using setter");
	}

	public Student(Certificate certi) {
		super();
		this.certi = certi;
		System.out.println("setting the properties using constructor");
	}

	@Override
	public String toString() {
		return "Student [certi=" + certi + "]";
	}

	public Student() {
	}
	

}
