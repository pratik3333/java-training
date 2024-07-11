package String.Practice.org;
import java.util.*;

public class CharactAtProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter String");
		String s=sc.nextLine();

		String st=new String(s);
		
		
		
		for(int i=0; i<st.length();i++)
		{
			char ch=st.charAt(i);
			System.out.println(ch);
		}
	}

}
