package FileHandling.org;
import java.io.*;

public class CreatingFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandlingFOlderCreating");
		
		boolean k=f.exists();
		
		if(k)
		{
			System.out.println("Folder already exists");
		}
		else
		{
	        boolean mk=f.mkdir();
	        if(mk)
	        {
	        	System.out.println("Folder created succescfully....");
	        }
	        else
	        {
	        	System.out.println("Some problem there");
	        }
		}

	}

}
