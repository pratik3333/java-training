import java.util.Scanner;

class Rotation
{
	int a[];
	int index;
	int temp;
	void setData(int a[],int index)
	{
		this.a=a;
		this.index=index;
	}
	
	void getData()
	{
		
		for(int i=0; i<=index; i++)
		{
			temp=a[0];
			for(int j=0; j<a.length-1; j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		System.out.println("Display Array values after rotation");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
	}
}

public class Rotate
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Rotation ro =new Rotation();
		
		int a[]=new int[5];
		System.out.println("Enter array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter index");
		int index=sc.nextInt();
		ro.setData(a,index);
		ro.getData();
	}
}