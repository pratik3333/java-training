import java.util.Scanner;

class Array
{
	private Array a[];
	public void setArray(Array a[])
	{
		this.a=a;
	}
	public void showArray()
	{
		System.out.println("Display array values");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}

public class ArrayApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		Array a[]=new Array[5];
		
		for(int i=0; i<a.length; i++)
		{
			int a[i]=sc.nextInt();
		}
	    a.setArray(a);
		a.showArray();
	}
}