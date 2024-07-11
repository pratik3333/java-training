package practice.org;
import java.util.*;

public class DisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter values in array");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
