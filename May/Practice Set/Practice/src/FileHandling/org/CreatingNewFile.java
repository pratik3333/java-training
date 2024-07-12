package FileHandling.org;
import java.io.*;


public class CreatingNewFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class\\first.doc");
		
		boolean k=f.createNewFile();
		boolean n=f.exists();
		
		if(k)
		{
			System.out.println("File Created SuccesFully....");
			
		}
		else if(n)
		{
			System.out.println("File already Exist...");
			
		}
		else
		{
			System.out.println("Something went wrong");
		}
			
	}

}
