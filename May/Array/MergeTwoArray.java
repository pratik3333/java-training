import java.util.*;

public class MergeTwoArray
{
	public static void main(String x[])
	{
		int i,j,k=0,temp;
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Three Values in first Array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Three Values in Second Array");
		for(i=0; i<b.length; i++)
		{
		    b[i]=sc.nextInt();
			
		}
		
		
		for(i=0; i<a.length; i++)
		{
			c[k]=a[i];
			k++;
		}
		for(i=0; i<a.length; i++)
		{
			c[k]=b[i];
			k++;
		}
		for(i=0; i<c.length; i++)
		{
			for(j=i+1; j<c.length; j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			
		}
		System.out.println("After merging and arranging it in Descending order: ");
		
		for(i=0; i<c.length; i++)
		{
			System.out.printf("%d\t",c[i]);
		}
		
	}
}