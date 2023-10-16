import java.util.Scanner;


class Arr 
{
	private int a[];
    public void setArray(int a[])
	{
		this.a=a;
	}	
	public void getArray()
	{
		System.out.println("Display Array values");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}

public class ArrayPass
{
	public static void main(String x[])
	{
		Arr c=new Arr();
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		c.setArray(a);
		c.getArray();
		
		
		
	}
}