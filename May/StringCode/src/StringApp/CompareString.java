package StringApp;
import java.util.*;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first String");
		String s=sc.nextLine();
		
		System.out.println("Enter second string");
		String s1=sc.nextLine();
		
		int f=s.compareTo(s1);
		
		if(f!=0)
		{
			System.out.println("Both Strings are Diffrent");
		}
		else
		{
			System.out.println("Both strings are same");
		}
	}

}
