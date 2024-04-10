package org.techHub;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;



public class DatabaseConnection {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
			if(conn!= null)
			{
				
				System.out.println("Connection succesfull");
				
				System.out.println("Enter id and name of student");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				
				
				PreparedStatement stmt=conn.prepareStatement("insert into students values(?,?)");
				stmt.setInt(1, id);
				stmt.setString(2, name);
				
				int v=stmt.executeUpdate();
				if(v>0)
				{
					System.out.println("Data inserted");
				}
				else
				{
					System.out.println("Data not inserted");
				}
				
				stmt=conn.prepareStatement("select *from students");
				ResultSet rs=stmt.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
			
			}
			else
			{
				System.out.println("Something went wrong");
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
