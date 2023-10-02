import java.util.*;

class MaxAndMin
{
	public static void main(String x[])
	{
		int i,max,min;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much values you want to add in Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter values in array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		min=a[0];
		for(i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.printf("Maximum value is %d and Minimum Value is %d",max,min);
	}
}