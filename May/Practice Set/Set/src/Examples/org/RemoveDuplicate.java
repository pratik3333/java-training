// Create ArrayList Collection and remove duplicated from ArrayList?

package Examples.org;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(300);
		al.add(200);
		al.add(400);
		al.add(600);
		al.add(400);
		
		System.out.println("Before removing duplicate elements");
		
		Collections.sort(al);
		for(Object obj:al)
		{
			Object n=(Object)obj;
			
			System.out.println(n);
		}
		HashSet hs=new HashSet(al);
		
		al.clear();
		al.addAll(hs);
		
		System.out.println("After removing duplicate elements");
		Collections.sort(al);
		for(Object obj:al)
		{
			Object n=(Object)obj;
			
			System.out.println(n);
		}

	}

}
