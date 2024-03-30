
//Java Array Program to Print a 2D Array

import java.util.*;


public class TwoDArray
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
	   
	   int a[][] = new int[3][3];
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<3; i++)
	   {
		   for(int j=0; j<3; j++)
		   {
			   a[i][j]=sc.nextInt();
		   }
	   }
	   
	   System.out.println("Display Two Dimensional array");
	   for(int i=0; i<3; i++)
	   {
		   for(int j=0; j<3; j++)
		   {
			   System.out.print(a[i][j] + " ");
		   }
		   System.out.println();
	   }
   }
}