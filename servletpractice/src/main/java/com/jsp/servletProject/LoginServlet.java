package com.jsp.servletProject;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends GenericServlet{
	
	public LoginServlet() {
		
		//first phase
		System.out.println("Servlet object is created");
		
	}
	public void init(ServletConfig config) {
		//2nd phase
		System.out.println("servlet object is configured and initialized");
	}
	public void service(ServletRequest req,ServletResponse resp) throws IOException {
		
		//3rd phase
		System.out.println("running on service phase");
		String email=req.getParameter("em");
		String password=req.getParameter("pa");
		String phno=req.getParameter("ph");
		PrintWriter out=resp.getWriter();
		out.print("<html><body bgcolor='orange'><h1>congrats"+email+"</h1></body></html>");
				
	}
	public void destroy() {
		//4th pahsse 
		System.out.println("object is not destroyed all the costly resources closed");
	}

}
