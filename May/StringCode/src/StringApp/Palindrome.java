package StringApp;
import java.util.*;

class Pali
{
	String s="";
	
	 boolean checkStr(String s)
	{
		 this.s=s;
		int i=0, j=s.length() -1;
		
		while(i < j)
		{
			if(s.charAt(i)!=s.charAt(j))
			
				return false;
			
			i++;
			j--;
		}
		
		return true;
		
		
	}
}

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word here");
		String s=sc.next();
		Pali pl=new Pali();
		
		boolean result=pl.checkStr(s);
		
		if(result==true)
		{
			System.out.println("Palindrome string");
		}
		else
		{
			System.out.println("Not palindrome string");
		}
		
		
	}

}
