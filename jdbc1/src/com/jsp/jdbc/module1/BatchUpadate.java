package com.jsp.jdbc.module1;

import java.sql.*;
public class BatchUpadate {
	public static void main(String[] args)
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
