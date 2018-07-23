package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first1 extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		
		resp.setContentType("text/html");
		Date d=new Date();
		//String s=null;
		
		
		//pw.println("<h1>the time is"+d+"from deli");
		pw.println("<h1>the time is"+d+"from deli");
	}
	
}
