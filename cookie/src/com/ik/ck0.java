package com.ik;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ck0 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("USER1");
		String pass=req.getParameter("PASS");
		Cookie ck=new Cookie("user1",name);
		Cookie ck1=new Cookie("pass",pass);
		resp.addCookie(ck);
		resp.addCookie(ck1);
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
pw.println(req.getClass().getName());
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doGet(req,resp);
	}

}
