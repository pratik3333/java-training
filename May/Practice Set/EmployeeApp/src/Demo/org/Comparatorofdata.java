package Demo.org;
import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			
			return -i1.compareTo(i2);
			
//			if(i1<i2)
//			{return +1;
//			}
//			else if(i1>i2)
//			{
//				return -1;
//			}
//			else 
//			{
//				return 0;
//			}
		
		
	}
}
public class Comparatorofdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(12);
		t.add(10);
		t.add(2);
		t.add(345);
		t.add(34);
		t.add(5343);
		System.out.println(t);
	}

}
