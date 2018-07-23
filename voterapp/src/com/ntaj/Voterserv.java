package com.ntaj;

//import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Voterserv extends HttpServlet {

	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		//genral settigs 
		PrintWriter pw=res.getWriter();
		res.setContentType("html/test");
		//reading dolrm data
		String name=req.getParameter("sname");
		String age=req.getParameter("sage").trim();
		int a=Integer.parseInt(age);
		
		
		if(a>=18)
		
		
		
	
			pw.println("<h1 font color='cyan'>"+name+"sir you are elligable for voting ");
		else
			
			pw.println("<h1 font color='cyan'>"+name+"sir you are not elligable for voting ");
		pw.println("<a href='input.html'><img src='a.jpeg'></a>");
		pw.close();
		
	}
	
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		
		doGet(req,res);
	}
}

