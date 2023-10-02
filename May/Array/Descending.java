import java.util.*;

class Descending
{
	public static void main(String x[])
	{
		int i,j,temp;
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter five Values in Array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<a.length; i++)
		{
			for(j=(i+1); j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Array After Decending Order: ");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		
	}
}