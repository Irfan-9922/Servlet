package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class first extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String na=req.getParameter("name");
		Cookie ck=new Cookie("uname", na);
		resp.addCookie(ck);
		pw.println("<form action='second'method='get'>");
		pw.println("<input type='text' name='age'>");
		pw.println("<input type='submit'value='go'>");
		pw.println("</form>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
