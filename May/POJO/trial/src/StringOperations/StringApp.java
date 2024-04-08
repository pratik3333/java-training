
package StringOperations;

import java.util.*;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here:--");
		String s=sc.nextLine();
		int alpha=0;
		int digi=0;
		int spch=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>=48 && ch<=57)
			{
				digi++;
			}
			else if((ch>=97 && ch<=122)||(ch>=65 && ch<=91))
           {
        	   alpha++;
           }
           else
           { spch++;
           }
		}
		
		System.out.println("Digit in this String is "+ digi);
		System.out.println("Alphabet in this String is "+ alpha);
		System.out.println("Special Character in this String is "+ spch);
		
	}

}
