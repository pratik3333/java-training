package secondjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class FetchEmpData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			Statement stmt=conn.createStatement();
			
//			ResultSet rs=stmt.executeQuery("Select");
			
			do
			{
				System.out.println("Enter 1 for count employee");
				System.out.println("Enter 2 for view email");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				 
				case 1:
					ResultSet rs=stmt.executeQuery("select count(id) as totalcount from employee");
				
					System.out.println(rs);
					break;
				case 2:
					ResultSet r=stmt.executeQuery("select email from employee");
					
					while(r.next())
					{
						String email=r.getString(1);
						System.out.println(email);
					}
					break;
					default:
						System.out.println("Wrong choice");
				}
				
			}while(true);
		}
		else
		{
			System.out.println("Something went wrong");
		}
	}

}
