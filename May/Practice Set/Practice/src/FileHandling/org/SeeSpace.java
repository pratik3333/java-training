package FileHandling.org;
import java.io.*;

public class SeeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f[]=File.listRoots();
		
		for(int i=0; i<f.length; i++)
		{
			long totalspace=f[i].getTotalSpace();
			long freespace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"\t"+"Total space is "+(totalspace/1073741824) +" GB "+"Free space is "+(freespace/1073741824)+" GB");
		}
	}

}
