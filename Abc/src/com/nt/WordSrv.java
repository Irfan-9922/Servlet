package com.nt;

//import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WordSrv extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		//get print writer obj 
		PrintWriter pw= res.getWriter();
	
		res.setContentType("application/msword");
		
		//wrtie a logic to ganrarte the output 
		pw.println("hello");
		pw.println("<table border='1'>");
		pw.println("<tr><th>player</tr></th><tr><th>roler</tr></th>");
		pw.println("<tr><td>irfanr</tr></td><tr><td>leader</tr></th>");
		pw.println("junjajsdakdgawlkjc");
		
	
		pw.println("</table>");
		pw.close();
		
	}
	
	

}
