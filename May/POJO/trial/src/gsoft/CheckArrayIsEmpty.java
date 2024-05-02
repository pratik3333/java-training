package gsoft;
import java.util.*;

public class CheckArrayIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		boolean b=al.isEmpty();
		
		if(b)
		{
			System.out.println("Array set is Empty");
		}
		else
		{
			System.out.println("Array set is not Empty");
		}

	}

}
