package com.ij.ses;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class third extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String montly=req.getParameter("t8");
	int mno=Integer.parseInt(montly);
	String yer=req.getParameter("t9");
	int yr=Integer.parseInt(yer);
	/*String tax=req.getParameter("t10");
	int tx=Integer.parseInt(tax);
	String phno=req.getParameter("t11");
	int pno=Integer.parseInt(phno);*/
	//get session obkjrec acsess
	HttpSession ses=req.getSession(false);
	//setting the session value
	String name=ses.getAttribute("name").toString();
	String pass=(String)ses.getAttribute("pass");
	String fname=(String)ses.getAttribute("fname");
	String lname=(String)ses.getAttribute("lname");
/*	ses.setAttribute("name", name);
ses.setAttribute("pass", pass);
ses.setAttribute("fname", fname);
ses.setAttribute("lname", lname);*/
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","9922");
		
		PreparedStatement ps=con.prepareStatement("insert into st values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, pass);
		ps.setString(3, fname);
ps.setString(4, lname);
int i=ps.executeUpdate();
if(i<0)
{
	pw.println("<h1>not inserted</h1>");
}
else
{
	pw.println("<h1> inserted</h1>");
}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	ses.getServletContext();
	String id=ses.getId();
	//int n=ses.setMaxInactiveInterval(10);
	//long ms=ses.getCreationTime();
	
	long ms=ses.getLastAccessedTime();
	Date d=new Date(ms);
//	ms=ses.getMaxInactiveInterval();
	//pw.println(ses.getAttribute(name)+"      "+ses.setAttribute(lname)+"     "+ses.getAttribute(pass)+"        "+ses.getAttribute(name));
	pw.println("<marquee><h1>your informinamtion is </h1></marquee>");
	
	pw.println("name"+name+"password   "+pass+" session id   "+id+"last access     "+ms+"    ");
	
	
	
}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
}
