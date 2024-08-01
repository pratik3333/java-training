package secondjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		System.out.println("Connection succesfull");
		

	}

}
