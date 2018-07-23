package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cooki extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String uname=req.getParameter("user");
		String pass=req.getParameter("pass");
		
			Cookie ck=new Cookie("user",uname);
			Cookie ck1=new Cookie("pass",pass);
			resp.addCookie(ck);
			resp.addCookie(ck1);
			pw.println("cookie is added");
			//Date d=new Date();
		
		
		//create form two dynamically
		/*pw.println("<form action='surl' method='get'>");
		pw.println("<fieldset><legend>register page</legend>");
		pw.println("<input type ='text' name='name1'>");
		pw.println("<input type ='text' name='add'>");
		pw.println("<input type ='text' name='dist'>");
		pw.println("<input type ='text' name='cource'>");
		pw.println("<input type ='text' name='fees'>");
		pw.println("</fieldset></form>");*/
			pw.println("<form action='surl' method='get'>");
			pw.println("<fieldset>");
			
			pw.println("<legend>this is the registretion form of student</legend>");


	pw.print("NAME:<input type='text' name='name'><br>");
	pw.print("ADD:<input type='text' name='add'><br>");
	pw.print("cource:<input type='text' name='cource'><br>");
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
