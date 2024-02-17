import java.util.Scanner;

class OddNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int i=1;
		
		while(i<=no)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}