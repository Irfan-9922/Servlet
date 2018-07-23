package com.ij.ses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class secondservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	//	String name1=req.getParameter("t3");
		String fname=req.getParameter("t3");
		String lname=req.getParameter("t4");
		/*String city=req.getParameter("t5");
		String phno=req.getParameter("t6");
		String email=req.getParameter("t7");
		String spouse=req.getParameter("t7");
		*/
		//get session object
		HttpSession ses=req.getSession(false);
		//set the valu for sesson 
		ses.setAttribute("fname", fname);
		ses.setAttribute("lname",lname);
		/*ses.setAttribute("c", city);
		ses.setAttribute("d", phno);
		ses.setAttribute("e", email);
		ses.setAttribute("f", spouse);*/
		//genrate form three dynamically
		pw.println("<h1>welcome to the form 3</h1>");
		pw.println("<form action='turl' method='get'>");
		pw.println("<center >income registretion form</center>");
		pw.println("monthly<input type='text'name='t8'>");
		pw.println("yearky<input type='text'name='t9'>");
	/*	pw.println("tax<input type='text'name='t10'>");
		pw.println("phno<input type='text'name='t11'>");
		*/
		//end of form
		pw.println("<input type='submit'value='submit'>");
		
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
