import java.util.Scanner;

class Freq
{
	int a[];
	int count=1;
	
	
	void setData(int a[])
	{
		
		this.a=a;
	}
	
	void display()
	{
		int flag=1;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					 a[j]=-1;
				}
				
			}
			if(a[i]!=-1)
			{
			   System.out.printf("%d----%d\n",a[i],count);
               count=1;			   
			}
		}
	}
}

public class Frequency
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		Freq fr=new Freq();
		fr.setData(a);
		fr.display();
	}
}