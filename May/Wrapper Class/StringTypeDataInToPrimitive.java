

import java.util.*;

class StringToPrimi
{
	void result(String s) throws ArithmeticException
	{
     	System.out.println("Before conversion data "+s);
		
		int a=Integer.parseInt(s);
		System.out.println("After conversion of data " + a);
	}
}



public class StringTypeDataInToPrimitive
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringToPrimi st=new StringToPrimi();
		System.out.println("Enter String value");
		 String s=sc.nextLine();
		try
		{	
		  st.result(s);
		}
		catch(Exception ex)
		{
	          System.out.println("Just Input there number String");		
		}

		

	}
}