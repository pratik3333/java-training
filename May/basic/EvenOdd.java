import java.util.*;

class EvenOdd
{
	public static void main(String []x)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		
		System.out.println("Even numbers are");
		for(int i=1; i<=no; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd numbers are");
		for(int i=1; i<=no; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}