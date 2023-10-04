import java.util.*;

public class CountOccurence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,count=1,temp;
		
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter Array values");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array values");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println();
		
		for(i=0; i<a.length; i++)
		{
			for(j=i; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(i=0; i<a.length; i++)
		{
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
			    System.out.printf("%d----%d\n",a[i],count);
				count=1;
            }
			
		}
		
		
	}
}