package StringApp;
import java.util.*;

class LengthStr
{
	String st="";
	
	void stringFindLength(String str)
	{
		this.st=str;
		
		char []ch=st.toCharArray();
		
		int count=0;
		for(int i=0; i<st.length(); i++)
		{
			count++;
		}
		System.out.println("Length of string is " + count);
		
		
	}
	
}



public class LengthOfStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:--");
		String str=sc.nextLine();
		
		LengthStr ls=new LengthStr();
		ls.stringFindLength(str);
		
	}

}
