
import java.util.*;

interface Operation
{
	void add();
}


class Addition implements Operation
{
	int a; int b;
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		int result;
		result=a+b;
		
		System.out.println("Addition is " + result);
	}
}


public class AdditionAppInterface
{
	public static void main(String args[])
	{
		Addition ad=new Addition(10,20);
		ad.add();
	}
}