package com.jsp.servletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String id=req.getParameter("id");
		String firstname = req.getParameter("fnm");
		String Lastname = req.getParameter("lnm");
		String email = req.getParameter("em");
		String phno=req.getParameter("phno");
		String Address=req.getParameter("addr");
		
		 PrintWriter out=resp.getWriter();
		 out.print("<html><body bgcolor='blue'><h1>" + "congrats"+" "+firstname+"</h1></body></html>");
		 out.flush();
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("insert into jsp.table values(?,?,?,?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, firstname);
			pstmt.setString(3, Lastname);
			pstmt.setString(4, email);
			pstmt.setString(6,phno);
			pstmt.setString(5,Address);
			pstmt.execute();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
