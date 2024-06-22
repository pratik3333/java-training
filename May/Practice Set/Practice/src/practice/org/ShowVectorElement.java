package practice.org;
import java.util.*;
public class ShowVectorElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v=new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
			
		}
	}

}
