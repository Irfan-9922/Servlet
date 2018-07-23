package com.ij.ses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class firstsession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("t1");
		String pass=req.getParameter("t2");
		int pass1=Integer.parseInt(pass);
		if(name.equals("irfan")&& pass1==9922)
		{
			pw.println("<h1>welcome to hme page</h1>");
			//create the dynamic web pageHtt
			HttpSession ses=req.getSession();
			//set req1 form1 data int o session 
			ses.setAttribute("name",name);
			ses.setAttribute("pass",pass);
			//create the form dynamiclly
			
			pw.println("<h1>welcome to the form 2</h1>");
			pw.println("<form action='surl' method='get'>");
			pw.println("<center >registretion form</center>");
			pw.println("fname<input type='text'name='t3'>");
			pw.println("lname<input type='text'name='t4'>");
			/*pw.println("city<input type='text'name='t5'>");
			pw.println("phno<input type='text'name='t6'>");
			pw.println("email<input type='text'name='tt7'>");
			pw.println("pousename<input type='text'name='t8'>");*/
			pw.println("<input type='submit'value='submit'>");
		}
		else{
			pw.println("<h1>plese enter the correct userna me and password</h1>");
			pw.println("<a href='index.html'>homepage</a>");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
