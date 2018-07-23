package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ck2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//read form 1 servlet 1 dada
		// TODO Auto-generated method stub
	PrintWriter pw=resp.getWriter();
	resp.setContentType("text/html");
	Cookie ck[]=req.getCookies();
	String user=null;
	String pass=null;
	if(ck!=null){
		user=ck[0].getValue();
		pass=ck[1].getValue();
	}
	pw.println("welcome"+user);
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	
}

