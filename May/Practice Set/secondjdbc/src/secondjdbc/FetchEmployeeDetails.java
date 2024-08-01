package secondjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchEmployeeDetails {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		
		if(conn!=null)
		{
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select *from employee");
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				
				System.out.println(id + "\t" + name +"\t" + email);
			}
			
		}
		else
		{
			System.out.println("Database is not connected....");
		}
	}

}
