package first.org;
import java.util.*;
import java.sql.Driver;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

//		 jd;
		try {
			com.mysql.cj.jdbc.Driver	jd = new com.mysql.cj.jdbc.Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DriverManager.registerDriver(jd);
		
		System.out.println("Driver register Succesfully...");
		
	}

}
