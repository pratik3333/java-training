import java.util.*;

class SumOfElements
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0,i;
		
		System.out.println("Enter Array Elements: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.printf("Sum of all elements is %d",sum);
	}
}