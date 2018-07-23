package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class second extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		/*String s=req.getParameter("name");
		String s1=req.getParameter("pass");*/
		/*Cookie ck[]=req.getCookies();
		String n=null;
		String m=null;
		n=ck[0].getValue();
		m=ck[1].getValue();
		pw.print(n);
		pw.print(m);
		*/
		//session handling with sesson
	HttpSession ses=req.getSession(false);
		String s=null;
		s=ses.getAttribute("name").toString();
		String ss=ses.getAttribute("pass").toString();
		System.out.println(s);
		System.out.println(ss);
		/*String s=req.getParameter("name");
		System.out.println(s);*/
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
