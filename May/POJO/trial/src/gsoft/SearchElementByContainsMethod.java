package gsoft;
import java.util.*;
public class SearchElementByContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many elements you wants to add");
		int limit=sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0; i<limit; i++)
		{
			int value=sc.nextInt();
			al.add(value);
		}
		
		System.out.println("Enter search element");
		int selement=sc.nextInt();
		boolean b=al.contains(selement);
		
		if(b)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
