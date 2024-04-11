package StringApp;
import java.util.*;



public class ToggleCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string here...");
		String str=sc.nextLine();
		
		String str1;
		//char ch1;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' && ch!=' ')
			{
	
				
			 	//int ch1=parseInt(ch);
				int ch1=parseInt(ch);
				
				char chh=ParseString(ch1);
			 	
			 	
			 	System.out.println("After Conversion "+ chh);
				
				
				
	
			}
		
			
		}
		
	}

	private static char ParseString(int ch1) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static char parseInt(char ch) {
		// TODO Auto-generated method stub
		return 0;
	}

}
