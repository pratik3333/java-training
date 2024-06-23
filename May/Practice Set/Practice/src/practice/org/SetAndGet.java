package practice.org;
import java.util.*;
public class SetAndGet {

	public static void main(String[] args)throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		
		Object obj=al.get(3);
		System.out.println("Element is " + obj);
		
		al.remove(3);
		
		al.set(3, 4444);
		
		
		System.out.println(al);

	}

}
