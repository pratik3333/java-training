//Q3. Given an array, we need to copy its elements in a different array,

import java.util.*;

public class CopyArray
{
	public static void main(String args[])
	{
		int s=1;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		//int b[]=new int[];
		
		System.out.println("Enter Array values");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
			s++;
		}
		int b[]=new int[s];
		
		System.out.println("Display first array");
		for(int i=0; i<5; i++)
		{
		    System.out.print(a[i] + " ");
			b[i]=a[i];  //Copy first array into second
		}
		System.out.println();
		System.out.println("Display Copy array");
		for(int i=0; i<5; i++)
		{
			System.out.print(b[i] + " ");
		}
		
	}
}