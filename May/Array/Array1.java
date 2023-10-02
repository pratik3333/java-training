import java.util.*;

class Array1
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five values in Array");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Values");
		for(i=0; i<a.length; i++)
		{
			System.out.printf("a[%d]--->%d\n",i,a[i]);
		}
	}
}