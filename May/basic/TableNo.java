import java.util.Scanner;

class TableNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i*no);
			i++;
		}
	}
}