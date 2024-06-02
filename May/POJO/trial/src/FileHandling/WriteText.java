package FileHandling;

import java.util.*;
import java.io.*;

public class WriteText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data in file");
		String data=sc.nextLine();
		
		FileWriter fw=new FileWriter("H:\\Java training\\May\\POJO\\trial\\src\\FileHandling\\demo.txt",true);
		
		System.out.println("Data entered succesfully......");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		FileReader fr=new FileReader("H:\\Java training\\May\\POJO\\trial\\src\\FileHandling\\demo.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		
		
		System.out.println("Enter search name");
		String sname=sc.nextLine();
		
		String line;
		
		while((line=br.readLine())!=null)
		{
			if(sname.equals(line))
			{
				System.out.println("Name found ");
				break;
			}
		}
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		
	}

}
