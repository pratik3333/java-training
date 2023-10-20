import java.util.Scanner;

class Taker
{
	int a[];
	int no;
	
	void setData(int a[],int no)
	{
		this.a=a;
		this.no=no;
	}
	void display()
	{
		no=no-1;
		int b[]=new int[a.length];
		int j=0;
		for(int i=no; i>=0; i--)
		{
			b[j]=a[i];
			j++;
		}
		//System.out.println");
		for(int i=no+1; i<a.length; i++)
		{
			b[j]=a[i];
			j++;
		}
		
		a=b;
		System.out.println("Display array after rotation");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(i+"----"+a[i]);
		}
	}
}

public class Rotation
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter from which position you want to rotate array");
		int no=sc.nextInt();
		
		Taker tk=new Taker();
		tk.setData(a,no);
		tk.display();
	}
}