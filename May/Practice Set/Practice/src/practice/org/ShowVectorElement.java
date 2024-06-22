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
		int sum=0;
		
		while(i.hasNext())
		{
			Integer obj=(Integer)i.next();
			
			System.out.println(obj);
			sum=sum+obj;
			
		}
		System.out.println("TOtal sum is "+sum);
	}

}
