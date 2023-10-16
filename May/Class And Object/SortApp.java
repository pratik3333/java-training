import java.util.Scanner;

class Array
{
	int a[];
	
	void setArray(int a[])
	{
		this.a=a;
	}
	int []getSortArray()
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

public class SortApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		Array ar=new Array();
		
		ar.setArray(a);
		
		int []result=ar.getSortArray();
		for(int i=0; i<a.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}