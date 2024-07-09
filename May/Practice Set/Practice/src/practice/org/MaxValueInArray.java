package practice.org;
import java.util.*;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter five values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum value is " +max);
				

	}

}
