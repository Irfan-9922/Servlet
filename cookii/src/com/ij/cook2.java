package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cook2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String nam=req.getParameter("name");
		String add=req.getParameter("add");
		//String dis=req.getParameter("dist");
		String cource=req.getParameter("cource");
		String fees=req.getParameter("fees");
		//now we havt to add the cookie here
		Cookie ck[]=req.getCookies();
		String unae=null;
		String pas=null;
		unae=ck[0].getValue();
		pas=ck[1].getValue();
		System.out.println("welcome"+unae);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,resp);
	}

}
