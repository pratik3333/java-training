package ShreeKrushna.org;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number here..");
		int no=sc.nextInt();
		int temp=0;
		int rev=0;
		while(no!=0)
		{
//			
		  temp=no%10;
			
			rev=rev*10+temp;
			no=no/10;
		}
		
		System.out.println("After reverse number " + rev);
	}

}
