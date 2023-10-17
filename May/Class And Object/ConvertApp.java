//WAP to convert array into Lower case to upper case

import java.util.Scanner;

class Convert 
{
	char ch[];
	
	void setChar(char ch[])
	{
		this.ch=ch;
	}
	
	char []getChar()
	{
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)((int) ch[i]-32);
			}
		}
		return ch;
	}
}

public class ConvertApp
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
		
		Convert c1=new Convert();
		c1.setChar(ch);
		
		char []result=c1.getChar();
		System.out.println("Display Array values after conversion");
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}