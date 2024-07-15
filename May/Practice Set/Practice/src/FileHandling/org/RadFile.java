package FileHandling.org;
import java.io.*;

public class RadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader( "H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo2.txt");
		
		int data;
		
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
