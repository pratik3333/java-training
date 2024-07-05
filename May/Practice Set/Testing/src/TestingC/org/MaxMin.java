package TestingC.org;
import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList al=new ArrayList();
		
		System.out.println("how many elements you want to add");
		int element=sc.nextInt();
		
		System.out.println("Enter values");
		for(int i=0; i<element; i++)
		{
			int v=sc.nextInt();
			al.add(v);
		}
		
		
		Object maxValue=Collections.max(al);
		Object minValue=Collections.min(al);
		
		System.out.println("Maximum value is "+maxValue);
		System.out.println("Minimum value is "+minValue);
	}

}
