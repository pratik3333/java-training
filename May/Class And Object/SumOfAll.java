import java.util.Scanner;

class Sum
{
	int a[];
	
	void setData(int ...a)
	{
		this.a=a;
	}
	
	int displaySum()
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=a[i]+sum;
		}
		
		return sum;
	}
}

public class SumOfAll
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sum s1=new Sum();
		s1.setData(a);
		int result=s1.displaySum();
		System.out.println("Sum of all elements is " + result);
	}
}