package com.jsp.mod1;

public class Test {
	private int x;
	private int y;
	public Test(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Constructor tyep is int:int");
	}
	public Test(double x,double y)
	{
		this.x=(int) x;
		this.y=(int) y;
		System.out.println("constructor type is double:double");
	}
	public Test(String x,String y)
	{
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("constructor type is String:String");
	}
	public void add()
	{
		System.out.println("value of x is:"+this.x);
		System.out.println("value of y is:"+this.y);
		System.out.println("Result is:"+(this.x+this.y));
	}
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

}
