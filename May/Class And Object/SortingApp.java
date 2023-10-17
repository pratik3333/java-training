import java.util.Scanner;

class Sort
{
	int a[];
	Sort(int a[])
	{
		this.a=a;
	}
	
	int []sortLogic()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;
	}
}

public class SortingApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sort s1=new Sort(a);
		int []result=s1.sortLogic();
		
		System.out.println("Display Sorted Array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}