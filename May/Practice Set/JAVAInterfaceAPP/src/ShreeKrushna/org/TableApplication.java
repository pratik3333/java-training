//Write a program to prompt the user to enter any number and print its 
//multiplication table


package ShreeKrushna.org;
import java.util.*;

public class TableApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int no=sc.nextInt();
		
		System.out.println("Table of given number is ");
		for(int i=1; i<=10; i++)
		{
			System.out.println(no*i);
		}

	}

}
