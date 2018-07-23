package com.ij;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean verify(String uid,int pass)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean status=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "9922");
			ps=con.prepareStatement("select*from login where userid=? and password=?");
			ps.setString(1, uid);
			ps.setInt(2, pass);
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
