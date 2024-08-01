package jdbcFirstProject;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(d);
	System.out.println("Driver Registed Successfully........");
	}

}
