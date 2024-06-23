package practice.org;
import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		v.add(120);
		v.add(123);
		v.add(30);
		v.add(44);
		v.add(60);
		v.add(125);
		
		for(int i=0; i<v.size(); i++)
		{
			for(int j=0; j<v.size(); j++)
			{
				Object prev=v.get(i);
				Object next=v.get(j);
				
				if((int) prev<(int) next)
				{
					v.set(i, next);
					v.set(j, prev);
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(v);

	}

}
