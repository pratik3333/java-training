import java.util.Scanner;

class Merge
{
	int a[];
	int b[];
	
	Merge(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	int []getMergeArray()
	{
		int lengthofy=a.length+b.length;
		
		int y[]=new int[lengthofy];
		int j=0;
		for(int i=0; i<y.length; i++)
		{
			if(i<a.length)
			{
				y[i]=a[i];
			}
			else
			{
				y[i]=b[j++];
			}
		}
		
		return y;
		
	}
}

public class MergeArray
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
		
		Merge mr=new Merge(a,b);
		
		int []result=mr.getMergeArray();
		
		System.out.println("After merging");
		for(int i=0; i<result.length; i++)
		{
			System.out.printf("%d\t",result[i]);
		}
	}
}