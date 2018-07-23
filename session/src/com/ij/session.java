package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

public class session extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String a=req.getParameter("fname");
		String s=req.getParameter("lname");
		String c=req.getParameter("faname");
		String d=req.getParameter("mname");
		//now we have to add this data to seession attibute
		HttpSession ses=req.getSession(true);
		ses.setAttribute("fname", a);
		ses.setAttribute("lname", s);
		ses.setAttribute("faname", c);
		ses.setAttribute("mname", d);
		//create second fform dynamicclay
		pw.println("<form action='surl' method='get'>");
		pw.println("<fieldset>");
		
		pw.println("<legend>this is the registretion form of student quqlification details</legend>");


pw.print("NAME:<input type='text' name='cname'><br>");
pw.print("ADD:<input type='text' name='cadd'><br>");
pw.print("cource:<input type='text' name='stream'><br>");
pw.print("FEES:<input type='text' name='fees'><br>");
pw.print("<input type='submit' value='submit'>");

pw.print("</fieldset>");
pw.print("</form>");
}
	   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	}


