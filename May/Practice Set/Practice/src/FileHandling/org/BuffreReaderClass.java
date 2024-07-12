package FileHandling.org;
import java.io.*;

public class BuffreReaderClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo2.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		
		String line;
		
		while((line=bf.readLine())!=null)
		{
			String rr=(String)line;
			System.out.println(rr);
			Thread.sleep(500);
		}
	}

}
