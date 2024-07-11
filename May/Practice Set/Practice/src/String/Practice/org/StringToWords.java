package String.Practice.org;
import java.util.*;

public class StringToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		String s=new String(str);
		
		String []words=s.split(" ");
		
		for(int i=0; i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}

}
