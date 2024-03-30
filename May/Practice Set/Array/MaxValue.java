
import java.util.*;

public class MaxValue
{
	public static void main(String args[])
	{
		int temp=0;
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter five values of array");
		
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display array values");
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		
		for(int i=1; i<4; i++)
		{
			if(a[i]<a[i+1])
			{
				temp=a[i+1];
				
			}
		}
		System.out.print("Maximum value is " + temp);
		//System.out.println(temp);
		
	}
}