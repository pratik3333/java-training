//Write a Java Program for a given array of integers arr[] of size N and an integer,
 //the task is to rotate the array elements to the left by d positions.
//Examples:  
//Input: 
//arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
//Output: 3 4 5 6 7 1 2


import java.util.*;

public class ReverseArrayFromNth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int a[]=new int[size];
		int temp[]=new int[size];
		
		
		System.out.println("Enter array values");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Index to rotate array");
		int r=sc.nextInt();
		
		int k=0;
		
		
		for(int i=r; i<a.length; i++)
		{
		   temp[k]=a[i];	
		   k++;
		}
		for(int i=0; i<r; i++)
		{
			temp[k]=a[i];
			k++;
		}
		
		
		System.out.println("Display Rotate Array");
		for( k=0; k<a.length; k++)
		{
			System.out.print(temp[k] + " ");
		}
	}
}