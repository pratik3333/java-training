package StringApp;
import java.util.*;

public class StringCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here:---");
		String s=sc.nextLine();
		
		int digi=0;
		int alpha=0;
		int spch=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch>=48 && ch<=57)
			{
				digi++;
			}
			else if((ch>=65 && ch<=91)|| (ch>=97 && ch<=122))
			{
				alpha++;
			}
			else
			{
				spch++;
			}
		}
		
		System.out.println("Number of Digit in String is "+digi);
		System.out.println("Number of Alphabet in String is "+alpha);
		System.out.println("Number of Special Character in String is "+spch);
		
	}

}
