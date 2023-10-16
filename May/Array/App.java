import java.util.*;

class A
{
	private App a[];
	
	public void setArray(App a[])
	{
		this.a=a;
	}
	public void show()
	{
		for(int i=0; i<a.lenght; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}

public class App
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		A a[]=new A[5];
		//A v=new A();
		System.out.println("Enter array values");
		
		for(int i=0; i<a.length; i++)
		{
		   a[i]=sc.nextInt();
		   
		}
		a.setArray(a);
		a.show();
		
	}
}