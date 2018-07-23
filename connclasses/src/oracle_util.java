import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class oracle_util {
	/*public static Connection getOracleConnection() throws ClassNotFoundException,SQLException{
		String hostName="localehost";
		String sid="XE";
		String userName="system";
		String password="9922";
	return	getOracleConnection(hostName,sid,userName,password);
	}*/
	public static Connection getOracleConnection(String hostName,String sid,String userName,String password)throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	String connectionUrl="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con=DriverManager.getConnection("localhost", "system","9922");
		return con;
	}
}

