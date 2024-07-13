package FileHandling.org;
import java.util.*;
import java.io.*;

public class ByteCodeFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fips=new FileInputStream("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo3.txt");
		
		FileOutputStream fops=new FileOutputStream("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo3.txt");
		int data;
		while((data=fips.read())!=-1)
		{
			byte b=(byte)data;
			System.out.println(b);
//			fops.write(data);
		}
		
		fops.close();
		fips.close();
		System.out.println("Success....");
	}

}
