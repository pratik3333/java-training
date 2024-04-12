package StringApp;
import java.util.*;



public class ToggleCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string here...");
		String str=sc.nextLine();
		
		
		char ch[]=str.toCharArray();
		
		//char ch1;
		for(int i=0; i<ch.length; i++)
		{
			
			if(ch[i]>='a' && ch[i]<='z' && ch[i]!=' ')
			{
			ch[i]=(char) (ch[i]-32);
			 }
			else if(ch[i]>='A' && ch[i]<='Z' && ch[i]!=' ')
			{
				ch[i]=(char) (ch[i]+32);
				
			}
			
		}
		String str1=new String(ch);
		System.out.println(str1);
		
		
		
	}

	

}
