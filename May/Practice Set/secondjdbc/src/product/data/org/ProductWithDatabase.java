package product.data.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ProductWithDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		if(conn!=null)
		{
			do
			{
				System.out.println("Enter 1 for add product");
				System.out.println("Enter 2 for view product");
				System.out.println("Enter 3 for delete product by id");
				System.out.println("Enter 4 for update product description by product name");
				System.out.println("Enter choice");
				int choice=sc.nextInt();
				
				
				switch(choice)
				{
				case 1:
					
					System.out.println("Enter product name ,description and price");
					
//					int id=sc.nextInt();
					sc.nextLine();
					String name=sc.nextLine();
					String desc=sc.nextLine();
					int price=sc.nextInt();
					
					PreparedStatement stmta=conn.prepareStatement("insert into product values(0,?,?,?)");
					
//					stmta.setInt(1, id);
					stmta.setString(1, name);
					stmta.setString(2, desc);
					stmta.setInt(3, price);
					
					int value=stmta.executeUpdate();
					
					if(value>0)
					{
						System.out.println("Record save succesfully...");
					}
					else
					{
						System.out.println("Something went wrong while saving record...");
					}
					
					break;
				case 2:
					
					Statement stmtv=conn.createStatement();
					ResultSet rs=stmtv.executeQuery("select *from product");
					
					while(rs.next())
					{
						int i=rs.getInt(1);
						String n=rs.getString(2);
						String d=rs.getString(3);
						int p=rs.getInt(4);
						
						System.out.println(i+"\t"+n+"\t"+d+"\t"+p);
					}
					
					break;
				case 3:
					System.out.println("Enter id for delete product");
					int did=sc.nextInt();
					
					PreparedStatement stmtd=conn.prepareStatement("delete from product where id=?");
					stmtd.setInt(1, did);
					
					int val=stmtd.executeUpdate();
					if(val>0)
					{
						System.out.println("Record deleted succesfully...");
					}
					else
					{
						System.out.println("something went wrong while deleting rocord...");
					}
					break;
				case 4:
					
					
					System.out.println("Enter product name where you want to update description...");			
					sc.nextLine();
					String pn=sc.nextLine();
					System.out.println("Write Description of product");
					String des=sc.nextLine();
					
					
					PreparedStatement stmtu=conn.prepareStatement("update product set description=? where name=?");
					
					stmtu.setString(1, des);
					stmtu.setString(2, pn);
					
					int v=stmtu.executeUpdate();
					if(v>0)
					{
						System.out.println("Product description updated succesfully....");
					}
					else
					{
						System.out.println("Something went wrong while updating description");
					}
					
					
					break;
					default:
						System.out.println("Wrong choice");
				}
				
			}while(true);
		}
		else
		{
			System.out.println("Connection faild");
		}
		
		conn.close(); //Connection close
	}

}
