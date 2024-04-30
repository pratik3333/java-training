/* Write program to create class name as MergeTwoArray with parameterized constructor 
MergeTwoArray(int [],int []): this constructor accept two array as parameter
int [] getMergeArray(): this function merge two array in third array and return new merged array */

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
		int j=0;
		for(int i=0; i<y.length; i++)
		{
			if(i<a.length)
			y[i]=a[i];
		   else
			   y[i]=b[j++];
			//z++;
		}
		/*for(int i=0; i<b.length; i++)
		{
			y[i+a.length]=b[i];
			//z++;
		}*/
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
		
		int []result=ma.getMergeArray();
		for(int i=0; i<result.length; i++)  //something went wrong with this line
		{
			System.out.println(result[i]);
		}
		//ma.getMergeArray();
	}
}