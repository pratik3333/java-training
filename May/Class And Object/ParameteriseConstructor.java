import java.util.Scanner;

class Add
{
	Add(int a,int b)
	{
		System.out.printf("Addition is %d",a+b);
	}
	
}

public class ParameteriseConstructor
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter  values");
		a=sc.nextInt();
		b=sc.nextInt();
		
		Add ad=new Add(a,b);
	}
}