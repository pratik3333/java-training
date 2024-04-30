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
			
		case 3:
			int tsum=0;
			int fsum=0;
			
			int temno=no;
			
			while(no!=0)
			{
				int rem=no%10;
//				System.out.println("rem is "+rem);
				no=no/10;
				tsum=1;
				for(int i=1; i<=rem;i++)
				{
					tsum=tsum*i;
				}
				fsum=tsum+fsum;
//				System.out.println("Final sum is inside while"+fsum);
			}
//			System.out.println("Final sum is ouside while"+fsum);
			if(fsum==temno)
			{
				System.out.println("Number is strong number");
			}
			else
			{
				System.out.println("Number is not strong number");
			}
			break;
			
		case 4:
			int frtemp=no;
			int frsum=0;
			for(int i=1; i<no; i++)
			{
				if(no%i==0)
				{
					//System.out.println("devided i is "+i);
					frsum=i+frsum;
				}
			}
			
			//System.out.println("final sum is "+frsum);
			if(frsum==frtemp)
			{
				System.out.println("Number is perfect number");
			}
			else
			{
				System.out.println("Number is not perfect number");
			}
			break;
			
		case 5:
			int fitemp=no;
			int fd=0;
			while(no!=0)
			{
				int rem=no%10;
				if(rem==0)
				{
//					System.out.println("number is duck number");
					fd=1;
					break;
				}
				no=no/10;
			}
			if(fd==1)
			{
				System.out.println("given number is duck number");
			}
			else
			{
				System.out.println("Given number is not duck number");
			}
			break;
		
		
		}
	}

}
