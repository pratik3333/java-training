import java.util.*;

public class DiffrenceBetweenPair
{
	public static void main(String x[])
	{
		int i,j,diff=0;
		Scanner sc=new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter Array Size");
		size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter Array Values: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\nEnter Distinct diffrence Value:\n");
		int value =sc.nextInt();
		
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a.length; j++)
			{
				if(a[i]-a[j]==value)
				{
					System.out.printf("[%d %d]\n",a[i],a[j]);
				}
			}
		}
		
		
	}
}