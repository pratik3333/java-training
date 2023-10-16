import java.util.Scanner;


class CheckCh
{
	char ch;
	
	void setChar(char ch)
	{
		this.ch=ch;
	}
	
	char check()
	{
		//boolean ischar= false;
		
		if(ch>=48 && ch<=57)
		{
			return true;
		}
		else
		{
			return false;
		}
		//return ischar;
	}
}

public class CheckChar
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter single Character");
		
		char ch=sc.nextLine().charAt(0);
		
		CheckCh ck=new CheckCh();
		boolean ischar=ck.CheckCh();
		ck.setChar(ch);
		ischar=ck.check();
		System.out.println(ischar);
	}
}