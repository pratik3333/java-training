package StringApp;
import java.util.*;

public class UpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here");
		String s=sc.nextLine();
		
		System.out.println("Before conversion "+s);
		
		String s1=s.toUpperCase();
		System.out.println("After conversion of string " + s1);
		

	}

}
