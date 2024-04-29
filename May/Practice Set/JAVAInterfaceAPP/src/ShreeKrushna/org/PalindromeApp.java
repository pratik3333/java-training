package ShreeKrushna.org;
import java.util.*;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		
		int tempno=no;
		int rev=0;
		
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			rev=rev*10+rem;
			
		}
		if(tempno==rev)
		{
			System.out.println("Number is palindrome number");
			
		}
		else
		{
			System.out.println("Number is not palindrome number");
		}
		
		
	}

}
