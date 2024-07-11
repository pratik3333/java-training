package MapExamples.org;
import java.util.*;

public class RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		
		
		map.put(1, "Pratik");
		map.put(2,"kunal");
		map.put(3,"nik");
		map.put(4,"Dig");
		
		Set keys=map.keySet();
		
		
		for(Object obj:keys)
		{
			Object values=map.get(obj);
			System.out.println(values);
		}
		
		
//		
//		
//		for(Object obj:keys)
//		{
//			Object value=map.get(obj);
//			
//			System.out.println(value);
//		}

	}

}
