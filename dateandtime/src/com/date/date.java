package com.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class date extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		
	}
	

}
