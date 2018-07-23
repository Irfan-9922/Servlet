package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class session2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		//read form 2 req 2 data
		String cname=req.getParameter("cname");
		String cadd=req.getParameter("cadd");
		String stream=req.getParameter("stream");
		String fees=req.getParameter("fees");
		//get access to session
		HttpSession ses=req.getSession(false);
		String fname=ses.getAttribute("fname").toString();
		String lname=ses.getAttribute("lname").toString();
		String faname=ses.getAttribute("faname").toString();
		String mname=ses.getAttribute("mname").toString();
		
		pw.println("your enterd data");
		pw.println(ses.getCreationTime());
		String id =ses.getId();
		System.out.println(id);
		pw.println(id);
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe", "system", "9922");
			PreparedStatement ps=con.prepareStatement("insert into studentrecord values(?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, faname);
			ps.setString(4, mname);
            ps.setString(5, cname);
            ps.setString(6, cadd);
            ps.setString(7, stream);
            ps.setString(8, fees);
            int i=ps.executeUpdate();
			if(i==0)
			{
				System.out.println("record is not inserted");
			}
			else
			{
				System.out.println("record is inserted");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(req, resp);
	}

}
