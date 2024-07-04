package TestingC.org;
import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		
		System.out.println("Enter how many number you want to add");
		int range=sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0; i<range; i++)
		{
			int no=sc.nextInt();
			al.add(no);
			
		}
		
		System.out.println("Before sorting");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		
		
		Collections.sort(al);
		System.out.println("After Sorting");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
	}

}
