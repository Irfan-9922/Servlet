/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :IRFAN
 *TIME:3:28:27 am
 * DATE:28-May-2017
 *PROJECTNAME:sreenutech
 */
public class test extends HttpServlet{
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void processRequest(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String fname=req.getParameter("fname");
		
		String lname=req.getParameter("lname");
		String mname=req.getParameter("mname");
		String dateofbirth=req.getParameter("dateofbirth");
		String radio=req.getParameter("gender");
		String countrey=req.getParameter("countery");
		String city=req.getParameter("city");
		int postal=Integer.parseInt(req.getParameter("postelcode"));
		int cardno=Integer.parseInt(req.getParameter("cardnumber"));
		int cvvn=Integer.parseInt(req.getParameter("cvvno"));
		//int expdate=Integer.parseInt(req.getParameter("expirecard"));
		String expdate=req.getParameter("expirecard");
		String adress=req.getParameter("add");
		String adress1=req.getParameter("add1");
		pw.print(cvvn);
		System.out.println(fname+"===="+lname+"===="+mname+"==="+dateofbirth+"======"+radio+"==="+countrey+"===="+city+"==="+postal+"===="+cardno+"==="+cvvn+"===="+expdate+"==="+adress+"==="+adress1);
	}
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		processRequest(req, resp);
		
	}
public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	processRequest(req, resp);
	}

}
