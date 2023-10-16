import java.util.Scanner;

class Convert
{
	char ch[];
	
	void setCharArray(char ch[])
	{
		this.ch=ch;
	}
	
	char[] convertInToUpper()
	{
		for(int i=0;i<ch.length; i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)((int) ch[i]-32);
			}
		}
		return ch;
	}
}

public class ConvertInUpper
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch[]=new char[5];
		
		System.out.println("Enter character in array");
		
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		
		Convert c=new Convert();
		c.setCharArray(ch);
		c.convertInToUpper();
		System.out.println("Display Array after conversion in Upper Case");
		for(int i=0; i<ch.length; i++)
		{
			System.out.printf("%c",ch[i]);
		}
		
	}
}
