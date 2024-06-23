package practice.org;
import java.util.*;

public class ListIterator_previous_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		v.add(345);
		
		ListIterator li=v.listIterator(v.size());
		
		while(li.hasPrevious())
		{
			Object obj=li.previous();
			
			System.out.println(obj);
		}
		

	}

}
