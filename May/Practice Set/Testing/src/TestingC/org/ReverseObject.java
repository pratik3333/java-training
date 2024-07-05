package TestingC.org;
import java.util.*;

public class ReverseObject {
	
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(250);
		al.add(400);
		
		
		System.out.println("Before reverse");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		Collections.reverse(al);
		
		
		System.out.println("After reverse");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		
		
	}
	

}
