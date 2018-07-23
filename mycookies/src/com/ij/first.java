package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class first extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String s=req.getParameter("name");
		String s1=req.getParameter("pass");
		System.out.println(s);
		System.out.println(s1);
		if(s.equals("irfan")&& s1.equals("9922")){
			resp.sendRedirect("wel.html");	
		}
		//session handling by using cookies 
		/*Cookie ck=new Cookie("name",s);
		Cookie ck1=new Cookie("pass",s1);
		resp.addCookie(ck);
		resp.addCookie(ck1);*/
		//session handling with session
	/*	HttpSession ses=req.getSession();
		ses.setAttribute("name", s);
		ses.setAttribute("pass", s1);*/
		//resp.sendRedirect("surl?name="+s);
		
		else
		{
			resp.sendRedirect("index.html");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
