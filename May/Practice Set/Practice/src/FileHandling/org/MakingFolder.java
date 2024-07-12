package FileHandling.org;
import java.io.*;

public class MakingFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class");
		boolean k=f.exists();
		
		if(k)
		{
			System.out.println("Folder Already Exist");
		}
		else
		{
			boolean n=f.mkdir();
			if(n)
			{
				System.out.println("Folder created Succesfully...");
			}
			else
			{
				System.out.println("Some problem there...");
			}
		}
	}

}
