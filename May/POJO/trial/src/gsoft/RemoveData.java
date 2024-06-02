package gsoft;
import java.util.*;

public class RemoveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		ArrayList al=new ArrayList();
		
		System.out.println("Enter how many elements you wants to add");
		int limit=sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0; i<limit; i++)
		{
			int value=sc.nextInt();
			al.add(value);
		}
		
		System.out.println("Enter which element you wants to remove");
		int re=sc.nextInt();
		
		Object b=al.remove(re);
		
		if((boolean) b)
		{
			System.out.println("Data remove succesfully");
		}
		else
		{
			System.out.println("Data not found");
		}
		
	}

}
