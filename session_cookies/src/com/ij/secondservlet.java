package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class secondservlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String s1=req.getParameter("income");
		String s2=req.getParameter("tax");
		//read form 1req 1 data
		Cookie ck[]=req.getCookies();
		String name=null;
		String fname=null;
		if(ck!=null)
		{
			name=ck[0].getValue();
			fname=ck[1].getValue();
			pw.println("form 1 data"+name+"   "+fname);
			pw.println("form 2 data"+s2+"     "+s1);
		//pw.println(ck[].getName()+);
			
		}
	
	}

}
