//we want to create program create file and store text data in it.
package FileHandling.org;
import java.io.*;
import java.util.*;

public class ByteFormat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		FileOutputStream fos=new FileOutputStream("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo3.txt");
		
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		byte b[]=str.getBytes();
		
		fos.write(b);
		fos.close();
		System.out.println("Success....");
		
	}

}
