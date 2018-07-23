package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
String n=req.getParameter("name");
String ag=req.getParameter("age");
Cookie c=new Cookie("name1",n);
Cookie c1=new Cookie("age1",ag);
resp.addCookie(c);
resp.addCookie(c1);
System.out.println(n+">>>>");
resp.sendRedirect("demo.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
