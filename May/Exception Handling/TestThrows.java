import java.util.*;

class Test
{
	int a,b,c;
	
	void div(int a, int b) throws ArithmeticException
	//void div(int a, int b) throws Exception
	{
		this.a=a;
		this.b=b;
		
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			c=a/b;
			System.out.println("Division of two number is "+c);
		}
	}
}

public class TestThrows
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two values");
		a=sc.nextInt();
		b=sc.nextInt();
		
		Test t=new Test();
		
		try
		{
			t.div(a,b);
		}
		catch(Exception ex)
		{
			//System.out.println(ex);
			System.out.println("Dont put second value as Zero");
		}
		
	}
}