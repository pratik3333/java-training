package FileHandling.org;
import java.io.*;

public class FileReadUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\Folder By MakingFolder Class\\testing1.txt");
	
		BufferedReader bfr=new BufferedReader(fr);
		
		String line;
		
		while((line=bfr.readLine())!=null)
		{
			String r=(String)line;
			System.out.println(r);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
