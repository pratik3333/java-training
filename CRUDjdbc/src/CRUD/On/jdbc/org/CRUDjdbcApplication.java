package CRUD.On.jdbc.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class CRUDjdbcApplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  //Driver Load
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			
			do
			{
				System.out.println("Enter 1 for add book");
				System.out.println("Enter 2 for view all books");
				System.out.println("Enter 3 for Update book description");
				System.out.println("Enter 4 for delete book");
				System.out.println("Enter choice");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter book name, description and price");
					sc.nextLine();
					String bname=sc.nextLine();
					String bdesc=sc.nextLine();
					int price=sc.nextInt();
					
					PreparedStatement stmta=conn.prepareStatement("insert into bookstore values(0,?,?,?)");
					
					stmta.setString(1, bname);
					stmta.setString(2, bdesc);
					stmta.setInt(3, price);
					
					int value=stmta.executeUpdate();
					if(value>0)
					{
						System.out.println("Record save succesfully...");
					}
					else
					{
						System.out.println("Something went wrong while saving record");
					}
					
					break;
				case 2:
					
					Statement stmtv=conn.createStatement();
					ResultSet rs=stmtv.executeQuery("select *from bookstore");
					
					while(rs.next())
					{
						int i=rs.getInt(1);
						String n=rs.getString(2);
						String d=rs.getString(3);
						int p=rs.getInt(4);
						
						System.out.println(i + "\t" + n +"\t"+ d +"\t"+ p);
					}
					break;
				case 3:
					System.out.println("Enter book id which you want to update");
					int uid=sc.nextInt();
					System.out.println("Enter description for product");
					sc.nextLine();
					String udes=sc.nextLine();
					
					PreparedStatement stmtu=conn.prepareStatement("Update bookstore set description=? where id=?");
					stmtu.setString(1, udes);
					stmtu.setInt(2, uid);
					
					int valu=stmtu.executeUpdate();
					
					if(valu>0)
					{
						System.out.println("Record updated Succesfully...");
					}
					else
					{
						System.out.println("failed to update..");
					}
					
					break;
				case 4:
					System.out.println("Enter id for delete book");
					int idd=sc.nextInt();
					
					PreparedStatement stmtd=conn.prepareStatement("delete from bookstore where id=?");
					stmtd.setInt(1, idd);
					
					int vald=stmtd.executeUpdate();
					if(vald>0)
					{
						System.out.println("Book Deleted succesfully..");
					}
					else
					{
						System.out.println("Something went wrong..");
					}
					break;
					default:
						System.out.println("Wrong choice");
				}
				
			}while(true);
		}else
		{
			System.out.println("Connection faild");
		}
	}

}
