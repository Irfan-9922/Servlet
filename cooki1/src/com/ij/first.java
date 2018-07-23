package com.ij;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class first extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw=resp.getWriter();
	resp.setContentType("text/html");
	/*String uname=req.getParameter("uname");
	String pas=req.getParameter("passw");
	System.out.println(uname+"from first servlet");
	Cookie ck=new Cookie("USER1",uname);
	Cookie ck1=new Cookie("PASS", pas);
	resp.addCookie(ck);
	resp.addCookie(ck1);
	//using session
	HttpSession ses=req.getSession();
	ses.setAttribute("pega", uname);
	ses.setAttribute("irfan", pas);
	resp.sendRedirect("second.jsp");*/
	String fname=req.getParameter("fname");
	
	String lname=req.getParameter("lname");
	String mname=req.getParameter("mname");
	String dateofbirth=req.getParameter("dateofbirth");
	String radio=req.getParameter("gender");
	String countrey=req.getParameter("countery");
	String city=req.getParameter("city");
	int postal=Integer.parseInt(req.getParameter("postalcode"));
	int cardno=Integer.parseInt(req.getParameter("cardnumber"));
	int cvvn=Integer.parseInt(req.getParameter("cvvno"));
	int expdate=Integer.parseInt(req.getParameter("expirecard"));
	String adress=req.getParameter("add");
	String adress1=req.getParameter("add1");
	System.out.println(fname+"===="+lname+"===="+mname+"==="+dateofbirth+"======"+radio+"==="+countrey+"===="+city+"==="+postal+"===="+cardno+"==="+cvvn+"===="+expdate+"==="+adress+"==="+adress1);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}
}
