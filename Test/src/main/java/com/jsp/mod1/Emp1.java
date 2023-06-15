package com.jsp.mod1;

public class Emp1 {
	
	private String eName;
	private String eId;
	private double eSal;
	private Dept dept;

	public Emp1(String eName, String eId, double eSal, Dept dept) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSal = eSal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp1 [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + ", dept=" + dept + "]";
	}

}
