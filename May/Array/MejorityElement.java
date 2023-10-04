import java.util.*;

public class MejorityElement
{
	public static void main(String x[])
	{
		int i,j,count=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.printf("\nEnter the Size of Array\n");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.printf("\nEnter the array values");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.printf("\nDisplay Array Values\n");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println();
		int flag=0;
		
		for(i=0; i<a.length; i++)
		{
			count=0;
			for(j=i; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>a.length/2)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.printf("\n%d is a Mejority Element\n",a[i]);
		}
		else
			{
				System.out.println("There is no mejority Elements in given Array");
			}
	
	}
}