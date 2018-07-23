package loosecoupling_property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class factory {
	
	public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
		//locate propertis file
	ResourceBundle bundle=ResourceBundle.getBundle("C://irfan/servlet/loosecoupling_property_file/ hindi.properties");
	
	bundle=ResourceBundle.getBundle(baseName)
	
	}

}
