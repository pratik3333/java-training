package MapExamples.org;
import java.util.*;

public class MapWithinMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,LinkedHashMap<Integer,String>> map=new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
		
		LinkedHashMap<Integer,String> cs=new LinkedHashMap<Integer,String>();
		
		cs.put(1, "pratik");
		cs.put(2, "prati");
		cs.put(3, "prat");
		cs.put(4, "pra");

		LinkedHashMap<Integer,String> entc=new LinkedHashMap<Integer,String>();
		entc.put(1,"kunak");
		entc.put(2, "amar");
		entc.put(3,"chetan");
		entc.put(4,"sham");
		
		map.put("Electric", entc);
		map.put("Computer", cs);
		
		Set<Map.Entry<String, LinkedHashMap<Integer,String>>> data = map.entrySet();
		
		for(Map.Entry<String, LinkedHashMap<Integer,String>> d:data)
		{
			String dname=d.getKey();
			System.out.println(dname);
			LinkedHashMap<Integer,String> n=d.getValue();
			
			Set<Map.Entry<Integer, String>> sdata=n.entrySet();
			
			for(Map.Entry<Integer, String> k:sdata)
			{
				System.out.println(k.getKey()+"\t"+k.getValue());
			}
		}
	}

}
