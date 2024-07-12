package FileHandling.org;
import java.io.*;

public class TotalSpaceOfAllFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f[]=File.listRoots();
		long overallspace = 0;
		for(int i=0; i<f.length; i++)
		{
			long totalspace=f[i].getTotalSpace();
			
			System.out.println(f[i] + "Total space is " + (totalspace/1073741824));
			
			overallspace=overallspace+(totalspace/1073741824);
		}
		
		System.out.println("Total space on system is "+overallspace +" GB");
	}

}
