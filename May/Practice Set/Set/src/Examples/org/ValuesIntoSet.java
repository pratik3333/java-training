package Examples.org;
import java.util.*;

public class ValuesIntoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add("p");
		al.add("r");
		al.add("a");
		al.add("t");
		al.add("i");
		al.add("k");
		
		HashSet sh=new HashSet(al);
		
		System.out.println(sh);
		
		

	}

}
