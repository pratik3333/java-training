package gsoft;

import java.util.*;

public class ArrayListVCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList al= new ArrayList();

		System.out.println("How many elements you wants to add in array");
		int limit=sc.nextInt();
		
		System.out.println("Enter values in array");
		
		for(int i=0; i<limit; i++)
		{
			int value=sc.nextInt();
			al.add(value);
		}
		
		Iterator i=al.iterator();
		
		System.out.println("Show array values");
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
	}

}
