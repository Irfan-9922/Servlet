package com.ntaj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class database extends HttpServlet {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection con;
	public void init(){
	
	
		//getting query
		try
		{
			//data base accesing
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("drver");
			
			con=DriverManager.getConnection("jdbc:oracl:thin:@localhost:1521:xe","system","9922");
			System.out.println(con);
			
			ps=con.prepareStatement("select roll,name,address from emp where roll=?");
			
			rs=ps.executeQuery();
			
		
	}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
		try{
		//genral settings 
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	//	pw.setContentType
		
		
		while(rs.next())
		{
			
			pw.println("<tr>");
			pw.println("<td>"+rs.getInt(1)+"</td>");
			pw.println("<td>"+rs.getString(2)+"</td>");
			pw.println("<td>"+rs.getString(3)+"</td>");
			pw.println("</tr>");
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		public void dopost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			doGet(req,res);
		}
}
		

		
	


