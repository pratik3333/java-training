import java.util.Scanner;

public class MaxValue
{
	int i=0;
	int max=0;
	int maximum(int a[])
	{
		if(i<a.length)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			i++;
		   return maximum(a);
		}
		return max;
	}
	
	
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		MaxValue mx =new MaxValue();
		int result=mx.maximum(a);
		System.out.println("Maximum value is " + result);
	}
}