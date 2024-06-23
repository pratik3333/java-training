package Demo.org;
import java.util.*;

class MyComparatorr implements Comparator
{
	 public int compare(Object obj1, Object obj2)
	 {
		 String s1=(String)obj1;
		 String s2=(String)obj2;
		 
		 return -s1.compareTo(s2);
	 }
}






public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet t=new TreeSet(new MyComparatorr());
		System.out.println("Enter 3 names");
		for(int i=0; i<3; i++)
		{
			String s=sc.nextLine();
			t.add(s);
			
		}

		System.out.println(t);
	}

}
