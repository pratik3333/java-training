package StringApp;
import java.util.*;

public class CopyStringUsingInbuldFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here");
		String str=sc.nextLine();
		
		String str1="";
		
		str1=String.copyValueOf(str.toCharArray());
		
		System.out.println("Second string is "+ str1);
	}

}
