package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ck1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse rsp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=rsp.getWriter();
		rsp.setContentType("text/html");
		String user=req.getParameter("USER1");
		
		
		String pass=req.getParameter("PASS");
		//int s=Integer.parseInt(pass);
		 Cookie ck=new Cookie("user1",user);
		 Cookie ck1=new Cookie("PASS",pass);
		 rsp.addCookie(ck);
		 rsp.addCookie(ck1);
		if(user.equals("irfan"))
		{
			
			pw.println("<form action='ck2' method='get'>");
			pw.println("<fieldset>");
			
			pw.println("<legend>this is the registretion form of student</legend>");


	pw.print("NAME:<input type='text' name='name'><br>");
	pw.print("ADD:<input type='text' name='add'><br>");
	pw.print("cource:<input type='text' name='cource'><br>");
	pw.print("FEES:<input type='text' name='fees'><br>");
	pw.print("<input type='submit' value='submit'>");

	pw.print("</fieldset>");
	pw.print("</form>");
		
		//rsp.sendRedirect("ck2");
		 //genrate the form 2 dynamocally
		
		}
		else
		{
			pw.println("from out of cookie");
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rsp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,rsp);
	}
}
