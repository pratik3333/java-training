package StringApp;
import java.util.*;



public class ToggleCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string here...");
		String str=sc.nextLine();
		
		String str1;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' && ch!=' ')
			{
	
				
			// 	char ch1=parseInt(ch);
				
				char ch1=parseInt(ch);
				
				System.out.println(char(ch1-32));
	
			}
		
			
		}
		
	}

	private static char parseInt(char ch) {
		// TODO Auto-generated method stub
		return 0;
	}

}
