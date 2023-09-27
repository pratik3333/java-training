import java.util.*;

class Factors 
{
	public static void main(String [] x)
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println(i);
			}
		}
		
	}
}