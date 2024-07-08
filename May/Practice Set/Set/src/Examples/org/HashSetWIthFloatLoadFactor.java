//we want to create HashSet Collection which contain 5 values and display it.
package Examples.org;
import java.util.*;
public class HashSetWIthFloatLoadFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet(10,0.5f);
		
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		hs.add(700);
		hs.add(800);
		hs.add(900);
		hs.add(1100);
		hs.add(2200);
		hs.add(3300);
		
		System.out.println(hs);
		
		Iterator i=hs.iterator();
				
				while(i.hasNext())
				{
					Object obj=i.next();
					
					System.out.println(obj);
				}

	}

}
