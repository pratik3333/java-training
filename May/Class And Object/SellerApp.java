import java.util.Scanner;

class Checker
{
	private int s;
	private int c;
	int n;
	
	void setData(int s,int c)
	{
		this.s=s;
		this.c=c;
	}
	void display()
	{
		if(s>c)
		{
			n=s-c;
			System.out.println("Your profit is "+ n + " Ruppes.");
		}
		else if(s<c)
		{
			n=c-s;
			System.out.println("Your loss is "+ n + " Ruppes.");
		}
		else
		{
			System.out.println("No profit No loss.");
		}
	}
}

public class SellerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int s,c;
		System.out.println("Enter the Cost price");
		c=sc.nextInt();
		
		System.out.println("Enter the selling price");
		s=sc.nextInt();
		
		Checker ck=new Checker();
		ck.setData(s,c);
		ck.display();
	}
}