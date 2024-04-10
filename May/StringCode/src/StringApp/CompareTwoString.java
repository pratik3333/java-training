//WAP to comapre two string

package StringApp;
import java.util.*;

public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String:--");
		String str=sc.nextLine();
		
		System.out.println("Enter Second string:--");
		String str1=sc.nextLine();
		
		int p=str.compareTo(str1);
		
		if(p!=0)
		{
			System.out.println("Strings are not equal");
		}
		else
		{
			System.out.println("Strings are equal");
		}
		
	}

}
