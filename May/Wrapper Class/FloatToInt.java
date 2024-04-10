

import java.util.*;

public class FloatToInt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Float value");
		Float f=sc.nextFloat();
		
		int a=(int)(f  +0.5f);
		System.out.println("After conversion in integer " + a);
		
	}
}