package FileHandling.org;
import java.util.*;
import java.io.*;

public class CreateNewFileBYFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class\\testing1.txt");

		boolean k=f.exists();
		
		if(k)
		{
			System.out.println("File already created...");
		}
		else
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File created");
		}
	}

}
