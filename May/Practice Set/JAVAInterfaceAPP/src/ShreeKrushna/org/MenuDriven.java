package ShreeKrushna.org;
import java.util.*;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number here...");
		int no=sc.nextInt();
		
		System.out.println("Enter 1 for checking given number is prime or not");
		System.out.println("Enter 2 for checking given number is armstrong number or not");
		System.out.println("Enter 3 for checking given number is Strong number or not");
		System.out.println("Enter 4 for checking given number is perfect number or not");
		System.out.println("Enter 5 for checking given number is Duck number or not");
		
		
		int choice=sc.nextInt();
		
		
		System.out.println();
		System.out.println();
		
		
		switch(choice)
		{
		case 1:
			int count=0;
			for(int i=2; i<no; i++)
			{
				if(no%i==0)
				{
					count=1;
					break;
				}
			}
			if(count==1)
			{
				System.out.println("Number is not prime number");
			}
			else
			{
				System.out.println("Number is prime number");
			}
			break;
			
		case 2:
			break;
		
		
		}
	}

}
