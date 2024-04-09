package StringApp;
import java.util.*;


public class StringConcatUsingInbuildFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here:---");
		String str=sc.nextLine();
		
		System.out.println("Enter Second String");
		String str1=sc.nextLine();
		
		String l=str.concat(" "+str1);
		System.out.println("after concat:- " + l);
	}

}
