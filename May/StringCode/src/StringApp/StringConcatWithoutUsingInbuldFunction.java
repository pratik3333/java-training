package StringApp;
import java.util.*;

public class StringConcatWithoutUsingInbuldFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String:- ");
		String str=sc.nextLine();
		
		System.out.println("Enter Second string:-");
		String str1=sc.nextLine();
		
		String str2="";
		
		 char str3[]=str2.toCharArray();
		
        int le=str.length()	+ str1.length()	;
        
        int count=0;
        
        for(int i=0; i<str.length(); i++)
        {
        	char ch=str.charAt(i);
        	
        	str3[count]=ch;
        	count++;
        	
        }
		
        for(int i=0; i<str1.length(); i++)
        {
        	char ch=str1.charAt(i);
        	
        	str3[count]=ch;
        	count++;
        }

        System.out.println("Display third array ");
        for(int i=0; i<count; i++)
        {
        	System.out.println(str3);
        }
        
	}

}
