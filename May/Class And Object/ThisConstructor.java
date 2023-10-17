//Note: this() constructor must be first line of code in calling constructor.

import java.util.Scanner;

class ThisCon 
{
	ThisCon()
	{
		this(5,5);
		System.out.println("I pass values to another Constructor");
	}
	ThisCon(int a,int b)
	{
       this(1.2f,3.2f);
	   System.out.println("Addition of two Integer is "+ (a+b));	   
	}
	ThisCon(float p,float q)
	{
		System.out.println("Addition of two Float is "+ (p+q));
	}
}

public class ThisConstructor
{
	public static void main(String x[])
	{
		ThisCon tc=new ThisCon();
	}
}