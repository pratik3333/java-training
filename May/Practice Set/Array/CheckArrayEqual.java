import java.util.*;

public class CheckArrayEqual
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int size1;
		int size2;
		
		System.out.println("Enter size of first array");
		size1=sc.nextInt();
		System.out.println("Enter size of second array");
		size2=sc.nextInt();
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		
		if(size1==size2)
		{
			System.out.println("Enter first array values");
	        	for(int i=0; i<size1; i++)
	             {
			         a[i]=sc.nextInt();
		          }
		
		    System.out.println("Enter second array values");
		       for(int i=0; i<size1; i++)
	        	{
			        b[i]=sc.nextInt();
		        }
				
				boolean f=true;
		
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==b[i])
				{
					f=true;
				}
				else
				{
					f=false;
					break;
				}
				
			}
			if(f==true)
			{
				System.out.println("Both array are equal");
			}
			else
			{
				System.out.println("Both array are not equal");
			}
		}
		else
		{
			System.out.println("Both array are not equal");
		}
		
		}
		else
		{
			System.out.println("Both array are not equal");
		}
		
	}
}