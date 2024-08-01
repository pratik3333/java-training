package secondjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class RecordSaveIntoDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			do
			{
			System.out.println("Enter 1 for add employee");
			System.out.println("Enter 2 for view all employee");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter id name and email");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				String email=sc.next();
				
		        PreparedStatement stmt=conn.prepareStatement("insert into employee values(?,?,?)");
		        
		        stmt.setInt(1, id);
		        stmt.setString(2, name);
		        stmt.setString(3, email);
		        
		        int value=stmt.executeUpdate();
		        
		        if(value>0)
		        {
		        	System.out.println("Record save succesfully....");
		        }
		        else
		        {
		        	System.out.println("Something went wrong while saving record");
		        }
				break;
			case 2:
				Statement stm=conn.createStatement();
				ResultSet rs=stm.executeQuery("select *from employee");
				
				while(rs.next())
				{
					int i=rs.getInt(1);
					String n=rs.getString(2);
					String e=rs.getString(3);
					
					System.out.println(i +"\t"+ n+"\t"+ e);
				}
				
				break;
				default:
					System.out.println("Wrong choice");
			}
			
			}
			while(true);
			
			
		}
		else
		{
			System.out.println("Database connection failed...");
		}
	}

}
