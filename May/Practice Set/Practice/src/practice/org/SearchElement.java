package practice.org;
import java.util.*;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		
		
		System.out.println("Enter five values in Vector");
		for(int i=0; i<5; i++)
		{
			int no=sc.nextInt();
			v.add(no);
		}
		
		System.out.println("Enter number for Searching");
		
		int snumber=sc.nextInt();
		
		if(v.contains(snumber))
		{
			System.out.println("Data found");
		}
		else
		{
			System.out.println("Data not found");
		}

	}

}
