import java.util.*;

interface ArrayTest
{
	void setArray(int a[]);
	int [] getResult();
}

class Sort implements ArrayTest
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	
	public int[] getResult()
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=(i+1); j<a.length; j++)
			{
				if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		return a;
	}

}


public class InterfaceTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		
		
		System.out.println("Enter five values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sort sr=new Sort();
		sr.setArray(a);
		
		int result[]=sr.getResult();
		
		
		System.out.println("After sorting array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}