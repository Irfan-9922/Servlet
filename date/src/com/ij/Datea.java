package com.ij;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Datea extends HttpServlet {
	//@Override
	
	
			//register driver
			
		public static String query="select count(*)from login1 where userid=? and password=?"; 
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	//Connection con;
	//PreparedStatement ps;
	PrintWriter pw=resp.getWriter();
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("hiii");
		//register the oracle driver manager with driver manager servises
		
		Connection con=null;

		//creating the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","9922");
	   if(con!= null)
	   {
		   System.out.println("connection cereted");
	   }
		
		
		//create the preaperd statement
			
				
				//process the result
	resp.setContentType("text/html");
	Date d=new Date();
	pw.println("<marquee><bold >"+d+"current date is");
	String userid=req.getParameter("user");
     String passw=req.getParameter("pass");
	int page=Integer.parseInt(passw);
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,userid);
		ps.setString(2,passw);
		ResultSet rs=ps.executeQuery();
		System.out.println("dfgsd");
		int cnt=0;
		while(rs.next())
		{
			cnt=rs.getInt(1);
			
			
		}
//		if(cnt==0)
//		{
//			System.out.println("invalid");
//			
//		}
//		else
//		{
//			
//System.out.println("valid");				
//	
//}
//}

		if(cnt==0)
		{
			pw.println("<bold>you are no elligable for vote</bold>");
		}
		else
		{
			pw.println("<bold>you are  elligable for vote</bold>");
		}
		pw.println("<bold><a herf='input.html'>return</a>");
	}

catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
	
	catch(SQLException  e1)
	{
		e1.printStackTrace();
	}
		
}

}
