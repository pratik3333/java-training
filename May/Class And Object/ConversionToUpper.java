import java.util.Scanner;

class Convert
{
	char ch[];
	
	void setData(char ch[])
	{
		this.ch=ch;
	}
	void display()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]<=122 && ch[i]>=97)
			{
				ch[i]=(char)((int) ch[i]-32);
			}
		}
		
		System.out.println("Display after conversion");
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i] + "\t");
		}
	}
}

class ConversionToUpper
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		System.out.println("Enter character array");
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		
		Convert cr=new Convert();
		cr.setData(ch);
		cr.display();
	}
}