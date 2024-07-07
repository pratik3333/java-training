package Examples.org;
import java.util.*;
public class CopyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		HashSet hs=new HashSet(al);
		
		System.out.println(hs); //we are printing set
		
//		for(Object obj:hs) //and here we are printing one by one values
//		{
//			Object n=(Object)obj;
//			
//			System.out.println(n);
//		}

	}

}
