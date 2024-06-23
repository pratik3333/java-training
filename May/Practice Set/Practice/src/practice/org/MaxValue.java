package practice.org;
import java.util.*;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		v.add(100);
		v.add(50);
		v.add(330);
		v.add(5555);
		v.add(150);
		v.add(450);
		
		Iterator i=v.iterator();
		
		int max=v.indexOf(0);
		
		while(i.hasNext())
		{
			Integer obj=(Integer)i.next();
			if(obj>max)
			{
				max=obj;
			}
		}
		System.out.println("Maximum value is "+max);
		
	}

}
