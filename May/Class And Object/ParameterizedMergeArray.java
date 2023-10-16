import java.util.Scanner;

class MergeArray
{
	int a[];
	int b[];
	int z=1;
	
	MergeArray(int a[],int b[])
	{
	  this.a=a;
      this.b=b;	  
	}
	
	public int[] getMergeArray()
	{
		int lengthofy=a.length+b.length;
		int y[]=new int[lengthofy];
		
		for(int i=0; i<a.length; i++)
		{
			y[z]=a[i];
			z++;
		}
		for(int i=0; i<b.length; i++)
		{
			y[z]=b[i];
			z++;
		}
		return y;
		
	}
}

public class ParameterizedMergeArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter values in first array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter values in second array");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeArray ma=new MergeArray(a,b);
		
		int[] result=ma.getMergeArray();
		for(int i=0; i<z; i++)
		{
			System.out.println(result);
		}
		//ma.getMergeArray();
	}
}