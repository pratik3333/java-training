package AllException;
import java.util.*;

class Div
{
	int a,b,c;
	
	void division(int a, int b) throws ClassNotFoundException
	{
		this.a=a;
		this.b=b;
		
		c=a/b;
		
		System.out.println("Divison of two number is "+c);
		
	}
}

public class ThrowsExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			Div d=new Div();
			d.division(a, b);
		}
		catch(Exception ex)
		{
			System.out.println("Please dont divide number by zero");
		}
		finally
		{
			System.out.println("I am in finally block");
		}
	}

}
