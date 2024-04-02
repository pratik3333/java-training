
interface Printable
{
	void show();
	void test();
}

interface Showable
{
	void show();
}

class Multi implements Printable,Showable
{
	public void show()
	{
	
	}
	//public void show()
	//{
	//	System.out.println("Hello i am from showable");
	//}
	
	public void test()
	{
		
	}
}


class Adp extends Multi
{
	public void test()
	{
		System.out.println("Hello i am inherite from multi class class");
	}
}

public class MultiInheriByInterface
{
	public static void main(String args[])
	{
		Adp a=new Adp();
		
		a.test();
	}
}