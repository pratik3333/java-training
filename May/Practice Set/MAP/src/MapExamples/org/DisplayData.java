package MapExamples.org;
import java.util.*;

public class DisplayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,Module> map=new LinkedHashMap<Integer,Module>();
		
		map.put(11, ("pratik","kor",340));
//		map.put(1, "pratik");
//		map.put(2, "prati");
//		map.put(3, "pratk");
//		map.put(4, "praik");
//		map.put(5, "prtik");
//		map.put(6, "patik");


		Set<Map.Entry<Integer,Module>> data=map.entrySet();
		
		for(Map.Entry<Integer,Module> v:data)
		{
			System.out.println(v.getKey()+"\t"+v.getValue());
		}

	}

}
