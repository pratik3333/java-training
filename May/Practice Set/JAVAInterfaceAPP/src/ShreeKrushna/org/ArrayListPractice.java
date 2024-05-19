package ShreeKrushna.org;
import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.remove("20");
		al.add(1, 2222);
		boolean b=al.isEmpty();
		al.add(60);
		ArrayList<Integer> nl=new ArrayList<Integer>();
		nl.add(333);
		nl.add(888);
		nl.add(977);
		
		al.addAll(3, nl);
		
		System.out.println(b);
		
		Iterator i= al.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}

	}

}
