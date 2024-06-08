package Demo.org;
import java.util.*;

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet();
		
		t.add("D");
		t.add("M");
		t.add("10");
		t.add("f");
		t.add("F");  //it is work through ToCompare() method
		System.out.println(t);
	}

}
