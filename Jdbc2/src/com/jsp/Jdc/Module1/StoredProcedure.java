package com.jsp.Jdc.Module1;
import java.sql.*;
public class StoredProcedure {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt=null;
		try {
			Class.forName("com.mysql.cj.jdc.Driver");
			System.out.println("Driver class loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=root");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
