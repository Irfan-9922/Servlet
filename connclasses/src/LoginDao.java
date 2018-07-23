

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String name,int m){
		boolean status=false;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection

("jdbc:oracl:thin:@localhost:1521:xe", "system", "9922");
			PreparedStatement ps=con.prepareStatement

("select*from login where userid=? and password=?");
		ps.setString(1, name);
        ps.setInt(2, m);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		return status;
	}

}