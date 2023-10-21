import java.util.Scanner;

public class NaturalNumberNToOne
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		
		while(no!=0)
		{
			System.out.println(no);
			no--;
		}
	}
}