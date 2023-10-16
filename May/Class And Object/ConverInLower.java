import java.util.Scanner;

class ConvertLower
{
	char ch[];
	
	void setArray(char ch[])
	{
		this.ch=ch;
	}
	char[] convertInLower()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]<=90 && ch[i]>=65)
			{
				ch[i]=(char)((int)ch[i]+32);
				
			}
		}
		return ch;
	}	
}

public class ConverInLower
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch[]=new char[5];
		System.out.println("Enter character array values");
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		
		ConvertLower cl=new ConvertLower();
		cl.setArray(ch);
		cl.convertInLower();
		System.out.println("Dispplay after conversion");
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}