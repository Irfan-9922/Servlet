/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author :IRFAN
 *TIME:12:06:46 am
 * DATE:08-Jun-2017
 *PROJECTNAME:connection
 */
public class insertrecord {
	public static String name="manoj";
	public static String adress="singapor";
	public static int no=9;
	public static void main(String[] args) throws SQLException {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter your choice");
	System.out.println("for insert press:::1");
	System.out.println("for delete press:::2");
	System.out.println("for update press:::3");
	System.out.println("for read press:::4");
	
	System.out.println("enter your choice");
	n=sc.nextInt();
	Connection con=connection_test.getcon();
	if(sc.equals(1)){
	ps=con.prepareStatement("insert into student values(?,?,?)");
	ps.setInt(1, no);
	ps.setString(2, name);
	ps.setString(3, adress);
	
	
	 rs=ps.executeQuery();
	/*while(rs.next()){
		if(rs==null){
			System.out.println("record is not inserted");
		}
		else{
			System.out.println("inserted");
		}
	}*/
	 if(rs==null){
		 System.out.println("record is not inserted");
	 }
	 else
	 {
		 System.out.println("inserted");
	 }
	}
	if(sc.equals(2)){
		final String DELETE ="delete form student where no=?";
		int no=12;
	  System.out.println("from delete");
		ps=con.prepareStatement(DELETE);
		ps.setInt(1, no);
		int s=ps.executeUpdate();
		if(s==0){
			System.out.println("deleted");
		}
		else{
			System.out.println("not deleted");
		}
	}
	
	}
}
