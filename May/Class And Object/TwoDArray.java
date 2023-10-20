
//Two D array
import java.util.Scanner;

class Arr
{
	int a[][];
	
	void setArray(int a[][])
	{
		this.a=a;
	}
	
	void display()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class TwoDArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		Arr ar=new Arr();
		ar.setArray(a);
		ar.display();
	}
}