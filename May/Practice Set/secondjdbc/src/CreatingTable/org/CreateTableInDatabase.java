package CreatingTable.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableInDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		try
		{
		String q="create table table1 (tid int(5) primary key auto_increment, tname varchar(20) not null)";
		
		Statement stmt=conn.createStatement();
		
		stmt.executeUpdate(q);
		
		System.out.println("table created Succesfully...");
		conn.close();
		
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
