package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlletcomm extends HttpServlet{//@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String name1=req.getParameter("name");
	String pass1=req.getParameter("pass");
	pw.print("<b><h2>thank you for submiting your name and pass</b></h2>");
	pw.print("<i>your name is"+name1+"</i>");
	pw.print("<i>your pass is"+pass1+"</i>");
	
}


protected void dopost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	doGet(req,res);
}
}
