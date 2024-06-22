package practice.org;
import java.util.*;
public class CopyCollectionIntoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(200);
		al.add(100);
		al.add(300);
		al.add(500);
		al.add(600);
		
		Vector v=new Vector(al);
		
		System.out.println(v);

	}

}

//[200, 100, 300, 500, 600]
