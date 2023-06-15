package com.jsp.mod1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private List<String>phoneNumber;
	private Set<String>email;
	private Map<String,String> name;
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	public Emp() {
		
	}
	@Override
	public String toString() {
		return "Emp [phoneNumber=" + phoneNumber + ", email=" + email + ", name=" + name + "]";
	}

	
}
