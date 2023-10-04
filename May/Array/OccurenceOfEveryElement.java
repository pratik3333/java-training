
import java.util.*;
public class OccurenceOfEveryElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,count=1;
		System.out.println("Enter the Size of Array");
		
		int size =sc.nextInt();	
		int a[]=new int[size];
		
		System.out.println("Enter the Array values");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Values");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.printf("\nOccurence Of Every Element is: \n");
		
		for(i=0; i<a.length; i++)
		{
			count=1;
			
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
				
			}
			if(a[i]!=-1)
			{
			System.out.printf("%d--->%d\n",a[i],count);
			
			}
		}
	}
}