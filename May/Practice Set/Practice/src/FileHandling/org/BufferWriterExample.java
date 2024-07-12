package FileHandling.org;
import java.util.*;
import java.io.*;

public class BufferWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String data=sc.nextLine();
		
		FileWriter fw=new FileWriter("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo1.txt",true);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Data save Succesfully...");
		
		
		
	}

}
