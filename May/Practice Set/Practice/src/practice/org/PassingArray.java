package practice.org;
import java.util.*;

class Show
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
		
	}
	
	public void showArray()
	{
		System.out.println("Show array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
}

public class PassingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter array values");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Show s=new Show();
		s.setArray(a);
		s.showArray();
		
	}

}
