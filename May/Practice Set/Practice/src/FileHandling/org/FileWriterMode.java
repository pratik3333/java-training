package FileHandling.org;
import java.io.*;
import java.util.*;

public class FileWriterMode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String..");
		String str=sc.nextLine();
		
		FileWriter fw=new FileWriter("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\second.doc");
		
		fw.write(str);
		fw.close();
		System.out.println("Data save Succesfully...");
		
	}

}
