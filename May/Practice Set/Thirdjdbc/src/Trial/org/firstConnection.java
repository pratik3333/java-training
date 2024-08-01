package Trial.org;

import java.util.Scanner;
import java.sql.*;


public class firstConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//		com.mysql.cj.DriverManager d=new com.mysql.cj.DriverManager();
//		DriverManager.registerDriver(d);
//		
//		System.out.println("Driver Registed succesfully..");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			System.out.println("Database is connected");
			Statement stmt=conn.createStatement();
			
			System.out.println("Enter id name email");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String email=sc.nextLine();
			
			int value=stmt.executeUpdate("insert into employee values(id,'name' ,'email')");
			
			if(value>0)
			{
				System.out.println("Record save succesfully....");
			}
			else
			{
				System.out.println("Something wrong while puting record");
			}
			
		}
		else
		{
			System.out.println("Database is not connected");
		}
		
	}

}
