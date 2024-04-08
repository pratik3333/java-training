
import java.util.*;

class Test
{
	int a,b,c;
	void div(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		try
		{
			c=a/b;
			System.out.println("Division is " + c);
		}
		catch(Exception ex)
		{
			throw new ArithmeticException("Dont divide by zero");
		}
		finally
		{
			System.out.println("I am finally block");
		}
		
		
	}
}

public class TestThrow
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two Values");
		a=sc.nextInt();
		b=sc.nextInt();
		
		Test t=new Test();
		
		t.div(a,b);
	}
}