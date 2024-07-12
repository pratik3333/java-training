package FileHandling.org;
import java.io.*;


public class CreatingFolderAndFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder");
		
		boolean k=f.exists();
		
		File f1=new File("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\second.doc");
		
		boolean ff1=f1.exists();
		if(k)
		{
			System.out.println("Folder already Exit");
			if(ff1)
			{
				System.out.println("file already exist..");
			}
			
		}
		else
		{
			f.mkdir();
			f1.createNewFile();
			System.out.println("Folder Created and File...");
			
		}
		
		

	}

}
