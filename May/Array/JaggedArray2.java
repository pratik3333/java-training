import java.util.*;

public class JaggedArray2
{
	public static void main(String x[])
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][];
		
		System.out.println("Enter Column Size: ");
		for(i=0; i<a.length; i++)
		{
			int no= sc.nextInt();
			a[i]=new int[no];
		}
		
		for(i=0; i<a.length; i++)
		{
			System.out.printf("\nEnter %d column values\n",i);
			for(j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.printf("Display Jagged Array: \n");
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}