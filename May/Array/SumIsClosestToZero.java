import java.util.*;

public class SumIsClosestToZero
{
	public static void main(String x[])
	{
		int i,j,k=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[50];
		
		System.out.println("Enter Five Values in Array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(i=0; i<a.length; i++)
		{
			sum=0;
			for(j=i+1; j<a.length; j++)
			{
				sum=a[i]+a[j];
				b[k]=sum;
				k++;
				sum=0;
				
			}
		}
		
		
		for(i=0; i<k; i++)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
}