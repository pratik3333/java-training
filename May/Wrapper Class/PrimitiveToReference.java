
import java.util.*;

public class PrimitiveToReference
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer value");
		int a=sc.nextInt();
		System.out.println("Primitive type value "+a);
		
		Integer b=Integer.valueOf(a);
		System.out.println("After conversion in reference type value "+b);
		
		System.out.println("Enter float value");
		float f=sc.nextFloat();
		
		System.out.println("Before conversion "+b);
		
		Float f1=Float.valueOf(f);
		System.out.println("After conversion "+ f1);
	
		
	}
}