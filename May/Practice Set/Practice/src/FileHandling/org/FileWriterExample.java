package FileHandling.org;
import java.util.*;
import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data");
		String data=sc.nextLine();
		
		FileWriter fw=new FileWriter("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo.txt");
		
		fw.write(data);
		fw.close();
		System.out.println("Record save succesfully....");
	}

}
