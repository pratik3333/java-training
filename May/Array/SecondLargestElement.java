
import java.util.*;

public class SecondLargestElement
{
	public static void main(String x[])
	{
		int i,j,temp;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Five Values in arrray");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	
		for(i=a.length-1; i>=0; i--)
		{
			if(a[i]!=a[i-1])
			{
				System.out.printf("Second Largest Element is %d",a[i-1]);
				break;
			}
		}
	}
}