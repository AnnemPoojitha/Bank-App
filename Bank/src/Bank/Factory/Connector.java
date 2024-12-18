package Bank.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	public static Connection connect() throws ClassNotFoundException, SQLException{
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/bank";
		String user="root";
		String pass="aruna@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,user,pass);
		return con;
	}
	}