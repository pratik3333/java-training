package practice.org;
import java.util.*;

class Sum
{
	int s=0;
	
	public void setValue(int ...x)
	{
		for(int i=0; i<x.length; i++)
		{
			s=s+x[i];
		}
		System.out.println("Sum of all element is "+s);
	}
}

public class MethodWithVariableArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
//		int a[]=new int[5];
		
		Sum sm=new Sum();
		sm.setValue(10,20,30,40,50);
//		a= {1,2,3,4,5};
	}

}
