package StringApp;
import java.util.*;


public class LowerCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String here");
		String s=sc.nextLine();
		
		System.out.println("Before conversion String "+s);
		
		String s1=s.toLowerCase();
		System.out.println("After conversion String "+s1);
		
	}

}
