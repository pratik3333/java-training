import java.util.Scanner;

class Logic
{
	private int a[];
	private int index;
	private int value;
	void setArray(int a[],int index,int value)
	{
		this.a=a;
		this.index=index;
		this.value=value;
	}
	
	void display()
	{
		for(int i=a.length-2; i>=0; i--)
		{
			if(index!=i)
			{
				a[i+1]=a[i];
			}
			else
			{
				a[i+1]=a[i];
				break;
			}
		}
		a[index]=value;
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}

class InsertElement
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter values in array");
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter on which index you want fill value");
		int index=sc.nextInt();
		
		System.out.println("Enter Value");
		int value = sc.nextInt();
		
		Logic lg=new Logic();
		
		lg.setArray(a,index,value);
		lg.display();
	}
}