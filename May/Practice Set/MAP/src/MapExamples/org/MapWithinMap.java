package MapExamples.org;
import java.util.*;


public class MapWithinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,LinkedHashMap<Integer,String>> dep=new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
		
		LinkedHashMap<Integer,String> cs=new LinkedHashMap<Integer,String>();
		
		cs.put(1, "Pratik");
		cs.put(2, "Nik");
		cs.put(3, "Kunal");
		
		LinkedHashMap<Integer,String> it=new LinkedHashMap<Integer,String>();
		
		it.put(1, "abc");
		it.put(2,"sfv");
		it.put(3,"gsdf");
		
		dep.put("computer", cs);
		dep.put("IT", it);
		
		Set<Map.Entry<String, LinkedHashMap<Integer,String>>> data= dep.entrySet();
		
		
		for(Map.Entry<String, LinkedHashMap<Integer,String>> d:data)
		{
			String dname=d.getKey();
			System.out.println(dname);
			LinkedHashMap<Integer,String> studdata=d.getValue();
			
			Set<Map.Entry<Integer, String>> stud=studdata.entrySet();
			
			for(Map.Entry<Integer, String> sd:stud)
			{
				System.out.println(sd.getKey()+"\t"+sd.getValue());
			}
		}
	}

}
