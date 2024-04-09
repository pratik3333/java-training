package StringApp;
import java.util.*;

public class CopyStringWithoutUsingInbuldFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string here:--- ");
		String str=sc.nextLine();
		
		String s="";
		
		//s.=str.toCharArray();
		s=str;
		
		System.out.println("Second string is "+s);
		
	}

}
