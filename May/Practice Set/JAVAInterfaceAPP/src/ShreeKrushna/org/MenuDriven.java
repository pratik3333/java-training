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
		
		int count=0;
		
		switch(choice)
		{
		case 1:
			 count=0;
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
			
			 count=0;
			 int te=no;
			 int tempno=no;
			 while(no!=0)
			 {
				 no=no/10;
				 count++;
			 }
			 int sum=0;
			 
			 no=tempno;
			 int s1=0;
			 
			 while(no!=0)
			 {
				 int rem=no%10;
				 no=no/10;
				 sum=1;
				 
				 for(int i=1; i<=count; i++)
				 {
//					 System.out.println("rem is "+rem);
					 sum =(rem*sum);
//					 System.out.println("i am checking sum of every number "+sum);
				 }
				 
				 s1=sum+s1;
			 }
			 
			 if(s1==te)
			 {
				 System.out.println("Number is armstrong number");
			 }
			 else
			 {
				 System.out.println("Number is not armstrong number");
			 }
			break;
		
		
		}
	}

}
