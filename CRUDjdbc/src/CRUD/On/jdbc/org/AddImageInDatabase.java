package CRUD.On.jdbc.org;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddImageInDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try
		{
//			Connection conn=DriverManager.getConnection("jdbc:mysql;//localhost:3306/techhub","root","root");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techhub","root","root");
		
		PreparedStatement pstmt=conn.prepareStatement("insert into image values (0,?)");
		
		FileInputStream fr= new FileInputStream("C:\\Users\\pratik\\OneDrive\\Desktop\\password-min.jpeg");
		
		
		pstmt.setBinaryStream(1, fr,fr.available());
		pstmt.executeUpdate();
		
		System.out.println("Image save succesfully....");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
