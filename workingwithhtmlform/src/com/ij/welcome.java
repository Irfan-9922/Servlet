package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcome extends HttpServlet {@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	resp.setContentType("text/html");
	Date d=new Date();
	
	pw.print("<div color:'red'><marquee><h1>this is the first program of servlet</h1></marquee></div>");
	pw.println("<div bgcolor='pink'>this is the time of the day"+d+"</div>");
	int h=d.getHours();
	pw.println(h);
	String name=req.getParameter("n");
	String pass=req.getParameter("p");
	
	int a=Integer.parseInt(pass);
	
	if(name.equals("irfan")&& a==9922)
	{
		pw.println("<marquee>welcome to the web world</marquee>");
	           // pw.println("<form action ='surl' method='post'>");
	            pw.println("name<input type ='text' name='sname'>");
	            pw.println("add<input type ='text' name='sadd'>");
	            
	}
		else{
			pw.println("<h1 style='color:red'>you have to learn somthing about web deisigning</h1>");
			
		}
		
			
		
			
	pw.close();
}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
