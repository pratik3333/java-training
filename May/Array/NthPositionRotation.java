import java.util.*;

public class NthPositionRotation
{
	public static void main(String x[])
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the Value of array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Values");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\nEnter from which position you want to Rotate your Array\n");
		int ro = sc.nextInt();
		
		int b[]=new int[size];
		int c[]=new int[size];
		int d[]=new int[size];
		
		int c1=1,c2=1;
		
		for(i=0; i<ro; i++) //in b[] array we save upto position's value.
		{
			b[i]=a[i];
			c1++;
		}
		int k=0;
		for(i=ro; i<a.length; i++) // in c[] array we save from position to last values.
		{
			c[k]=a[i];
			k++;
		}
		int n=0;
		for(i=0; i<=k; i++) //in d[] we save from c[].
		{
			d[i]=c[i];
			n++;
		}
		int z=0;
		for(i=n-1; i<a.length; i++) // in d[] we save b[].
		{
			d[i]=b[z];
			z++;
		}
		System.out.printf("\nFinal Result is\n");
		for(i=0; i<d.length; i++)
		{
			System.out.printf("%d\t",d[i]);
		}
		
		
	}
}