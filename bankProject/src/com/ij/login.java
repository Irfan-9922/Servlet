package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	String uname=req.getParameter("uname");
	
	String pass=req.getParameter("pass");
	if(uname.equals("irfan")&& pass.equals("man"))
	{
		HttpSession session=req.getSession();
		session.setAttribute("username", uname);
		res.sendRedirect("welcome.jsp");
	}
	else
	{
		res.sendRedirect("login.jsp");
	}
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
