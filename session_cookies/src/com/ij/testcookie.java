package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testcookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String sname=req.getParameter("name");
		String sfname=req.getParameter("fname");
		//create the cookie to store form 1 data
		Cookie ck1=new Cookie("n",sname);
		Cookie ck2=new Cookie("f",sfname);
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		//pw.println(ck1.getName()+""+ck1.getValue());
		
		//we nned to create second form dynamicalliy
		pw.println("<form action ='surl' method='get'>");
		pw.println("income of this year<input type='text'name='income'>");
		pw.println("tax<input type='text'name='tax'>");
		pw.println("income of this year<input type='submit'value='submit'>");
		pw.println("</form>");
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
