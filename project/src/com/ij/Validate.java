 package com.ij;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean cheack_USER(String user,int password)
	{
		PreparedStatement ps=null;
		Connection con=null;
		ResultSet rs=null;
		boolean status=false;
		try{
			
	
		//loading the driver classes
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//creating the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "9922");
		ps=con.prepareStatement("select*from login where userid=? and password=?");
		ps.setString(1, user);
		ps.setInt(2, password);
		rs=ps.executeQuery();
		status=rs.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	

}
