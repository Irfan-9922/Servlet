package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class htmlcomm extends HttpServlet {//@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String name1=req.getParameter("name");
	String pass1=req.getParameter("pass");
	//int phno=req.Integer.parseInt(req.getParameter("phno1"));
	pw.print("<center>welcom to the page</center>");
	
}
//@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, res);
	}

}
