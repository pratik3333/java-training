package Project.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;


public class ConnectionOfJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
			
			System.out.println("Connection succesfull");
			
			System.out.println("Enter id name salary");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
			
			PreparedStatement stmt=conn.prepareStatement("insert into HR values(?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, salary);
			
			int v=stmt.executeUpdate();
			
			if(v>0)
			{
				System.out.println("values Inserted");
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
