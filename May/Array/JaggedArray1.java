import java.util.*;

public class JaggedArray1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row,i,j,b=1;
		System.out.println("Enter Row Size");
		row=sc.nextInt();
		
		int a[][]=new int[row][];
		
		System.out.println("Please Enter colomn as per row");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("Enter Size of %d Column \n",b);
			b++;
			int no=sc.nextInt();
			a[i]=new int[no];
			
		}
		
		System.out.println("Please Enter the Jagged Array Values");
		k=1;
		for(i=0; i<a.length;i++)
		{
			//System.out.printf("Enter Values in %d row",k);
			System.out.println("Enter Values");
			k++;
			
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Display Jagged Array Values");
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
	}
}