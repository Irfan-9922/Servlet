package com.ij;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("name");
		//String pass=req.getParameter("pass");
		int pass=Integer.parseInt(req.getParameter("pass"));
		if(Validate.cheack_USER(uname, pass))
		{
			HttpSession ses=req.getSession();
			ses.setAttribute(uname, pass);
			resp.sendRedirect("welcomeback.jsp");
		}
		else
		{
			
			resp.sendRedirect("index.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
