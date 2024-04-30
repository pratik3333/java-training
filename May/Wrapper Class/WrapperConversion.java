
public class WrapperConversion
{
	public static void main(String args[])
	{
		int a=100;
		System.out.println("value of A before conversion "+ a);
		
		Float f=Float.valueOf(a);
		System.out.println("Value of a after conversion in Float "+ f); //primitive to reference variable conversion
		
		String str=String.valueOf(a);
		System.out.println("After conversion in string "+str);
		
		Double dou=Double.valueOf(a);
		System.out.println("After conversion in Double "+dou);
		
	}
}