package FileHandling.org;
import java.io.*;
import java.util.*;

public class BufferWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		
		
		FileWriter fw=new FileWriter("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class\\testing1.txt",true);
		
		BufferedWriter bfw=new BufferedWriter(fw);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		bfw.write(str);
		bfw.newLine();
		bfw.close();
		fw.close();
		System.out.println("Data save Succesfully...");
//		bfw.close();
		
	}

}
