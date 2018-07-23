package simple;

import java.sql.Connection;
import java.sql.Statement;

import connection_Util.conUtil;

public class delete {
	public static void main(String[] args) {
		try{
			Statement st=null;
			Connection con=conUtil.getconnection();
			st=con.createStatement();
			String sql="delete form register where phno=992286";
			
			st.executeUpdate(sql);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
