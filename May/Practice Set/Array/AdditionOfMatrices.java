//Given two matrices A and B of same size, the task to add them in Java. 
//Examples: 
//Input: A[][] = {{1, 2}, 
 //               {3, 4}}
 //      B[][] = {{1, 1}, 
 //               {1, 1}}
//Output: {{2, 3}, 
 //        {4, 5}}


import java.util.*;

public class AdditionOfMatrices
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		//a[i][j]=sc.nextInt();
		//b[i]=sc.nextInt();
		
		System.out.println("Enter values in first array");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter values in second array");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				c[i][j]=(a[i][j])+(b[i][j]);
			}
		}
	
	
		System.out.println("Display addition of array");	
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}