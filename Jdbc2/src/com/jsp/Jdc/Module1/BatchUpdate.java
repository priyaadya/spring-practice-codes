package com.jsp.Jdc.Module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String inquery="insert into emp values(323,'harish',4500.00)";
		String delQuery="delete from emp where EmpNo=127";
		String upQuery="update emp set ESal=1400.00,EName='karma'where EmpNo=429";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registerde");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=root");
			System.out.println("Connection established");
			stmt=con.createStatement();
			stmt.addBatch(inquery);
			stmt.addBatch(delQuery);
			stmt.addBatch(upQuery);
			int[] executeBatch = stmt.executeBatch();
			for(int a:executeBatch)
			{
				System.out.println("Batch executed"+a);
			
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	

	}

}
