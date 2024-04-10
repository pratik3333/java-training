import java.util.*;

public class FloatToReference
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter float value");
		
		Float f=sc.nextFloat();
		
		System.out.println("Float value is "+f);
	
		int a=(int)(f+0.5f);
		System.out.println("After conversion in int "+a);
	}
}