/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author :IRFAN
 *TIME:11:46:26 pm
 * DATE:07-Jun-2017
 *PROJECTNAME:connection
 */
public class connection_test {
	static Connection con=null;
	public  static Connection getcon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system", "9922");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("connection is created");
		if(con!=null){
			
		}
		else{
			System.out.println("not created");
		}
		return con;
		
	}
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getcon();
	}
*/
}
