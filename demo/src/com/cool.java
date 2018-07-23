package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cool extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
String s=req.getParameter("uid");//irfan
int m=Integer.parseInt(req.getParameter("pass"));//992286
if(LoginDao.validate(s,m))
{
	System.out.println("working");
	resp.sendRedirect("welcome.jsp");
}
else
{
	
	pw.println("plese enter proper valid username and apss");
	pw.println("<a href='index.html'>home</a>");
	//resp.sendRedirect("index.html");
	//RequestDispatcher rd=req.getRequestDispatcher("index.html");
//	rd.include(req, resp);
}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
