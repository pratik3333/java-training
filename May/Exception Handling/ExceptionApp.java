
import java.util.*;

interface First
{
	void divis();
}

class Trial implements First
{
	int a,b,c;
	void initi(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
 	public void divis()
	{

      try
	  {
		  c=a/b;
		  System.out.println("Division of two number is " + c);
	  }	  
	  catch(Exception ex)
	  {
		  System.out.println("Error is " + ex);
	  }
	  finally
	  {
		  System.out.println("Thank you");
	  }
		
	}
}

public class ExceptionApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Trial tr=new Trial();
		
		System.out.println("Enter two values for division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		tr.initi(a,b);
		tr.divis();
		
	}
}