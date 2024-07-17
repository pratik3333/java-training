package FileHandling.org;
import java.io.*;
import java.util.*;

public class BufferReaderClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class\\testing1.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		
		String line;
		while((line=bfr.readLine()) != null)
		{
			String rr=(String)line;
			
			System.out.println(rr);
			Thread.sleep(1000);
		}
	}

}
