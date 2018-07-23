package com.ik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ck11 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		// TODO Auto-generated method stub
		String s1=req.getParameter("name");
		String s2=req.getParameter("add");
		String s3=req.getParameter("cource");
		String s4=req.getParameter("fees");
		String user=null;
		String pass=null;
		Cookie ck[]=req.getCookies();
		user=ck[0].getValue();
		pass=ck[1].getValue();
		pw.println("welcome"+user);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
