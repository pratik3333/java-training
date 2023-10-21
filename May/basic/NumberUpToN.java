
import java.util.Scanner;

class NumberUpToN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		for(int i=1; i<=no; i++)
		{
			System.out.println(i);
		}
	}
}