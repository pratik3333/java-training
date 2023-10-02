import java.util.*;

public class EvenOdd
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i,p=0,q=0;
		int b[]=new int[5];
		int c[]=new int[5];
		
		System.out.println("Enter Five Values in Array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				b[p]=a[i];
				p++;
			}
			else
			{
				c[q]=a[i];
				q++;
			}
		}
		
		System.out.println("Even Elements are:");
		for(i=0; i<p; i++)
		{
			System.out.printf("%d\t",b[i]);
		}
		System.out.println();
		
		System.out.println("Odd Elements are:");
		for(i=0; i<q; i++)
		{
			System.out.printf("%d\t",c[i]);
		}
	}
}