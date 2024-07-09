package practice.org;
import java.util.*;
public class ComandLineArgument {

	public static void main(String x[]) {
		// TODO Auto-generated method stub

		int r=0;
//		int no=Integer.parseInt(x[0]);
		System.out.println("Enter number");
//		  int no=Integer.parseInt(x[0]);
		
		int no=Integer.parseInt(x[0]);
		  
		
		while(no!=0)
		{
			int rem=no%10;
			 no=no/10;
			 
			 r=r*10+rem;
		}
		
		System.out.println("After reverse "+r);
	}

	
}

//
//public static void main(String x[])
//{   int r=0;
//   int no=Integer.parseInt(x[0]);
//   while(no!=0)
//   {  int rem = no % 10;
//       no  = no /10;
//       r=r*10+rem;
//   }
//System.out.println("Reverse is  "+r);
//}
