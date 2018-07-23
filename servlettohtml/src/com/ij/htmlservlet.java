package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class htmlservlet extends HttpServlet {
	
@Override

	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//read form data from html form
		String name=req.getParameter("name1");
//		String age=req.getParameter("age1");
		int page=Integer.parseInt("age");
		if(page<18)
		{
			pw.println("<bold>you are no elligable for vote</bold>");
		}
		else
		{
			pw.println("<bold>you are  elligable for vote</bold>");
		}
		pw.println("<bold><a herf='input.html'>return</a>");
}
@Override
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(req, res);
	}
}
