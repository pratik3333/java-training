package TreeSetExamples;
import java.util.*;
public class ArrangeInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet treeset=new TreeSet();
		
		treeset.add(100);
		treeset.add(70);
		treeset.add(120);
		treeset.add(500);
		treeset.add(230);
		treeset.add(10);
		treeset.add(87);
		
//		NavigableSet nav=treeset.descendingSet();
		
		for(Object obj:treeset)
		{
			System.out.println(obj);
		}

	}

}
