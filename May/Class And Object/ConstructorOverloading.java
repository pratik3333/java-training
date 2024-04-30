import java.util.Scanner;

class Add
{
	Add(int a,int b)
	{
		System.out.printf("\nAddition of two Integer number is %d",a+b);
	}
	
	Add(float x,float y)
	{
		System.out.printf("\nAddition of two Float number is %f",x+y);
	}
}

public class ConstructorOverloading
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter Float values");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		
		Add adi=new Add(a,b);
		Add adf=new Add(x,y);
	}
}