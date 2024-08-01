package secondjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionsecond {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			System.out.println("Connection succesful....");
			Statement stmt=conn.createStatement();
			int value=stmt.executeUpdate("insert into employee values(1,'pratik','pratik@gmail.com')");
			if(value>0)
			{
				System.out.println("Value inserted succesfully...");
			}
			else
			{
				System.out.println("Something went wrong while inserting value");
			}
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
	}

}
