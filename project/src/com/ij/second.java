package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class second extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("N");
		String lname=req.getParameter("LN");
		String fname=req.getParameter("FN");
		String cname=req.getParameter("CN");
		String per=req.getParameter("P");
		
		int yp=Integer.parseInt(req.getParameter("YP"));
		int phno=Integer.parseInt(req.getParameter("PH"));
		//String phno=req.getParameter("PH");
		String madd=req.getParameter("MAD");
		pw.println("<h1>thank ypu "+name+"for your feed back</h1>");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe", "system", "9922");
		//	Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","9922");
			PreparedStatement ps=con.prepareStatement("insert into newrecord values(?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, lname);
			ps.setString(3, fname);
			ps.setString(4, cname);
			ps.setString(5, per);
			ps.setInt(6, yp);
			ps.setInt(7, phno);
			ps.setString(8, madd);
			int r=ps.executeUpdate();
			if(r==0)
			{
				pw.print("record is not inserted");
			}
			else
			{
				pw.print("record is inserted");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
